package FolderFour;

import java.util.Arrays;

public class ZadanieFour {
    public static void main(String[] args) {
        int array[];
        array = new int[10];
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            if (array[i] == 0) {
                b++;
            }

        }
        System.out.println("количество нуливых элементов" +b);
        System.out.println(Arrays.toString(array));

    }
}
