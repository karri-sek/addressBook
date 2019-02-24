package com.gumtree.addressbook.utils;

import com.gumtree.addressbook.entities.Address;
import com.gumtree.addressbook.enums.Gender;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddressTest {

    @Test
    public void testTwoAddressObjectsShouldEqual(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate firstAddressDOB = LocalDate.parse("16/03/77",formatter);
        Address firstAddress = new Address("Bill","McKnight", Gender.Male, firstAddressDOB);
        LocalDate secondAddressDOB = LocalDate.parse("16/03/77",formatter);
        Address secondAddress = new Address("Bill","McKnight", Gender.Male, firstAddressDOB);
        assertTrue(firstAddress.equals(secondAddress));
        assertEquals(firstAddress.hashCode(), secondAddress.hashCode());

    }
}
