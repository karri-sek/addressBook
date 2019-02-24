package com.gumtree.addressbook.readingStrategy;

import java.io.File;
import java.io.IOException;

public interface FileReadingStrategy {
    boolean isFileExists(String path);
    boolean hasCorrectExtension(String path);
    long getCountOfLines(File file) throws IOException;
    long mapFileLinesToEntities(File file);
}
