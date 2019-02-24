package com.gumtree.addressbook;

import com.gumtree.addressbook.entities.Address;
import com.gumtree.addressbook.readingStrategy.ReadingContext;
import com.gumtree.addressbook.readingStrategy.impl.CSVFileReadingStrategy;
import com.gumtree.addressbook.service.AddressBookService;
import com.gumtree.addressbook.service.AddressBookServiceImpl;
import com.gumtree.addressbook.utils.FileUtils;

public class ApplicationEntry {


    public static ReadingContext readingContext = new ReadingContext();
    public static String filepath = "src/resources/addressBook.csv";
    public static Address address;
    public AddressBookService addressBookService;

    public void setAddressBookService(AddressBookService addressBookService) {
        this.addressBookService = addressBookService;
    }
    public static  void main(String[] args){

        readingContext.setFileReadingStrategy(new CSVFileReadingStrategy());
        FileUtils fileUtlis = new FileUtils(readingContext);
        address = new Address();
        address.setAddressBookRecords(fileUtlis.getListOfAddressEntities(filepath));
        ApplicationEntry applicationEntry = new ApplicationEntry();
        applicationEntry.setAddressBookService(new AddressBookServiceImpl(address));
        applicationEntry.printAllCallsStatstics();
    }

    public void printAllCallsStatstics(){
        System.out.println("No of males from the addressBook:"+addressBookService.getMaleGenderCount());
        System.out.println("No of Females from the addressBook:"+addressBookService.getFemaleGenderCount());
        System.out.println("Oldest Person from the addressBook:"+addressBookService.getOldestPersonAddress().firstName);
    }
}
