package home_work_4.run;

import home_work_4.container.DataContainer;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] beta = new Integer[1];
        DataContainer<Integer> cont = new DataContainer<>(beta);
        System.out.println(cont.add(15));
        System.out.println(cont.add(55));
        System.out.println(cont.add(62));
        System.out.println(cont.add(99));
        System.out.println(cont.add(92));
        System.out.println(cont.add(501));
        System.out.println(cont.add(501));
        System.out.println(cont.add(501));
        System.out.println(cont.add(501));
        System.out.println(cont.add(501));
        System.out.println(cont.add(501));
        System.out.println(cont.add(501));
        System.out.println(cont.add(501));
        System.out.println(cont.add(501));
        System.out.println(cont.add(501));
        System.out.println(cont.get(2));
        System.out.println(cont.getItems());
    }
}
