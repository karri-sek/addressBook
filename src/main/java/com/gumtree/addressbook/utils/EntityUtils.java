package com.gumtree.addressbook.utils;

import com.gumtree.addressbook.entities.Address;
import com.gumtree.addressbook.entities.Entity;
import com.gumtree.addressbook.enums.Gender;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class EntityUtils {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

    public LocalDate getLocalDateFromString(String strDate) {
        return LocalDate.parse(strDate, formatter);
    }

    public Entity makeEntityFromFileLine(String fileLine, String columnSeparator, String firstLastNameSeparator) {
        String[] fileLineSplit = Arrays.stream(fileLine.split(columnSeparator)).map(String::trim).toArray(String[]::new);
        String[] firstLastNameSplit = fileLineSplit[0].split(firstLastNameSeparator);
        String firstName = firstLastNameSplit[0];
        String lastName = firstLastNameSplit[1];
        Gender gender = Gender.valueOf(fileLineSplit[1]);
        LocalDate dateOfBirth = getLocalDateFromString(fileLineSplit[2]);
        return new Address(firstName, lastName, gender, dateOfBirth);
    }

}
