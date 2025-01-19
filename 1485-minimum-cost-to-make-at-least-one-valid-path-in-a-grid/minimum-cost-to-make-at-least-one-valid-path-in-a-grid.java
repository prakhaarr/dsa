import java.util.*;

class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; // Right, Left, Down, Up
        Deque<int[]> deque = new ArrayDeque<>(); // For 0-1 BFS
        int[][] cost = new int[m][n]; // To store the minimum cost to reach each cell
        for (int[] row : cost) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        // Start BFS from (0, 0)
        deque.offer(new int[]{0, 0, 0}); // {row, col, cost}
        cost[0][0] = 0;

        while (!deque.isEmpty()) {
            int[] current = deque.poll();
            int x = current[0], y = current[1], currCost = current[2];

            // If we reach the bottom-right cell, return the cost
            if (x == m - 1 && y == n - 1) {
                return currCost;
            }

            // Process all four possible directions
            for (int i = 0; i < 4; i++) {
                int newX = x + directions[i][0];
                int newY = y + directions[i][1];
                int newCost = currCost + (grid[x][y] == i + 1 ? 0 : 1);

                // Check if the new cell is within bounds and if a better cost is possible
                if (newX >= 0 && newX < m && newY >= 0 && newY < n && newCost < cost[newX][newY]) {
                    cost[newX][newY] = newCost;
                    // Use deque: prioritize free moves by adding to the front
                    if (grid[x][y] == i + 1) {
                        deque.offerFirst(new int[]{newX, newY, newCost});
                    } else {
                        deque.offerLast(new int[]{newX, newY, newCost});
                    }
                }
            }
        }

        return -1; // This should never be reached
    }
}