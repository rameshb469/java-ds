package algorithms.linkedlist;

public class ShiftingLinkedList {

    public static void main(String[] args) {

    }

    public static void shiftKthPosition(Node head, int k){

        if (k > 0){
            // forward shift and find the kth last element as new head

            Node nodeOne = head;
            Node nodeTwo = head;
            int count = 0;
            while ( count <= k ){
                nodeTwo = nodeTwo.next;
            }

            Node prevNode;
            while (nodeTwo.next != null){
                nodeTwo = nodeTwo.next;
                prevNode = nodeOne;
                nodeOne = nodeOne.next;
            }




        } else {
            // backward shift and find kth position from header add to tail
        }
    }
}
