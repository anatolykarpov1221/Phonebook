package com.phonebook.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProvider {
    @DataProvider
public Iterator<Object[]> addNewContact() {

    List<Object[]> list = new ArrayList<>();
    list.add(new Object[]{"Oliver", "Kan", "1234567890", "kan@gm.com", "Munich", "goalkeeper"});
    list.add(new Object[]{"Oliver1", "Kan", "1234567890", "kan@gm.com", "Munich", "goalkeeper"});
    list.add(new Object[]{"Oliver2", "Kan", "1234567890", "kan@gm.com", "Munich", "goalkeeper"});

    return list.iterator();
}
}
