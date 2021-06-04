package CSVReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReader {

    public static void main(String[] args) {
        String path = "C:\\Users\\Usuario\\OneDrive\\Desktop\\Obligatorio Programación\\IMDb movies.csv";

        File file = new File(path);

        try {
            Scanner scannedFile = new Scanner(file);
            while (scannedFile.hasNext()){
                String data = scannedFile.next();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
