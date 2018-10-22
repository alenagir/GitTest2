import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    //Method casts Integer[] to int[] and set it to the GitTest.arr
    public void setArr(int[] array) {
        Integer integerArray[] = new Integer[arr.length];
        for (int i = 0; i < array.length; i++) {
            integerArray[i] = array[i];
        }
        this.arr = integerArray;
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
  
     * Method #1.
     * Set values of array field by manual input from console till size count will be reached
     * Manual input can be stopped by entering non numeric value
     *
     * @author Chesnokov A.
     */
    public void arrayInputFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int temp;
        for (int i = 0; i < 100; ) {
            try {
                temp = Integer.parseInt(reader.readLine());
                i++;
            } catch (NumberFormatException e) {
                System.out.println("Non numeric value, end of manual initialization");
                break;
            }
            this.arr[i] = temp;
        }

    }

    /**
     * Method #2.
     * Returns array field of GitTest as a string.
     *
     * @return String
     * @author Chesnokov A.
     */
    public String arrayFieldAsString() {
        return Arrays.toString(this.arr);
    }

    
}
