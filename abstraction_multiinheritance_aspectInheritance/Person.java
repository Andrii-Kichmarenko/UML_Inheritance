package abstraction_multiinheritance_aspectInheritance;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public abstract class Person {
    private String name;
    private String secondName;
    private LocalDate birthDate;
    private ArrayList<String> foreignLanguages;

    public Person(String name, String secondNane, LocalDate birthDate) {
        super();
        if (name == null || secondNane == null || birthDate == null) {
            throw new NullPointerException("System required full name and birth date of person.");
        } else {
            this.name = name;
            this.secondName = secondNane;
            this.birthDate = birthDate;
        }
    }

    public Person(String name, String secondNane) {
        super();
        if (name == null || secondNane == null ) {
            throw new NullPointerException("System required full name of person.");
        } else {
            this.name = name;
            this.secondName = secondNane;
        }
    }

    public int getAge() {
        return Period.between(birthDate,LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
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

    public ArrayList<String> getForeignLanguages() {
        return foreignLanguages;
    }

    public void addForeignLanguage(String... language) {
        if(foreignLanguages == null){
            foreignLanguages = new ArrayList<String>();
        }else{
            for(int i = 0; i<language.length; i++){
                foreignLanguages.add(language[i]);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("***********************************\n");
        sb.append("Full name: " + name + " " + secondName + "\n");
        sb.append("Birth date: " + birthDate + "\n");
        sb.append("Age: " + getAge() + "\n");
        return sb.toString();
    }
}

