package home_work_5.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileWork {

    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public void searcing(){
        Scanner scan = new Scanner(System.in);
        EasySearch finder = new EasySearch();
        System.out.println("Введите полный путь к папке");
        String path = scan.nextLine();
        String fileName;
        try {
            do {
                File dir = new File(path);
                File[] arrFiles = dir.listFiles();
                List<File> lst = Arrays.asList(arrFiles);
                System.out.println(lst);
                System.out.println("Выберите файл или введите код выхода(9211)");
                fileName = scan.nextLine();
                String fileContents = readUsingFiles(fileName);
                System.out.println(fileContents);
                System.out.println("Введите искомое слово");
                String word = scan.nextLine();
                long amount = finder.searchFile(fileName, word);
                Writer writer = new FileWriter("result.txt", true);
                String onWrite = fileName + " - " + amount + " - " + word + "\n";
                writer.write(onWrite);
                writer.flush();
                writer.close();
            }while(!fileName.equals("9211"));


        } catch(IOException e){
            System.out.println(e.getMessage());
        } catch(NullPointerException e){
            System.out.println("Введён неверный путь к директории");
        }

    }

}
