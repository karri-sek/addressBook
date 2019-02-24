package com.gumtree.addressbook.readingStrategy.impl;

import com.gumtree.addressbook.readingStrategy.FileReadingStrategy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class CSVFileReadingStrategy implements FileReadingStrategy {
    public static final String SUPPORTED_EXTENSION = "csv";
    public static final String CSV_COLUMN_SEPARATOR = ",";
    public static final String CSV_FIRST_LAST_NAME_SEPARATOR=" ";

    @Override
    public boolean isFileExists(String path) {
        File inputFile = new File(path);
        return inputFile.exists() && inputFile.isFile();
    }
    @Override
    public boolean hasCorrectExtension(String path){
        String extension = path.substring(path.lastIndexOf(".")+1);
        return extension.equals(SUPPORTED_EXTENSION);
    }

    @Override
    public long getCountOfLines(File file) throws IOException {
       return Files.lines(file.toPath()).count();
    }

    @Override
    public long mapFileLinesToEntities(File file) {
        return 0;
    }
}
