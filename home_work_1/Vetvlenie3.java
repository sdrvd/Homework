package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Vetvlenie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя...");
        String jo = in.nextLine();
        boolean b = Objects.equals("Вася", jo);
        boolean d = Objects.equals("Анастасия", jo);
        if(b == true){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if(d == true){
            System.out.println("Я тебя так долго ждал");
        }
        else{
            if(b != true && d != true) {
                System.out.println("Добрый вечер, а вы кто?");
            }
        }
    }
}
