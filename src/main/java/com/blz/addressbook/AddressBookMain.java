package com.blz.addressbook;

import java.util.ArrayList;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book system");


        /***Taking data through array list
         *
         */
        try{
            ArrayList<String> cList = new ArrayList();
            cList.add("Deepak");
            cList.add("Rana");
            cList.add("Suriya");
            cList.add("Giridih");
            cList.add("Jharkhand");
            cList.add("825320");

        }catch (Exception e){
            System.out.println();
        }

    }
}
