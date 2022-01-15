package home_work_4.container;




import java.util.Arrays;
import java.util.Comparator;


public class DataContainer<E>{


    private E[] data;
    private int index = 0;
    private E[] innerData;

    public DataContainer(E[] data) {
        this.data = data;
    }


    public int add(E item){
        int counter = 0;

        if(data.length == 0){
            data = Arrays.copyOf(data, 1);
        }

        if (data[index] == null){
            data[index] = item;
            index++;
        }


        if(index >= data.length) {
            data = Arrays.copyOf(data, index+1);
        }


        return index-1;
    }

    public E get(int index){
        return data[index-1];
    }

    public E[] getItems(){
        return Arrays.copyOf(data, data.length);
    }

    public boolean deletePosition(int position){
        int counter = 0;

        if(index < 0 || index >= data.length){
            return false;
        }

        for (int i = position; i < data.length; i++) {
            data[i - 1] = data[i];
        }

        for (int i = 0; i < data.length; i++) {
            if(data[i] == null){
                counter++;
            }
        }


        return true;
    }

   public boolean deleteItem(E item){


       for (int i = 0; i < data.length; i++) {
          if(data[i].equals(item)){
              deletePosition(i+1);
              return true;
          }
       }

       return false;
    }

    @Override
    public String toString() {
        int counter = 0;

        for (int i = 0; i < data.length; i++) {
            if(data[i] == null){
                counter++;
            }
        }

        innerData = Arrays.copyOf(data, data.length-counter);

        for (int i = 0; i < data.length; i++) {
            if(data[i] != null){
                innerData[i] = data[i];
            }
        }

        return "data = " + Arrays.toString(innerData);
    }

   /*public void sort(Comparator<E> comparator){
        for (int i = 0; i < data.length;) {
            boolean d1 = false;
            for (int k = i+1; k < data.length && !d1; k++) {
            if(data[i] != null && data[k] != null) {
                d1 = comparator.compare(data[i], data[k]) > 0;
                if (d1) {
                    E tmp = data[k];
                    data[k] = data[i];
                    data[i] = tmp;
                }
                if (!d1) {
                    i++;
                }
            }
            }
        }
    }*/



}
