package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddContactTests extends TestBase {

    public void addContactPositiveTest() {
        Assert.assertTrue(app.getContact().isContactCreated("Petr"));
    }

    @AfterMethod
    public void postCondition() {
        app.getContact().removeContact();
    }

//    @DataProvider
//    public Iterator<Object[]> addNewContact() {
//        List<Object[]> list = new ArrayList<>();
//        list.add(new Object[]{"Petr1", "Petrov", "17364548828", "petr@web.com", "Munich", "goalkeeper"});
//        list.add(new Object[]{"Petr2", "Petrov", "17364548828", "petr@web.com", "Munich", "goalkeeper"});
//        list.add(new Object[]{"Petr3", "Petrov", "17364548828", "petr@web.com", "Munich", "goalkeeper"});
//        // @Test(dataProvider = "addNewContact")
//        Iterator<Object[]> object;
//        return object;
//
//    }
}




