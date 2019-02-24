package com.gumtree.addressbook.readingStrategy.impl;

import com.gumtree.addressbook.readingStrategy.FileReadingStrategy;

import java.io.File;

public class CSVFileReadingStrategy implements FileReadingStrategy {
    public String SUPPORTED_EXTENSION = "csv";
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
    public int getCountOfLines(File file) {
        return 0;
    }
}
