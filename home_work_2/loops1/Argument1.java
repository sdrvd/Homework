package home_work_2.loops1;


import java.util.Arrays;

public class Argument1 {
    public static void main(String[] args) {
        int g = Integer.parseInt(args[0]);
        int Array1[] = Split(g);
        int p = Array1[0];

        for (int i = 0; i < Array1.length; i++) {
            System.out.print(Array1[i]);
            if(i != Array1.length-1){
                System.out.print(" * ");
            }
        }

        for (int i = 0; i < Array1.length; i++) {
            p = p * Array1[i];
        }
        System.out.print(" = " + p);
    }

    public static int[] Split(int number) {
        int k = 0;
        int j = 0;
        int q = 0;
        int number1 = number;

        for (; number1 > 0; number1 /= 10) {
            k++;
        }

        int utilita1[] = new int[k];

        for(int i = 0; i < utilita1.length; i++) {
            j = number % 10;
            number /= 10;
            utilita1[i] = j;
        }

        int utilita2[] = new int[k];

        for (int i = 0; i < utilita2.length; i++) {
            utilita2[i] = utilita1[k-1];
            k--;
        }

        String str1 = Arrays.toString(utilita2);
        return utilita2;
    }
}
