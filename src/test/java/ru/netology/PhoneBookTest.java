package ru.netology;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static ru.netology.PhoneBook.phoneBook;

class PhoneBookTest {

    @Test
    void add() {
        String name = "Ivan";
        Integer number = 35987;
        PhoneBook.add(name, number);
        assertEquals(phoneBook.get(name), number);

    }

    @Test
    void findByNumber() {
        String name = "Ivan";
        Integer number = 35987;
        PhoneBook.add(name, number);
        assertEquals(PhoneBook.findByNumber(number),name);


    }

    @Test
    void findByName() {
        String name = "Ivan";
        Integer number = 35987;
        PhoneBook.add(name, number);
        assertEquals(PhoneBook.findByName(name),number);

    }

    @Test
    void printAllNames() {
        String name1 = "Ivan";
        Integer number1 = 35987;
        String name2 = "Nikola";
        Integer number2 = 35981;
        PhoneBook.add(name1, number1);
        PhoneBook.add(name2, number2);
        Set<String> set = phoneBook.keySet();
        assertEquals(PhoneBook.printAllNames(phoneBook),set);



    }
}