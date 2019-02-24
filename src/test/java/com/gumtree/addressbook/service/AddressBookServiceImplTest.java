package com.gumtree.addressbook.service;

import com.gumtree.addressbook.entities.Address;
import com.gumtree.addressbook.utils.EntityUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AddressBookServiceImplTest {

    List<Address> listOfAddresses = new ArrayList<>();
    AddressBookService addressBookService = null;

    @Before
    public void setup() {

        EntityUtils entityUtils = new EntityUtils();
        Address address = new Address();

        listOfAddresses.add((Address) entityUtils.makeEntityFromFileLine("Bill McKnight, Male, 16/03/79", ",", " "));
        listOfAddresses.add((Address) entityUtils.makeEntityFromFileLine("Mark Mat, Male, 16/03/87", ",", " "));
        listOfAddresses.add((Address) entityUtils.makeEntityFromFileLine("Samantha sally, Female, 16/03/89", ",", " "));
        listOfAddresses.add((Address) entityUtils.makeEntityFromFileLine("Bob Robert, Male, 16/03/67", ",", " "));
        address.setAddressBookRecords(listOfAddresses);
        addressBookService = new AddressBookServiceImpl(address);
    }

    @Test
    public void shouldReturnAllGenderCount() {
        assertEquals(2, addressBookService.getAllGenderCount().size());

    }

    @Test
    public void shouldReturnMaleGenderCount() {
        assertEquals(3, addressBookService.getMaleGenderCount());

    }

    @Test
    public void shouldReturnFeMaleGenderCount() {
        assertEquals(1, addressBookService.getFemaleGenderCount());

    }

    @Test
    public void shouldReturnOldestPersonFromAddressBook() {
        assertEquals("Bob Robert", addressBookService.getOldestPersonAddress().firstName);

    }
}
