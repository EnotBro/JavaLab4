package com.mycorp;

/**
 * class Person
 */
public class Person {
    private int id;
    private String name;
    private String gender;
    private Division division;
    private int salary;
    private String birthdate;

    /**
     * Creates a person with his id, name, gender, birthdate, division and salary
     * @param id id of thr person
     * @param name name of the person
     * @param gender gender of the person
     * @param birthdate birthdate of the person
     * @param division division to which the person belong
     * @param salary salary of the person
     */
    public Person(int id, String name, String gender, String birthdate, Division division, int salary)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.division = division;
        this.salary = salary;
        this.birthdate = birthdate;
    }



    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", division=" + division +
                ", salary=" + salary +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
