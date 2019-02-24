package com.gumtree.addressbook.readingStrategy;
public interface FileReadingStrategy {
    boolean isFileExists(String path);
    boolean hasCorrectExtension(String path);
}
