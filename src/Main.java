public class Main {

    public static void main(String[] args) {
        GitTest gitTest = new GitTest();
        int[] array = {1, -9, 90, 46, -90};
        gitTest.setArr(array);
        gitTest.setSize(array.length);
        System.out.println(gitTest.minElement());
        System.out.println();
    }

}