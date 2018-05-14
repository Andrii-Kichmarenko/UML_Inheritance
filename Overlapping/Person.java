package Overlapping;


import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public abstract class Person{
    private String firstName;
    private String secondName;
    private LocalDate birthDate;


    public Person(String name, String secondNane, LocalDate birthDate) {
        super();
        if (name == null || secondNane == null || birthDate == null) {
            throw new NullPointerException("System required full name and birth date of person.");
        } else {
            this.firstName = name;
            this.secondName = secondNane;
            this.birthDate = birthDate;
        }
    }

    public int getAge() {
        return Period.between(birthDate,LocalDate.now()).getYears();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t\t***********************************\n");
        sb.append("\t\t\tFull name: " + firstName + " " + secondName + "\n");
        sb.append("\t\t\tBirth date: " + birthDate + "\n");
        sb.append("\t\t\tAge: " + getAge() + "\n");
        return sb.toString();
    }
}
