package home_work_5.service;



import home_work_5.api.ISearchEngine;

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
        List list = new LinkedList();
        String bookUtil;



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
            bookUtil = book.replaceAll("[.,?!)(\";:-]", "");
            String bookUtilArray[] = bookUtil.split("[\\s]");
            System.out.println(Arrays.toString(bookUtilArray));
            for (int i = 0; i < book.length(); i++) {

            }




        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
