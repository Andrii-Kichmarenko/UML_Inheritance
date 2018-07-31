package dynamicInheritance;

import java.time.LocalDate;

public class Driver extends Employee {

    public enum DriverTypes { COMBINE, TRUCK }

    private CombineDriver combineDriver;
    private TruckDriver truckDriver;

    public Driver(String name, String secondName, LocalDate birthDate, LocalDate hireDate,
                  DriverTypes driverType, String combineDriversLicense, CombineDriver.CombineLicenseType combineLicenseType, String truckDriversLicense,
                  Double combineDriverWorkingHoursPerWeek, Double truckDriverWorkingHoursPerWeek) {
        super(name, secondName, birthDate, hireDate);

        if(driverType.equals(DriverTypes.COMBINE)){
            combineDriver = new CombineDriver(this, combineDriversLicense, combineLicenseType, combineDriverWorkingHoursPerWeek);
        }else if(driverType.equals(DriverTypes.TRUCK)){
            truckDriver = new TruckDriver(this, truckDriversLicense, truckDriverWorkingHoursPerWeek);
        }
    }

    public void becomeCombineDriver(String combineDriversLicense, CombineDriver.CombineLicenseType licenseType, Double combineDriverWorkingHoursPerWeek){
        if(combineDriver == null) {
            combineDriver = new CombineDriver(this, combineDriversLicense,licenseType, combineDriverWorkingHoursPerWeek);
            if(truckDriver != null){
                truckDriver.setEmployee(null);
                truckDriver = null;
            }
        }
    }

    public void becomeTruckDriver(String truckDriversLicense, Double truckDriverWorkingHoursPerWeek){
        if(truckDriver == null) {
            truckDriver = new TruckDriver(this, truckDriversLicense, truckDriverWorkingHoursPerWeek);
            if(combineDriver != null){
                combineDriver.setEmployee(null);
                combineDriver = null;
            }
        }
    }

    public CombineDriver getCombineDriver() {
        return combineDriver;
    }

    public TruckDriver getTruckDriver() {
        return truckDriver;
    }


    public boolean hasDriverType(DriverTypes driverType){
        if(driverType == DriverTypes.COMBINE && combineDriver != null){
            return true;
        }else if(driverType == DriverTypes.TRUCK && truckDriver != null){
            return true;
        }
        return false;
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        if(hasDriverType(DriverTypes.COMBINE)){
            sb.append(combineDriver.toString() + "\n");
        }
        if(hasDriverType(DriverTypes.TRUCK)){
            sb.append(truckDriver.toString() + "\n");
        }

        return sb.toString();
    }
}