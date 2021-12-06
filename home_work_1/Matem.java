package HomeWork1;

import java.util.Scanner;

public class Matem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double z = Math.acos(4);
        System.out.println(z);
        double k = Math.toDegrees(55);
        System.out.println(k);
        double b = Math.log(k);
        System.out.println(b);
        double ooo = (Math.random()*10+1);
        System.out.println(ooo);
        System.out.println("Введите дробное число с десятичной частью");
        double jok = in.nextDouble();
        double j = Math.ceil(jok);
        double jj = Math.floor(jok);
        System.out.println(j);
        System.out.println(jj);
        System.out.println("Введите два числа");
        float z1 = in.nextFloat();
        float z2 = in.nextFloat();
        float kol = Math.max(z1, z2);
        float kol1 = Math.min(z1, z2);
        System.out.println("Наибольшее число из пары = " + kol);
        System.out.println("Наименьшее число из пары = " + kol1);
        System.out.println("Введите число");
        double keg1 = in.nextDouble();
        double keg = Math.log(keg1);
        System.out.println("Логарифм числа " + keg1 + " = " + keg);
    }
}
