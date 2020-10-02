package com.company;

import java.util.LinkedList;

public class AddressBook {
    private LinkedList<BuddyInfo> buddyInfos;

    public AddressBook(){
        buddyInfos = new LinkedList<>();
    }

    public void addBuddy(BuddyInfo buddyInfo){
        buddyInfos.add(buddyInfo);
    }

    public void removeBuddy(BuddyInfo buddyInfo){
        buddyInfos.remove(buddyInfo);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);

        System.out.println("Added buddy inside the AddressBook");

        addressBook.removeBuddy(buddy);

        System.out.println("Removed buddy inside the addressbook");
        
        System.out.println("Add one print statement that editing from github.")
    }
}
