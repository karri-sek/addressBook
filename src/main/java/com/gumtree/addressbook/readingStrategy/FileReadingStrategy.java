package com.gumtree.addressbook.readingStrategy;

import java.io.File;

public interface FileReadingStrategy {
    boolean isFileExists(String path);
    boolean hasCorrectExtension(String path);
    int getCountOfLines(File file);
}
