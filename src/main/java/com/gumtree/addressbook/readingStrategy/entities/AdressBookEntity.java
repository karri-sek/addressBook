package com.gumtree.addressbook.readingStrategy.entities;

import com.gumtree.addressbook.readingStrategy.enums.Gender;

import java.time.LocalDate;

public class AdressBookEntity extends Entity {
    private LocalDate dateOfBirth;
    public AdressBookEntity(String firstName, String lastName, Gender gender, LocalDate dateOfBirth){
      this.firstName = firstName;
      this.lastName = lastName;
      this.dateOfBirth = dateOfBirth;
      this.gender = gender;
    }
}
