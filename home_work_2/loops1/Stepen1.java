package home_work_2.loops1;

import java.util.Scanner;

public class Stepen1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jj = 1;
        System.out.println("Введите число...");
        int a = in.nextInt();
        System.out.println("Введите степень...");
        int b = in.nextInt();
        for (int i = 0; i < b; i++) {
        jj = jj * a;
        }
        System.out.println(jj);
    }
}
