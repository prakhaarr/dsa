/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        // List<List<Object>> ls = new ArrayList<>();
        // HashMap <Integer,Integer> mp = new HashMap<>();
        // Node temp = head;
        // int count =0;

        // while(temp!=null){
        //     temp=temp.next;
        //     count++;
        // }

        // temp = head;


        // for(int i =0;i<count;i++){
        //     mp.put(temp.val,temp.random);
        // }

        // for (Map.Entry<String, Integer> entry : mp.entrySet()) {
        //     // Create a new list to store the key and value
        //     List<Object> pair = new ArrayList<>();
        //     pair.add(entry.getKey());
        //     pair.add(entry.getValue());

        //     // Add the pair to the list of lists
        //     ls.add(pair);

            
        // }
        // System.out.println(ls);
        // temp = null;

        // return temp;
         if (head == null) {
            return null;
        }

        // Create a HashMap to map original nodes to their copies
        HashMap<Node, Node> map = new HashMap<>();

        // First pass: Create all nodes and map the original nodes to the new nodes
        Node temp = head;
        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        // Second pass: Assign next and random pointers using the map
        temp = head;
        while (temp != null) {
            Node newNode = map.get(temp);
            newNode.next = map.get(temp.next);
            newNode.random = map.get(temp.random);
            temp = temp.next;
        }

        // Return the head of the copied list
        return map.get(head);
    }
}