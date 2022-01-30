package home_work_5.service;



import home_work_5.comparators.IntegerComparator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class WarAndPeace {
    private String book;
    private String partOne;
    private int partTwo;
    private String output;

    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public void formPrint() {
        try {
            book = readUsingFiles("book.txt");
            System.out.println(book);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void textSetPrint(){
        int count = 0;
        try {
            book = readUsingFiles("book.txt");
            Set set = new HashSet();
            book = book.replaceAll("[.,?!)(\";:]", "");
            String data[] = book.split("[\\s]");
            for (int i = 0; i < data.length; i++) {
                if (!data[i].equals("")){
                    if(set.add(data[i])){
                        count++;
                    }
                }
            }
            System.out.println(set);
            System.out.println("Количество использованных слов - " + count);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void wordsTop(int positions){
        Map map = new HashMap();



        try {
            book = readUsingFiles("book.txt");
            book = book.replaceAll("[.,?!)(\";:-]", "");
            String data[] = book.split("[\\s]");
            for (int i = 0; i < data.length; i++) {
                if(!data[i].equals("")){
                    map.putIfAbsent(data[i], 1);
                }
                if(map.containsKey(data[i]) && !data[i].equals("")){
                  Object valueOut = map.get(data[i]);
                 int value = (int) valueOut+1;
                 map.put(data[i], value);
                }
            }
            List list;
            list = new ArrayList(map.values());
            List listOfKeys;
            listOfKeys = new ArrayList(map.keySet());
            IntegerComparator comp = new IntegerComparator();
            list.sort(comp);
            Object array[] = new Object[list.size()];
            Object arrayOfKeys[] = new Object[map.size()];
            Object outputArray[] = new Object[positions];
            arrayOfKeys = listOfKeys.toArray();
            array = list.toArray();
            list.clear();
            for (int i = array.length - 1; i >=  array.length - positions; i--) {
                list.add(array[i]);
            }
            array = list.toArray();
            for (int i = 0; i < arrayOfKeys.length; i++) {
                int cnt = 0;
                Object temporaryKey = arrayOfKeys[i];
                Object temporaryValue = map.get(arrayOfKeys[i]);
                for (int j = 0; j < array.length; j++) {
                    if(temporaryValue.equals(array[j])){
                        int cntOut = cnt + 1;
                        outputArray[cnt] = "№" + cntOut + " слово " + temporaryKey + " - " + temporaryValue;
                    }
                    cnt++;
                }
            }

            System.out.println(Arrays.toString(outputArray));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
