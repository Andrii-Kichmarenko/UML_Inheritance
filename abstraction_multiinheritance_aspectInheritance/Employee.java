package abstraction_multiinheritance_aspectInheritance;

import java.time.LocalDate;

public abstract class Employee extends Person{

    private double hourRate;
    private static double minHourRate = 13.0;
    private Status status;

    public enum StatusType {INTERN, WORKER}

    public Employee(String name, String secondName, LocalDate birthDate,  double hourRate, StatusType statusType, LocalDate hiredDate, Integer internshipWeeks ) {
        super(name, secondName, birthDate);
        this.hourRate = hourRate;
        if (statusType == StatusType.INTERN) {
            this.status = new Intern(internshipWeeks);
        } else if (statusType == StatusType.WORKER) {
            this.status = new Worker(hiredDate);
        }
    }

    public void becomeWorker(LocalDate hired) {
        this.status = new Worker(hired);
    }

    public void becomeIntern(Integer internshipWeeks) {
        this.status = new Intern(internshipWeeks);
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

    public static double getMinRate() {
        return minHourRate;
    }

    public static void setMinHourRate(double rate) {
        Employee.minHourRate = rate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Hour rate: " + hourRate + "\n");
        sb.append(status);

        return sb.toString();
    }

    public abstract double getTotalMonthSalary(double hours);
}
