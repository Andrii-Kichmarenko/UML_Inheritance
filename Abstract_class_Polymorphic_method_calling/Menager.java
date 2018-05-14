package Abstract_class_Polymorphic_method_calling;

import java.time.LocalDate;

public class Menager extends Employee{

    private double hourRate;
    private double premiumPercent = 0;

    public Menager(String name, String secondName, LocalDate hireDate, LocalDate birthDate, boolean higherEducation) throws Exception {
        super(name, secondName, hireDate, birthDate);
        hourRate = Employee.getMinRate();
        if(higherEducation != true){
            throw new Exception("Menager must have higher education");
        }
    }

    public double getHourRate() {
        return hourRate;
    }

    public void setHourRate(double hourRate) throws Exception {
        if(hourRate < Employee.getMinRate()){
            throw new Exception("New rate is less than minimal");
        }else{
            this.hourRate = hourRate;
        }
    }

    public double getPremiumPercent() {
        return premiumPercent;
    }

    public void setPremiumPercent(double premiumPercent) {
        this.premiumPercent = premiumPercent;
    }

    public double getSalary(double hours){
        double salary = hourRate * hours;
        salary += (salary / 100)*premiumPercent;
        return salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Hour rate: " + hourRate + "\n");
        sb.append("Premium percentage: " + premiumPercent + "\n");
        return sb.toString();
    }
}