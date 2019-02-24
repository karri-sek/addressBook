package com.gumtree.addressbook.service;

import com.gumtree.addressbook.entities.Address;
import com.gumtree.addressbook.enums.Gender;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
            LocalDate firstPersonDateOfBirth = getAddressfromName(firstPersonName).dateOfBirth;
            LocalDate secondPersonDateOfBirth = getAddressfromName(secondPersonName).dateOfBirth;
            long diff = ChronoUnit.DAYS.between(firstPersonDateOfBirth, secondPersonDateOfBirth);
        return diff;
    }

    @Override
    public Address getOldestPersonAddress() {
        return address.getAddressBookRecords().stream().min(Address::compareByDateOfBirth).get();
    }

    @Override
    public Address getYoungestPersonAddress() {
        return address.getAddressBookRecords().stream().max(Address::compareByDateOfBirth).get();
    }

    private Address getAddressfromName(String firstName) {
        return address.getAddressBookRecords().stream().filter(a -> firstName.equals(a.firstName)).findFirst().get();
    }
}
