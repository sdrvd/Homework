package home_work_2.utils1;


import java.util.Arrays;

public class ArraysUtils2 {
    public static void main(String[] args) {
        int bob[] = ArraysUtils.arrayRandom(5, 91);
        System.out.println("Элементы массива");
        for (int i = 0; i < bob.length; i++) {
            System.out.println(bob[i]);
        }
        int nn = ArrayEvenSum(bob);
        System.out.println("Сумма чётных элементов массива = " + nn);
        int jj1 = MaxArrayEvenNumber(bob);
        System.out.println("Максимальный элемент массива = " + jj1);
        System.out.println("Элементы массива, которые меньше среднего арифметического - " + MiddleNumberList(bob));
        System.out.println("Сумма всех элементов массива - " + ArrayAllNumberSum(bob));
        /*System.out.println("Два наименьших элемента массива - " + ArrayDoubleMin(bob));*/
    }

    public static int ArrayEvenSum(int array[]){
        int sum = 0;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] % 2 == 0){
                sum += array[i];
            }
        }
        return sum;
    }

    public static int MaxArrayEvenNumber(int array[]){

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if(max < array[i]) {
            max = array[i];
            }
        }
        return max;
    }

    public static String MiddleNumberList(int array[]){
        int sum = 0;
        int middle = 0;
        int j = 0;
        int k = 0;
        int q = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        middle = sum / (array.length);

        for (int i = 0; i < array.length-1; i++) {

            if(array[i] < middle){
                k++;
            }

        }


        int utilita1[] = new int[k];

        for (int i = 0; i <= utilita1.length; i++) {

            if(array[i] < middle){
                utilita1[j] = array[q];
                j++;
                q++;
            }

        }

        String str1 = Arrays.toString(utilita1);
        return str1;
    }

    public static int ArrayAllNumberSum(int array[]){

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /*public static String ArrayDoubleMin(int array[]){
        int utilita1[] = new int[2];
        int min1 = array[0];
        int min2 = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] < min1){
                min1 = array[i];
            }
            if(array[i] >= min1 && min2 < array[i]){
                min2 = array[i];
            }
        }
        utilita1[0] = min1;
        utilita1[1] = min2;

        String str1 = Arrays.toString(utilita1);
        return str1;
    }*/
}
