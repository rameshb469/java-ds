package algorithms.linkedlist;

public class FindingLoopOperation {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = node.next;
        System.out.println(isLoopExist(node));
    }

    /**
     * Finding the loop
     *
     * @param head
     * @return true if loop existed or else return false
     */
    public static boolean isLoopExist(Node head){
        Node first  = head;
        Node second = head;
        while (first != null && second != null && second.next != null){
            first = head.next;
            second = head.next.next;
            if (first.data == second.data) return true;
        }
        return false;
    }
}
