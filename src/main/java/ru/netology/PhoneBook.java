package ru.netology;

import com.google.common.collect.HashBiMap;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static Map<String, Integer> phoneBook = new HashMap<>();

    public static void add(String name, Integer number) {
        phoneBook.put(name, number);
    }

    public static String findByNumber (Integer number){
        String keyFromBiMap = HashBiMap.create(phoneBook).inverse().get(number);
        return keyFromBiMap;
    }
    public static Integer findByName (String name){
        return null;
    }

}
