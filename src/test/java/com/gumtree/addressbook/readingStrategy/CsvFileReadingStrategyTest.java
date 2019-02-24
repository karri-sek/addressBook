package com.gumtree.addressbook.readingStrategy;

import org.junit.Test;
import static junit.framework.Assert.assertFalse;
public class CsvFileReadingStrategyTest {

    @Test
    public void testNoFileExistence(){
        CSVFileReadingStrategy csvReading = new CsvFileReadingStrategy("src/test/resources/nofile.csv");
        assertFalse(csvReading.isFileExists());
    }
}
