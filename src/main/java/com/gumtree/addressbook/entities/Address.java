package com.gumtree.addressbook.entities;

import com.gumtree.addressbook.enums.Gender;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Address extends Entity implements  Comparable<Address>{

    public LocalDate dateOfBirth;
    private String addressLining;
    private String postCode;
    private List<Address> addressBookRecords;
    
    public Address(){
        super();
    }

    public Address(String firstName, String lastName, Gender gender, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public Address(String firstName, String lastName, Gender gender, String addressLining, String postCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.addressLining = addressLining;
        this.postCode = postCode;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Address Address = (Address) other;
        return Objects.equals(firstName, Address.firstName) &&
                Objects.equals(gender, Address.gender) &&
                Objects.equals(dateOfBirth, Address.dateOfBirth) &&
                Objects.equals(postCode, Address.postCode) &&
                Objects.equals(lastName, Address.lastName) &&
                Objects.equals(addressLining, Address.addressLining);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, dateOfBirth,addressLining,postCode);
    }

    @Override
    public String toString() {
        return String.format("Address{firstName=%s, lastName=%s, addressLining=%s, postCode=%s, gender=%s, dateOfBirth=%s}",
                firstName, lastName, addressLining,postCode, gender, dateOfBirth);
    }
    @Override
    public int compareTo(Address other) {
        return this.firstName.compareTo(other.firstName);
    }

    public static int compareByDOB(Address firstAddress, Address secondAddress) {
        return firstAddress.dateOfBirth.compareTo(secondAddress.dateOfBirth);
    }

    public List<Address> getAddressBookRecords() {
        return addressBookRecords;
    }

    public void setAddressBookRecords(List<Address> addressBookRecords) {
        this.addressBookRecords = addressBookRecords;
    }
    public static int compareByDateOfBirth(Address firstAddress, Address secondAddress) {
        return firstAddress.dateOfBirth.compareTo(secondAddress.dateOfBirth);
    }
}
