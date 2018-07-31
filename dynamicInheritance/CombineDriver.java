package dynamicInheritance;

public class CombineDriver {

    public enum CombineLicenseType{A, B, C};

    private Enum<CombineLicenseType> combineLicenseType;
    private String combineDriversLicense;
    private Double combineDriverWorkingHoursPerWeek;
    private Employee employee;

    public CombineDriver(Employee employee, String combineDriversLicense, CombineLicenseType combineLicenseType, Double combineDriverWorkingHoursPerWeek) {
        this.combineLicenseType = combineLicenseType;
        this.combineDriversLicense = combineDriversLicense;
        this.combineDriverWorkingHoursPerWeek = combineDriverWorkingHoursPerWeek;
        this.employee = employee;
    }

    public String getCombineDriversLicense() {
        return combineDriversLicense;
    }

    public void setCombineDriversLicense(String combineDriversLicense){
        if(combineDriversLicense == null){
            throw new IllegalArgumentException("Driver license can't be null!");
        }
        this.combineDriversLicense = combineDriversLicense;
    }

    public Double getCombineDriverWorkingHoursPerWeek() {
        return combineDriverWorkingHoursPerWeek;
    }

    public void setCombineDriverWorkingHoursPerWeek(Double weekWorkingHours){
        if(weekWorkingHours == null){
            throw new IllegalArgumentException("Working hours can't be null!");
        }
        this.combineDriverWorkingHoursPerWeek = weekWorkingHours;
    }

    public void setEmployee(Employee employee){
        this.employee = employee;
    }

    public double getWorkingHoursPerMonth(){
        return combineDriverWorkingHoursPerWeek.doubleValue() * 4;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Driver type: combine driver"+ "\n")
        .append("Combine driver license: " + combineDriversLicense + "\n")
                .append("Driver license type: " + combineLicenseType.toString() + "\n")
        .append("Total working hours per month: " + getWorkingHoursPerMonth() + "\n");
        return sb.toString();
    }
}
