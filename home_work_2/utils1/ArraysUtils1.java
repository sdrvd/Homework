package home_work_2.utils1;

import java.util.Arrays;

public class ArraysUtils1 {
    public static void main(String[] args) {

        int book[] = ArraysUtils.arrayFromConsole();

        ArrayPrint(book);
        ReverseArrayPrint(book);
        AnySecondArrayPrint(book);


    }

    public static String ArrayPrint(int container[]){
        String str1 = Arrays.toString(container);
        System.out.println(str1);
        return str1;
    }

    public static String ReverseArrayPrint(int container[]){
        int k = 0;
        int j = 0;

        for (int i = container.length; i >= 0; i--) {
            k++;
        }

        int utilita1[] = new int[k-1];

        for (int i = container.length-1; i >= 0 ; i--) {
        utilita1[j] = container[i];
            if(i % 2 != 0) {
                utilita1[j] = container[i];
            }
        j++;
        }

        String str1 = Arrays.toString(utilita1);
        System.out.println(str1);
        return str1;
    }
    public static String AnySecondArrayPrint(int container[]) {

        int k = 0;
        int j = 0;


        for (int i = container.length; i >= 0; i--) {
            if (i % 2 != 0) {
                k++;
            }
        }

        int utilita1[] = new int[k];

        for (int i = 0; i < container.length; i++) {
            if (i % 2 != 0) {
                utilita1[j] = container[i];
                j++;
            }
        }
        String str1 = Arrays.toString(utilita1);
        System.out.println(str1);
        return str1;
    }
}
