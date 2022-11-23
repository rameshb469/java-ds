package algorithms.linkedlist;

import static algorithms.linkedlist.Node.printNode;

public class MergeTwoLinkedList {

    public static void main(String[] args) {
        Node headOne = new Node(1);
        headOne.next = new Node(4);
        headOne.next.next = new Node(5);
        headOne.next.next.next = new Node(6);

        Node headTwo = new Node(1);
        headTwo.next = new Node(3);
        headTwo.next.next = new Node(4);

        Node headThree = new Node(-1);
        headThree.next = new Node(0);
        headThree.next.next = new Node(5);

        Node head = mergeKLists(new Node[] {headOne, headTwo, headThree});


        printNode(head);
    }

    public static Node mergeNodes(Node headOne, Node headTwo){
        Node nodeOne = headOne;
        Node nodeTwo = headTwo;
        Node prevOne = null;
        Node currentOne = nodeOne;
        Node currentTwo = nodeTwo;

        while (currentOne != null && currentTwo != null){
            if (currentOne.data < currentTwo.data){
                prevOne = currentOne;
                currentOne = currentOne.next;
            } else {
                Node tempNode = currentTwo;
                tempNode.next = currentOne;
                currentOne = tempNode;
                if (prevOne != null) {
                    prevOne.next = currentOne;
                }
                prevOne = currentOne;
                currentOne = currentOne.next;
                currentTwo = currentTwo.next;
            }
        }

        if (nodeOne == null) prevOne.next = nodeTwo;
        return nodeOne;
    }

    public static Node mergeTwoNodes(Node headOne, Node  headTwo){
        Node nodeOne = headOne;
        Node nodeTwo = headTwo;
        Node resultHead = new Node(0);
        Node resultNode = resultHead;
        while (nodeOne != null && nodeTwo != null){
            int data = 0;
            if (nodeOne.data < nodeTwo.data){
                data = nodeOne.data;
                nodeOne = nodeOne.next;
            } else {
                data = nodeTwo.data;
                nodeTwo = nodeTwo.next;
            }
            resultNode.next = new Node(data);
            resultNode = resultNode.next;
        }

        if (nodeOne == null) resultNode.next = nodeTwo;
        if (nodeTwo == null) resultNode.next = nodeOne;

        return resultHead.next;
    }

    public static Node merge(Node headOne, Node headTwo){
        Node nodeOne = headOne;
        Node nodeTwo = headTwo;
        while (nodeOne != null || nodeTwo != null){
            Node newNode = new Node(nodeTwo.data);
            if (nodeOne.data > nodeTwo.data){
                newNode.next = nodeOne;
                nodeTwo = nodeTwo.next;
            } else if (nodeOne.data < nodeTwo.data){
                nodeOne = nodeOne.next;
            } else {
                newNode = new Node(nodeTwo.data);
                Node prevNode = nodeOne.next;
                nodeOne.next = newNode;
                newNode.next = prevNode;
                nodeTwo = nodeTwo.next;
                nodeOne = nodeOne.next.next;
            }
        }
        return headOne;
    }

    public static Node mergeKLists(Node[] lists){
        Node head = new Node(1);
        Node tempNode = head;
        boolean doContinue = true;

        while (doContinue){
            int tempVal = Integer.MAX_VALUE;
            int index = 0;
            int nullNodes = 0;

            for (int i = 0; i < lists.length; i++) {
                Node currentNode = lists[i];
                if (currentNode == null) nullNodes++;
                if (lists.length == nullNodes) {
                    doContinue = false;
                    break;
                }

                if (currentNode != null && tempVal > currentNode.data){
                    tempVal = currentNode.data;
                    index = i;
                }
            }

            if (index < lists.length && lists[index] != null){
                tempNode.next = new Node(tempVal);
                tempNode = tempNode.next;
                lists[index] = lists[index].next;
            }
        }
        return head.next;
    }

//    public static void main(String[] args) {
//
//    }
}
