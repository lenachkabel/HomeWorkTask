package FolderTwo;
import java.util.Arrays;

public class ZadanieTwo {
    public static void main(String[] args) {
        int[] array;
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));

        double a = 0;
        for (int i = 0; i < array.length; i++) {
            a += array[i];
        }
        a /= array.length;

        System.out.println("Среднее арифметическое массива" +a);
    }
}
