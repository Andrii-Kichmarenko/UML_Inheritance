package Abstract_class_Polymorphic_method_calling;

import java.time.LocalDate;

public abstract class Employee extends Person{
    private LocalDate hireDate;
    private LocalDate firedDate;
    private static double minHourRate = 13.0;

    public Employee(String name, String secondName, LocalDate birthDate, LocalDate hireDate) {
        super(name, secondName, birthDate);
        this.hireDate = hireDate;
    }

    public LocalDate getFiredDate() {
        return firedDate;
    }

    public void setFiredDate(LocalDate firedDate) {
        this.firedDate = firedDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public static double getMinRate() {
        return minHourRate;
    }

    public static void setMinHourRate(double rate) {
        Employee.minHourRate = rate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Hiring date: " + hireDate + "\n");
        if(firedDate != null){
            sb.append("Fired data: " + firedDate);
        }else{
            sb.append("Fired data: NULL(still working)\n");
        }
        return sb.toString();
    }

    public abstract double getSalary(double hours);
}
