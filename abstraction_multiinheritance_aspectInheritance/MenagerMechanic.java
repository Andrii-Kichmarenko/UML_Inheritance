package abstraction_multiinheritance_aspectInheritance;

import java.time.LocalDate;

public class MenagerMechanic extends Mechanic implements IMenager{

    Menager menager;

    public MenagerMechanic(String name, String secondName, LocalDate birthDate,
                           double monthSalaryBonus, double hourRate, boolean higherEducation,  StatusType statusType,
                           LocalDate hiredDate, Integer internshipWeeks ) throws Exception {
        super(name, secondName, birthDate,  hourRate, monthSalaryBonus, statusType, hiredDate, internshipWeeks );
        this.menager = new Menager(name, secondName, birthDate, hourRate, higherEducation, statusType, hiredDate, internshipWeeks );
    }
    @Override
    public double getMonthPercentBonus(double hours){
        return menager.getMonthPercentBonus(hours) + getMonthSalaryBonus();
    }
    @Override
    public double getTotalMonthSalary(double hours){
        return menager.getTotalMonthSalary(hours/2) + super.getTotalMonthSalary(hours/2);
    }

    public double getBonusPercent() {
        return menager.getBonusPercent();
    }

    public void setBonusPercent(double bonusPercent) {
        menager.setBonusPercent(bonusPercent);
    }
}