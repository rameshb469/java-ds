package algorithms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TestApp {

    public static void main(String[] args) {
        System.out.println(findMax(new Integer[]{1, 5, 24, 6, 4, 7, 10}, 3));;
    }

    public static boolean isPowerOf2(int n) {
        if (n% 2 == 0) {
            if (n != 2) {
                n = n/2;
                return isPowerOf2(n);
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param array
     * @param n
     * @return
     */
    static int findMax(Integer[] array, int  n) {
        if (n < 0) {
            throw new RuntimeException("Please provide the valid number");
        }
        if (array != null && array.length > 0){
            Arrays.sort(array, (a,b) -> (b-a));
            System.out.println("before sorting"+array);
            return array[n-1];
        }
        return 0;
    }
}
