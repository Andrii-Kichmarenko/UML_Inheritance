package dynamicInheritance;

public class TruckDriver {

    private String truckDriversLicense;
    private Double truckDriverWorkingHoursPerWeek;
    private Employee employee;

    public TruckDriver(Employee employee, String truckDriversLicense, Double truckDriverWorkingHoursPerWeek) {
        this.employee = employee;
        this.truckDriversLicense = truckDriversLicense;
        this.truckDriverWorkingHoursPerWeek = truckDriverWorkingHoursPerWeek;
    }

    public String getTruckDriversLicnse() {
        return truckDriversLicense;
    }

    public void setTruckDriversLicense(String truckDriversLicense){
        if(truckDriversLicense == null){
            throw new IllegalArgumentException("Driver license can't be null!");
        }
        this.truckDriversLicense = truckDriversLicense;
    }

    public Double getTruckDriverWorkingHoursPerWeek() {
        return truckDriverWorkingHoursPerWeek;
    }

    public void setTruckDriverWorkingHoursPerWeek(Double weekWorkingHours){
        if(weekWorkingHours == null){
            throw new IllegalArgumentException("Working hours can't be null!");
        }
        this.truckDriverWorkingHoursPerWeek = weekWorkingHours;
    }

    public void setEmployee(Employee employee){
        this.employee = employee;
    }

    public double getWorkingHoursPerMonth(){
        return truckDriverWorkingHoursPerWeek.doubleValue() * 4;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Driver type: combine driver" + "\n");
        sb.append("Truck driver license: " + truckDriversLicense + "\n");
        sb.append("Week working hours like a truck driver: " + truckDriverWorkingHoursPerWeek + "\n");
        sb.append("Total working hours per month: " + getWorkingHoursPerMonth() + "\n");
        return sb.toString();
    }
}
