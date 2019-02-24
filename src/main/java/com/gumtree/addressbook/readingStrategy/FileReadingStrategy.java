package com.gumtree.addressbook.readingStrategy;

import com.gumtree.addressbook.entities.Entity;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface FileReadingStrategy {
    boolean isFileExists(String path);
    boolean hasCorrectExtension(String path);
    long getCountOfLines(File file) throws IOException;
    List<Entity> mapFileLinesToEntities(File file);
}
