package abstraction_multiinheritance_aspectInheritance;

import java.time.LocalDate;

public class Mechanic extends Employee{

    private double monthSalaryBonus;

    public Mechanic(String name, String secondName, LocalDate birthDate, double hourRate, double monthSalaryBonus,
                    StatusType statusType, LocalDate hiredDate, Integer internshipWeeks ) {
        super(name, secondName, birthDate, hourRate,statusType ,hiredDate ,internshipWeeks );
        this.monthSalaryBonus = monthSalaryBonus;
    }

    public double getMonthSalaryBonus() {
        return monthSalaryBonus;
    }

    public void setMonthSalaryBonus(double monthSalaryBonus) {
        this.monthSalaryBonus = monthSalaryBonus;
    }

    public double getTotalMonthSalary(double hours){
        return getHourRate() * hours;
    }

    @Override
    public String toString() {
        String str = new String( super.toString() + "Mounth salary bonus: " + monthSalaryBonus + "\n");
        return str;
    }
}