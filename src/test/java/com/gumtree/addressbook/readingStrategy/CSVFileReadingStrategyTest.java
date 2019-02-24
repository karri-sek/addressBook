package com.gumtree.addressbook.readingStrategy;

import com.gumtree.addressbook.readingStrategy.impl.CSVFileReadingStrategy;
import org.junit.Test;
import static org.junit.Assert.*;
public class CSVFileReadingStrategyTest {

    @Test
    public void testNoFileExistence(){
        CSVFileReadingStrategy csvReading = new CSVFileReadingStrategy();
        assertFalse(csvReading.isFileExists("src/test/resources/nofile.csv"));
    }
    @Test
    public void fileShouldExist(){
        CSVFileReadingStrategy csvReading = new CSVFileReadingStrategy();
        assertTrue(csvReading.isFileExists("src/test/resources/addressBook.csv"));
    }
    @Test
    public void shouldReturnFalseForDirectory(){
        CSVFileReadingStrategy csvReading = new CSVFileReadingStrategy();
        assertFalse(csvReading.isFileExists("src/test/resources"));
    }
}
