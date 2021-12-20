package home_work_2.loops1;


public class Peremnojenie1{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int j = 1;
        int b = 0;
        for (int i = 0; i < a; i++){
        b = a * j;
            System.out.print(j);
            if(j != a){
                System.out.print(" * ");
            }
        j++;
        }
        System.out.println(" = " + b);
    }
}
