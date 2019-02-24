package com.gumtree.addressbook.entities;

import com.gumtree.addressbook.enums.Gender;

import java.time.LocalDate;
import java.util.List;

public class AdressBook extends Entity {
    private LocalDate dateOfBirth;
    private List<AdressBook> addressBookRecords;

    public AdressBook(String firstName, String lastName, Gender gender, LocalDate dateOfBirth){
      this.firstName = firstName;
      this.lastName = lastName;
      this.dateOfBirth = dateOfBirth;
      this.gender = gender;
    }

    public List<AdressBook> getAddressBookRecords() {
        return addressBookRecords;
    }

    public void setAddressBookRecords(List<AdressBook> addressBookRecords) {
        this.addressBookRecords = addressBookRecords;
    }
}
