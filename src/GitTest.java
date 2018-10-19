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
     * Method #3.
     * Returns the sum of all elements in the array.
     *
     * @author Shcherbakova Y.
     */
    public int sum() {
        int sum = 0;
        for (int i = 0; i < size; i++){
            sum += arr[i];
        }
        return sum;
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



}
