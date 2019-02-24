package com.gumtree.addressbook.utils;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class EntityUtilsTest {
    @Test
    public void shouldReturnsLocalDateFromAStringDate(){
        EntityUtils entityUtils = new EntityUtils();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        assertEquals(LocalDate.parse("16/03/77",formatter), entityUtils.getLocalDateFromString("dd/mm/year"));
    }
}
