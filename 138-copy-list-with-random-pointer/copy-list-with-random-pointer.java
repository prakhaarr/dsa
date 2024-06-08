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

        if (head == null) {
        return null;
    }

    Node temp = head;

    // Step 1: Create copy nodes and interleave them with original nodes
    while (temp != null) {
        Node copyNode = new Node(temp.val);
        copyNode.next = temp.next;
        temp.next = copyNode;
        temp = copyNode.next;
    }

    temp = head;

    // Step 2: Set the random pointers of the copy nodes
    while (temp != null) {
        if (temp.random != null) {
            temp.next.random = temp.random.next;
        }
        temp = temp.next.next;
    }

    Node dummyNode = new Node(-1);
    Node result = dummyNode;
    temp = head;

    // Step 3: Separate the interleaved lists
    while (temp != null) {
        result.next = temp.next;
        temp.next = temp.next.next;
        result = result.next;
        temp = temp.next;
    }

    return dummyNode.next;


















        //  if (head == null) {
        //     return null;
        // }

        // // Create a HashMap to map original nodes to their copies
        // HashMap<Node, Node> map = new HashMap<>();

        // // First pass: Create all nodes and map the original nodes to the new nodes
        // Node temp = head;
        // while (temp != null) {
        //     map.put(temp, new Node(temp.val));
        //     temp = temp.next;
        // }

        // // Second pass: Assign next and random pointers using the map
        // temp = head;
        // while (temp != null) {
        //     Node newNode = map.get(temp);
        //     newNode.next = map.get(temp.next);
        //     newNode.random = map.get(temp.random);
        //     temp = temp.next;
        // }

        // // Return the head of the copied list
        // return map.get(head);


    }
}
