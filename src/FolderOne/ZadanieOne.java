package FolderOne;

import java.util.Arrays;
import java.util.Scanner;

public class ZadanieOne {
    public static void main(String[] args) {

        Integer[] array;
        array = new Integer[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Ввести значение");
        for (int i = 0; i < array.length; i++) {
            do {
                {
                    if (scanner.hasNextInt()) {
                        array[i] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("ввод не коректный. Попробуйте еще раз");
                        scanner.next();
                    }
                }

                System.out.print("В итоге получится массив");
                System.out.println(Arrays.toString(array));
            }
            while (true) ;
        }
    }
}

