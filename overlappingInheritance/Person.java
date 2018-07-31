package overlappingInheritance;


import java.time.LocalDate;
import java.time.Period;

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
        sb.append("***********************************\n");
        sb.append("Full name: " + firstName + " " + secondName + "\n");
        sb.append("Birth date: " + birthDate + "\n");
        sb.append("Age: " + getAge() + "\n");
        return sb.toString();
    }
}
