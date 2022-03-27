package com.mycorp;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.*;
import java.util.ArrayList;
import java.util.List;

class MainTest {

    @Test
    void getListOfPeopleFromFile() {
        List<Person> actual = Main.getListOfPeopleFromFile("test1.csv");
        List<Person> expected = new ArrayList<>();

        //1
        int id = 28281;
        String name = "Alan";
        String gender = "Male";
        String birthdate = "15.05.1970";
        String nameOfDivision = "I";
        int salary = 4800;
        expected.add(new Person(id,name,gender,birthdate, Division.getDivisionByName(nameOfDivision),salary));

        //2
        id = 28282;
        name = "Anna";
        gender = "Female";
        birthdate = "07.02.1983";
        nameOfDivision = "J";
        salary = 2600;
        expected.add(new Person(id,name,gender,birthdate, Division.getDivisionByName(nameOfDivision),salary));

        //3
        id = 28283;
        name = "Alina";
        gender = "Female";
        birthdate = "06.11.1949";
        nameOfDivision = "J";
        salary = 1000;
        expected.add(new Person(id,name,gender,birthdate, Division.getDivisionByName(nameOfDivision),salary));

        //4
        id = 28284;
        name = "Ilya";
        gender = "Male";
        birthdate = "04.02.1944";
        nameOfDivision = "G";
        salary = 1000;
        expected.add(new Person(id,name,gender,birthdate, Division.getDivisionByName(nameOfDivision),salary));

        Assertions.assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }
}