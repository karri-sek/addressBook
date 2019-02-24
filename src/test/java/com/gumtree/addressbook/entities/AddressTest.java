package com.gumtree.addressbook.entities;

import com.gumtree.addressbook.entities.Address;
import com.gumtree.addressbook.enums.Gender;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

public class AddressTest {

    @Test
    public void testTwoAddressObjectsShouldEqual() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate firstAddressDOB = LocalDate.parse("16/03/77", formatter);
        Address firstAddress = new Address("Bill", "McKnight", Gender.Male, firstAddressDOB);
        LocalDate secondAddressDOB = LocalDate.parse("16/03/77", formatter);
        Address secondAddress = new Address("Bill", "McKnight", Gender.Male, secondAddressDOB);
        assertTrue(firstAddress.equals(secondAddress));
        assertEquals(firstAddress.hashCode(), secondAddress.hashCode());

    }

    @Test
    public void testTwoAddressObjectsShouldEqualByCompare() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate firstAddressDOB = LocalDate.parse("16/03/77", formatter);
        Address firstAddress = new Address("Bill", "McKnight", Gender.Male, firstAddressDOB);
        LocalDate secondAddressDOB = LocalDate.parse("16/03/77", formatter);
        Address secondAddress = new Address("Bill", "McKnight", Gender.Male, secondAddressDOB);
        assertTrue(firstAddress.compareTo(secondAddress) == 0);

    }

    @Test
    public void testTwoAddressObjectsShouldNotBeEqual() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate firstAddressDOB = LocalDate.parse("16/03/77", formatter);
        Address firstAddress = new Address("Bill", "McKnight", Gender.Male, firstAddressDOB);
        LocalDate secondAddressDOB = LocalDate.parse("16/03/77", formatter);
        Address secondAddress = new Address("Nill", "McKnight", Gender.Male, secondAddressDOB);
        assertFalse(firstAddress.equals(secondAddress));
        assertNotEquals(firstAddress.hashCode(), secondAddress.hashCode());
    }

    @Test
    public void testTwoAddressObjectsDifferByDateOfBirth() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate firstAddressDOB = LocalDate.parse("16/03/97", formatter);
        Address firstAddress = new Address("Bill", "McKnight", Gender.Male, firstAddressDOB);
        LocalDate secondAddressDOB = LocalDate.parse("16/03/77", formatter);
        Address secondAddress = new Address("Bill", "McKnight", Gender.Male, secondAddressDOB);
        assertFalse(firstAddress.equals(secondAddress));
        assertNotEquals(firstAddress.hashCode(), secondAddress.hashCode());
    }

    @Test
    public void testTwoAddressObjectsDifferByLastName() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate firstAddressDOB = LocalDate.parse("16/03/97", formatter);
        Address firstAddress = new Address("Bill", "Queen", Gender.Male, firstAddressDOB);
        LocalDate secondAddressDOB = LocalDate.parse("16/03/97", formatter);
        Address secondAddress = new Address("Bill", "McKnight", Gender.Male, secondAddressDOB);
        assertFalse(firstAddress.equals(secondAddress));
        assertNotEquals(firstAddress.hashCode(), secondAddress.hashCode());
    }
}
