package ru.netology;

import com.google.common.collect.HashBiMap;

import java.util.*;

public class PhoneBook {
    public static SortedMap<String, Integer> phoneBook = new TreeMap<>();

    public static void add(String name, Integer number) {
        phoneBook.put(name, number);
    }

    public static String findByNumber (Integer number){
        String keyFromBiMap = HashBiMap.create(phoneBook).inverse().get(number);
        return keyFromBiMap;
    }
    public static Integer findByName (String name){
        return phoneBook.get(name);
    }
     public static Set<String> printAllNames(Map map){
        return null;

     }

}
