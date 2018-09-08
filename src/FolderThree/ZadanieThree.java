package FolderThree;
import java.util.Arrays;
public class ZadanieThree {
    public static void main(String[] args) {
        int array[];
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println(Arrays.toString(array));

            int temp = array[0];
            array[0] = array[9];
            array[9] = temp;
        }
        System.out.println(array[0]);
        System.out.println(array[9]);
    }

}
