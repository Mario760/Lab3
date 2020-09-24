package com.company;

public class BuddyInfo {

    private static String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name,String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public static void setName(String name) {
        BuddyInfo.name = name;
    }

    public String getName() {
        return name;
    }



    public static void main(String[] args) {
        System.out.println("Hello world!");

        BuddyInfo buddy = new BuddyInfo("","","");
        buddy.setName("Homer");

        System.out.println("Hello "+ buddy.getName());
    }
}
