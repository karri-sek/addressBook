package com.gumtree.addressbook.readingStrategy.impl;

import com.gumtree.addressbook.readingStrategy.FileReadingStrategy;

public class CSVFileReadingStrategy implements FileReadingStrategy {
    @Override
    public boolean isFileExists(String path) {
        return false;
    }
}
