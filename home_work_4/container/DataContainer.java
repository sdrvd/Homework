package home_work_4.container;



import java.util.Arrays;

public class DataContainer<E> {


    private E[] data;
    //private E[] innerData;
    private int index = 0;

    public DataContainer(E[] data) {
        this.data = data;
    }


    public int add(E item){

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
        return data[index];
    }

    public E[] getItems(){
        return data;
    }

    /*boolean delete(int position){
        if(data[position] != null){
            data[position] = data[position+1];
            data = Arrays.copyOf(data, index-1);
            return true;
        }
        if(data[position] == null){
            return false;
        }
    }*/

}
