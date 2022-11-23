package algorithms;

/**
 * Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
 * If x matches with an element, return the index.
 * If x doesn’t match with any of elements, return -1.
 */
public class LinearSearch {

    /**
     * Linear search
     *
     * @param array
     * @param element
     * @return
     */
    public int linearSearch(int array[], int element) {
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == element) {
                    return i;
                }
            }
        }
        return -1;
    }
}
