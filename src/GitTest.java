import java.util.Arrays;
import java.util.Collections;

/**
 * GitTest class created for git/github operations training. <br/>
 * Class represents array container with service methods written by students. <br/>
 *
 * @author TAQC-149
 * @version 1.0
 */
public class GitTest {

    private Integer[] arr = new Integer[100];
    private int size;

    public GitTest() {
    }

    public Integer[] getArr() {
        return arr;
    }

    public void setArr(Integer[] arr) {
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
     * @author Girenko A.
     */
    public int getMaxValue() {
        Arrays.sort(arr, Collections.reverseOrder());
        int max = arr[0];
        return max;
    }

    /**
     * Method #6.
     * Returns the minimum element of the array.
     *
     * @return int
     * @author A. Nikonets
     */
    public int getMinValue() {
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * Method #16.
     * Increases all elements of the array by 2.
     *
     * @return void
     * @author A. Nikonets
     */
    public void increaseByTwo() {
        int constant = 2;
        for (int i = 0; i < size; i++) {
            arr[i] *= constant;
        }
    }

}