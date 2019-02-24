package com.gumtree.addressbook.readingStrategy.impl;

import com.gumtree.addressbook.readingStrategy.FileReadingStrategy;

import java.io.File;

public class CSVFileReadingStrategy implements FileReadingStrategy {
    @Override
    public boolean isFileExists(String path) {
        File inputFile = new File(path);
        return inputFile.exists() && inputFile.isFile();
    }
    @Override
    public boolean hasCorrectExtension(String path){
        return false;
    }
}
