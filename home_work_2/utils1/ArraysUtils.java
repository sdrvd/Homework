package home_work_2.utils1;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

    public static int[] arrayFromConsole(){
        Scanner in = new Scanner(System.in);
        int chislo = 0;
        System.out.println("Введите требуемый размер массива...");
        int dlinna = in.nextInt();
        int container[] = new int[dlinna];
        for (int i = 0; i < dlinna; i++) {
            System.out.println("Введите число...");
            chislo = in.nextInt();
            container[i] = chislo;
        }
        return container;
    }
    public static int[] arrayRandom(int size, int maxValueExclusion){
        Random rnd = new Random();
        int data[] = new int[size];
        for (int i = 0; i < data.length; i++) {
            int random1 = rnd.nextInt(maxValueExclusion);
            data[i] = random1;
        }
        return data;
    }

    public static void main(String[] args) {
        int j = 0;
        int container[] = arrayFromConsole();
        System.out.println("Вывод случайных элементов в консоль");
        int data[] = arrayRandom(4,95);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

    }
}
