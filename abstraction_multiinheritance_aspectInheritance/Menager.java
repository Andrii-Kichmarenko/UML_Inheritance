package abstraction_multiinheritance_aspectInheritance;

import java.time.LocalDate;

public class Menager extends Employee implements IMenager{

    private double bonusPercent = 0;

    public Menager(String name, String secondName, LocalDate birthDate, double hourRate, boolean higherEducation,
                   StatusType statusType, LocalDate hiredDate, Integer internshipWeeks ) throws Exception {
        super(name, secondName, birthDate, hourRate, statusType, hiredDate, internshipWeeks );
        if(higherEducation != true){
            throw new Exception("Menager must have higher education.");
        }
    }

    public double getBonusPercent() {
        return bonusPercent;
    }

    public void setBonusPercent(double bonusPercent) {
        this.bonusPercent = bonusPercent;
    }

    @Override
    public double getMonthPercentBonus(double hours){
        double salary = getHourRate() * hours;
        return (salary / 100)* bonusPercent;
    }
    @Override
    public double getTotalMonthSalary(double hours){
        double salary = getHourRate() * hours;
        salary += (salary / 100)* bonusPercent;
        return salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Bonus percent: " + bonusPercent + "\n");
        return sb.toString();
    }
}