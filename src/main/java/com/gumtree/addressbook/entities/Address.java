package com.gumtree.addressbook.entities;

import com.gumtree.addressbook.enums.Gender;

import java.time.LocalDate;
import java.util.List;

public class Address extends Entity {
    private LocalDate dateOfBirth;
    private String addressLine;
    private String postCode;
    private List<Address> addressBookRecords;

    public Address(String firstName, String lastName, Gender gender, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public Address(String firstName, String lastName, Gender gender, String addressLine, String postCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.addressLine = addressLine;
        this.postCode = postCode;
    }

    public List<Address> getAddressBookRecords() {
        return addressBookRecords;
    }

    public void setAddressBookRecords(List<Address> addressBookRecords) {
        this.addressBookRecords = addressBookRecords;
    }
}
