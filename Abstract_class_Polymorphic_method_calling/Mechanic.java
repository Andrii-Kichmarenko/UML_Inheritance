package Abstract_class_Polymorphic_method_calling;

import java.time.LocalDate;

public class Mechanic extends Employee{

    private double hourRate;

    public Mechanic(String name, String secondName, LocalDate hireDate, LocalDate birthDate) {
        super(name, secondName, hireDate, birthDate);
        hourRate = Employee.getMinRate();
    }

    public double getHourRate() {
        return hourRate;
    }

    public void setHourRate(double hourRate) throws Exception {
        if(hourRate < Employee.getMinRate()){
            throw new Exception("New rate is less than minimum");
        }else{
            this.hourRate = hourRate;
        }
    }

    public double getSalary(double hours){
        return hourRate * hours;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Hour rate: " + hourRate + "\n");
        return sb.toString();
    }
}