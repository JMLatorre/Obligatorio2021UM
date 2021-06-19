package CSVReader;

import java.io.*;

public class CSVReader {



    public static void main(String[] args) {
        String path = "C:\\Users\\Usuario\\OneDrive\\Desktop\\Obligatorio Programación\\Prueba.csv";

        File file = new File(path);
        String line = "";

        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(file));
            while ((line = bfReader.readLine()) != null){
                String[] dataList = line.split(",");
                System.out.println(dataList[0]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

