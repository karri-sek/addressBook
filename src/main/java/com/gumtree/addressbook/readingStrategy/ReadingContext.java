package com.gumtree.addressbook.readingStrategy;

import com.gumtree.addressbook.readingStrategy.FileReadingStrategy;

public class ReadingContext {
    private FileReadingStrategy strategy;

    public void setFileReadingStrategy(FileReadingStrategy strategy){
        this.strategy = strategy;
    }
}
