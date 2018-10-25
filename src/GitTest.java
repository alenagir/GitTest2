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
  
     /** Method #1.
     Set values of array field by manual input from console till size count will be reached
     Manual input can be stopped by entering non numeric value

     @author Chesnokov A.
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


    /**
     * Method #4.
     * Returns the multiplication of all elements in the array.
     *
     *@return int
     * @author Tania T.
     */
    public int getMultiplicationOfValues() {
        int result = 1;
        for (int i = 0; i < size; i++){
            result *= arr[i];
        }
        return result;
    }



    /**
     * Method #14.
     * Initializes n elements of the array.
     *
     * @author Hrytsiuk A.
     */

    public int[] init(int n){

        for (int i = 0; i < n; i++){
            arr[i] =(int)(Math.random()*10);
        }
        return arr;

    }



}