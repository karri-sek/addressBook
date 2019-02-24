package com.gumtree.addressbook.service;

import com.gumtree.addressbook.entities.Address;
import com.gumtree.addressbook.enums.Gender;

import java.util.ArrayList;
import java.util.List;

public class AddressBookServiceImpl implements AddressBookService {
    private Address address;

    public AddressBookServiceImpl(Address address) {
        this.address = address;
    }

    @Override
    public List<String> getAllGenderCount() {
        List<String> allGendersCountList = new ArrayList<>();
        allGendersCountList.add("Male:" + this.getMaleGenderCount());
        allGendersCountList.add("Female:" + this.getFemaleGenderCount());
        return allGendersCountList;
    }

    @Override
    public long getMaleGenderCount() {
        return address.getAddressBookRecords().stream().filter(a -> Gender.Male.equals(a.gender)).count();
    }

    @Override
    public long getFemaleGenderCount() {
        return address.getAddressBookRecords().stream().filter(a -> Gender.Female.equals(a.gender)).count();
    }

    @Override
    public long getDaysOlder(String firstPersonName, String secondPersonName) {
        return 0;
    }

    @Override
    public Address getOldestPersonAddress() {
        return address.getAddressBookRecords().stream().min(Address::compareByDateOfBirth).get();
    }

    @Override
    public Address getYoungestPersonAddress() {
        return null;
    }
}
