package FolderOne;

import java.util.Scanner;

public class ZadanieOne {
    public static void main(String[] args) {

        Integer [] array;
        array = new Integer[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i< array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Ввести значение");
        for (int i=0; i<array.length; i++) {

            System.out.print("   " + array[i]);
        }
        System.out.println("Попробуйте еще раз");
    }
}

