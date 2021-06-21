package CSVReader;

import java.io.*;
import java.util.Iterator;

public class CSVReaderIterator implements Iterator<String[]> {

    private BufferedReader buffered_reader;
    private RowBuilder row_builder;

    public CSVReaderIterator(File file) {

        try {
            FileReader file_reader = new FileReader(file);
            this.buffered_reader = new BufferedReader(file_reader);
            this.row_builder = new RowBuilder();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean hasNext() {

        try {
            for (int c = this.buffered_reader.read(); c != -1; c = this.buffered_reader.read()) {

                char character = (char) c;
                if (this.row_builder.append_character(character)){

                    return true;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String[] next() {

        String[] record = this.row_builder.get_record();
        this.row_builder.reset();

        return record;
    }
}
