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
     * Method #1.
     * Returns array of Integers after manual input from console
     * Manual input can be stopped by entering non numeric value
     * @author Chesnokov A.
     */
    public Integer[] input(int size) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] array = new Integer[size];
        int temp;
        for (int i = 0; i < size; i++) {
            try {
                temp = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Non numeric value, end of manual initialization");
                break;
            }
            array[i] = temp;
        }
        return array;
    }

    /**
     * Method #2.
     * Returns array as a string.
     *
     * @author Chesnokov A.
     */
    public String print() {
        return Arrays.toString(this.arr);
    }



}
