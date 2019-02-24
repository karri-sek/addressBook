package com.gumtree.addressbook.readingStrategy.entities;

import com.gumtree.addressbook.readingStrategy.enums.Gender;

import java.time.LocalDate;

public class AdressBook extends Entity {
    private LocalDate dateOfBirth;
    public AdressBook(String firstName, String lastName, Gender gender, LocalDate dateOfBirth){
      this.firstName = firstName;
      this.lastName = lastName;
      this.dateOfBirth = dateOfBirth;
      this.gender = gender;
    }
}
