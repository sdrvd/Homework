package home_work_4.run;

import home_work_4.comparators.IntegerComparator;
import home_work_4.container.DataContainer;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] beta = new Integer[0];
        DataContainer<Integer> cont = new DataContainer<>(beta);
        System.out.println(cont.add(15));
        System.out.println(cont.add(55));
        System.out.println(cont.add(62));
        System.out.println(cont.add(99));
        System.out.println(cont.add(92));
        System.out.println(cont.add(503));
        System.out.println(cont.add(52225));
        System.out.println(cont.add(504));
        System.out.println(cont.add(506));
        System.out.println(cont.add(5999));
        System.out.println(cont.add(509));
        System.out.println(cont.add(510));
        System.out.println(cont.add(515));
        System.out.println(cont.add(522));
        System.out.println(cont.add(599));
        System.out.println(cont.toString());
        System.out.println("№1 = " + cont.get(2));
        System.out.println(cont.deletePosition(2));
        System.out.println("№2 = " + cont.get(2));
        System.out.println("№3 = " + cont.get(3));
        System.out.println(cont.deleteItem(99));
        System.out.println(cont.deleteItem(510));
        System.out.println(Arrays.toString(cont.getItems()));
        System.out.println(cont.toString());
        /*cont.sort(new IntegerComparator());
        System.out.println(cont.toString());*/
    }
}
