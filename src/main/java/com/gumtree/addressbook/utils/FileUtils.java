package com.gumtree.addressbook.utils;

import com.gumtree.addressbook.entities.Address;
import com.gumtree.addressbook.readingStrategy.FileReadingStrategy;
import com.gumtree.addressbook.readingStrategy.ReadingContext;

import java.io.File;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FileUtils {
    private ReadingContext readingContext;
    public FileUtils(ReadingContext readingContext){
        this.readingContext = readingContext;
    }

    public ReadingContext getReadingContext() {
        return readingContext;
    }

    public  List<Address> getListOfAddressEntities(String fileName) {
        FileReadingStrategy fileReadingStrategy = getReadingContext().getStrategy();

        if(fileReadingStrategy.isFileExists(fileName)){
            File file = new File(fileName);
            return fileReadingStrategy.mapFileLinesToEntities(file).stream().map(item->(Address)item).collect(toList());
         }else{
            return null;
        }
    }


}