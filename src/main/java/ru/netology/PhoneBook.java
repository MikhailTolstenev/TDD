package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static Map<String, Integer> phoneBook = new HashMap<>();

    public static void add(String name, Integer number) {
        phoneBook.put(name, number);
    }

    public static String findByNumber (int number){
        return null;
    }

}
