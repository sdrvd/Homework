package home_work_2.loops1;

public class Tablica1 {
    public static void main(String[] args) {
        int oper1 = 2;
        int oper2 = 1;

        while(oper1 <= 10){
            System.out.println(oper1 + "x" + oper2 + "=" + (oper1*oper2));
            oper2++;
            if(oper2 == 11){
                oper1++;
                oper2 = 1;
            }
        }

    }
}
