package algorithms.linkedlist;

import static algorithms.linkedlist.KthElementOperation.printNode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(6);
        printNode(node);
        System.out.println("after");
        printNode(reverse(node));
    }

    /**
     * Reverse the linked list
     *
     * Time complexity O(n)
     * Space Complexity O(1)
     *
     * @param head
     * @return
     */
    public static Node reverse(Node head){

        Node prevNode = null;
        Node newNode = null;
        while (head != null){
            newNode = new Node(head.data);
            newNode.next = prevNode;
            prevNode = newNode;
            head = head.next;
        }

        return newNode;
    }
}
