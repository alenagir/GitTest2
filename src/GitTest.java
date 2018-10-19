import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * GitTest class created for git/github operations training. <br/>
 * Class represents array container with service methods written by students. <br/>
 *
 * @version 1.0
 * @author TAQC-149
 */
public class GitTest {

    private int[] arr = new int[100];
    private int size;

    public GitTest() {
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "GitTest{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    /**
     * Method #5.
     * Returns the maximum element of the array.
     *
     * @return int
     * @author Girenko A.
     */
    public int getMaxValue() {
        Integer integerArray[] = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            integerArray[i] = arr[i];
        }
        Arrays.sort(integerArray, Collections.reverseOrder());
        Integer max = integerArray[0];
        return max;
    }

    /**
     * Method #14.
     * Returns the module sum (XOR) of the array elements.
     *
     * @author Girenko A.
     * @return int
     */
    public int moduleSum(Integer arr[], int size) {
        int result = arr[0];
        for (int i = 1; i < size; i++) {
            result = result ^ arr[i];
        }
        return result;
    }


}
