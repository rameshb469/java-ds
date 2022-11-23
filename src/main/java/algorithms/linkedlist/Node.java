package algorithms.linkedlist;

public class Node {

    Node next;

    int data;

    public Node(int data){
        this.data = data;
    }

    public Node nextNode(int data){
        this.next = new Node(data);
        return this.next;
    }

    public static void printNode(Node node){
        while (node != null){
            System.out.println(node.data+"-->");
            node = node.next;
        }
    }
}
