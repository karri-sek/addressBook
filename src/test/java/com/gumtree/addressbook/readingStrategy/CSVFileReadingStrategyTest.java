package com.gumtree.addressbook.readingStrategy;

import com.gumtree.addressbook.readingStrategy.impl.CSVFileReadingStrategy;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

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

    @Test
    public void shouldReturnFalseForInCorrectFileExtension(){
        CSVFileReadingStrategy csvReading = new CSVFileReadingStrategy();
        assertFalse(csvReading.hasCorrectExtension("src/test/resources/addressBook.txt"));
    }


    @Test
    public void shouldReturnTrueForCorrectFileExtension(){
        CSVFileReadingStrategy csvReading = new CSVFileReadingStrategy();
        assertTrue(csvReading.hasCorrectExtension("src/test/resources/addressBook.csv"));
    }

    @Test
    public void shouldReturnCountOfLinesFromFile() throws IOException {
        CSVFileReadingStrategy csvReading = new CSVFileReadingStrategy();
        assertEquals(1, csvReading.getCountOfLines(new File("src/test/resources/addressBook.csv")));
    }
    @Test(expected = IOException.class)
    public void shouldReturnIOException() throws IOException {
        CSVFileReadingStrategy csvReading = new CSVFileReadingStrategy();
        csvReading.getCountOfLines(new File("src/test/resources/addressBook.dsv"));
    }
    @Test
    public void returnsFailedToMap() {
        CSVFileReadingStrategy csvReading = new CSVFileReadingStrategy();
        assertEquals(null,csvReading.mapFileLinesToEntities(new File("src/test/resources/addressBook.cs")));
    }
    @Test
    public void returnsOneForSuccessfulMapping() {
        CSVFileReadingStrategy csvReading = new CSVFileReadingStrategy();
        assertEquals(1,csvReading.mapFileLinesToEntities(new File("src/test/resources/addressBook.csv")).size());
    }

}
