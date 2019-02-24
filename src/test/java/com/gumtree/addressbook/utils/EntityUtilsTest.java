package com.gumtree.addressbook.utils;
import com.gumtree.addressbook.entities.Entity;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EntityUtilsTest {
    @Test
    public void shouldReturnsLocalDateFromAStringDate(){
        EntityUtils entityUtils = new EntityUtils();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        assertEquals(LocalDate.parse("16/03/77",formatter), entityUtils.getLocalDateFromString("16/03/77"));
    }

    @Test
    public void shouldMakeAnEntityFromFileLine(){
        String line = "Bill McKnight, Male, 16/03/77";
        EntityUtils entityUtils = new EntityUtils();
       Entity entity =  entityUtils.makeEntityFromFileLine(line,","," ");
       assertNotNull(entity);

    }
}
