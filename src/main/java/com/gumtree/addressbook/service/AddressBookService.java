package com.gumtree.addressbook.service;

import com.gumtree.addressbook.entities.Address;

import java.util.List;

public interface AddressBookService {

    List<String> getAllGenderCount();
    long getMaleGenderCount();
    long getFemaleGenderCount();

    long getDaysOlder(String firstPersonName, String secondPersonName);

    Address getOldestPersonAddress();
}
