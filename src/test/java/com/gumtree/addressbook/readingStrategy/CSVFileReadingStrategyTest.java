package com.gumtree.addressbook.readingStrategy;

import com.gumtree.addressbook.readingStrategy.impl.CSVFileReadingStrategy;
import org.junit.Test;
import static junit.framework.Assert.assertFalse;
public class CSVFileReadingStrategyTest {

    @Test
    public void testNoFileExistence(){
        CSVFileReadingStrategy csvReading = new CSVFileReadingStrategy();
        assertFalse(csvReading.isFileExists("src/test/resources/nofile.csv"));
    }
}
