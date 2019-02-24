package com.gumtree.addressbook.service;

import com.gumtree.addressbook.entities.Address;

public interface AddressBookService {

    long getAllGenderCount();
    long getMaleGenderCount();
    long getFemaleGenderCount();

    long getDaysOlder(String firstPersonName, String secondPersonName);

    Address getOldestPersonAddress();
}
