package algorithms;

/**
 * We basically ignore half of the elements just after one comparison.
 *
 * Compare x with the middle element.
 * If x matches with the middle element, we return the mid index.
 * Else If x is greater than the mid element, then x can only lie in the right half subarray after the mid element. So we recur for the right half.
 * Else (x is smaller) recur for the left half.
 *
 * time complexity to O(Log n).
 *
 */
public class BinarySearch {

    /**
     * recursive way of doing binary search
     *
     * @param array
     * @param left
     * @param right
     * @param element
     * @return
     */
    public int binarySearch(int array[], int left, int right, int element){
        if (left <= right) {
            int mid = (left+right)/2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] > element) {
                return binarySearch(array, left, mid-1, element);
            } else {
                return binarySearch(array, mid+1, right, element);
            }
        }
        return -1;
    }

    /**
     * iteration way of doing
     *
     * @param array
     * @param element
     * @return
     */
    public int binarySearch(int array[], int element){
       int left = 0, right = array.length;

       while (left <= right) {
           int mid = (left+right)/2;
           if (array[mid] == element) {
               return mid;
           } else if (array[mid] > element) {
               right = mid-1;
           } else {
               left = mid+1;
           }
       }
       return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 40;

        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}
