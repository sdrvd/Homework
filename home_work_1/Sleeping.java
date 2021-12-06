package HomeWork1;

public class Sleeping {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        {
            boolean kk2 = sleepIn(true, false);
            if(kk2 = true){
                System.out.println("Можно спать дальше");
            }
            else{
                System.out.println("На работу пора");
            }

        }
    }
}