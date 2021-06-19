package CSVReader;

import java.io.*;
import java.util.Iterator;

public class CSVReader implements Iterable<String[]> {

    private final File file;

    public CSVReader(File file){
        this.file = file;
    }

    @Override
    public Iterator<String[]> iterator() {

        return new CSVReaderIterator(this.file);
    }
}

