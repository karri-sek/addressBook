package com.gumtree.addressbook.utils;

import com.gumtree.addressbook.entities.AdressBook;
import com.gumtree.addressbook.entities.Entity;
import com.gumtree.addressbook.enums.Gender;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EntityUtils {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
   public LocalDate getLocalDateFromString(String strDate){
       return LocalDate.parse(strDate, formatter);
   }

   public Entity makeEntityFromFileLine(String fileLine, String columnSeparator, String firstLastNameSeparator){
    String[] fileLineSplit = fileLine.split(columnSeparator);
    String[] firstLastNameSplit = fileLineSplit[0].split(firstLastNameSeparator);
    String firstName = firstLastNameSplit[0].trim();
    String lastName = firstLastNameSplit[1].trim();
    Gender gender = Gender.valueOf(fileLineSplit[1].trim());
    LocalDate dateOfBirth = getLocalDateFromString(fileLineSplit[2].trim());
    return new AdressBook(firstName, lastName, gender, dateOfBirth);
   }

}
