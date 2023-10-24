package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.netology.PhoneBook.phoneBook;

class PhoneBookTest {

    @Test
    void add() {
        String name = "Ivan";
        Integer number = 35987;
        PhoneBook.add(name,number);
        assertEquals(phoneBook.get(name),number);




    }
}