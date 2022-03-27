package com.mycorp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = getListOfPeopleFromFile("foreign_names.csv");
        for (Person person : people)
        {
            System.out.println(person);
        }

    }

    /**
     * Create list of people (class person) from csv file by name of the file
     * @param filename name of the file
     * @return list of people (class person)
     */
    public static List<Person> getListOfPeopleFromFile(String filename)
    {
        List<Person> people = new ArrayList<>();
        BufferedReader reader = null;

        try{
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream in = classloader.getResourceAsStream(filename);
            if (in==null) throw new FileNotFoundException();
            reader = new BufferedReader(new InputStreamReader(in));

            reader.readLine();
            String line ;
            while ((line = reader.readLine()) != null)
            {
                String[] row = line.split(";");

                int id = Integer.parseInt(row[0]);
                String name = row[1];
                String gender = row[2];
                String birthdate = row[3];
                String nameOfDivision = row[4];
                int salary = Integer.parseInt(row[5]);

                people.add(new Person(id,name,gender,birthdate, Division.getDivisionByName(nameOfDivision),salary));
            }
        }
        catch (Exception e){
            System.out.println("Some problems with file");
            e.printStackTrace();

        }
        finally {
            try{
                reader.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }


        return people;
    }
}
