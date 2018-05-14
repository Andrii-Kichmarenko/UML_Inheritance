package Overlapping;

import java.time.LocalDate;
import java.util.EnumSet;

public class Driver extends Employee{
    public enum DriverTypes { COMBINE, TRUCK }
    private EnumSet<DriverTypes> driverTypes;

    private String combineDriversLicense;
    private Double combineDriverWeekWorkingHours;

    private String truckDriversLicense;
    private Double truckDriverWorkingHoursPerWeek;


    public Driver(String name, String secondName, LocalDate birthDate, LocalDate hireDate,
                  EnumSet<DriverTypes> driverTypes, String combineDriversLicense, String truckDriversLicense,
                  Double combineDriverWorkingHoursPerWeek, Double truckDriverWorkingHoursPerWeek) {
        super(name, secondName, birthDate, hireDate);
        this.driverTypes = driverTypes;

        if(driverTypes.contains(DriverTypes.COMBINE)){
            this.combineDriversLicense =  combineDriversLicense;
            this.combineDriverWeekWorkingHours = combineDriverWorkingHoursPerWeek;
        }
        if(driverTypes.contains(DriverTypes.TRUCK)){
            this.truckDriversLicense =  truckDriversLicense;
            this.truckDriverWorkingHoursPerWeek = truckDriverWorkingHoursPerWeek;
        }
    }

    public boolean hasDriverType(DriverTypes driverType){
        if(driverTypes.contains(driverType)){
            return true;
        }
        return false;
    }

    public String getCombineDriversLicense() {
        if(!hasDriverType(DriverTypes.COMBINE)){
            throw new IllegalArgumentException("Isn't combine driver!");
        }
        return combineDriversLicense;
    }

    public void setCombineDriversLicense(String combineDriversLicense){
        if(!hasDriverType(DriverTypes.COMBINE)){
            throw new IllegalArgumentException("Isn't a combine driver!");
        }
        if(combineDriversLicense == null){
            throw new IllegalArgumentException("Driver license can't be null!");
        }

        this.combineDriversLicense = combineDriversLicense;
    }

    public String getTruckDriversLicense() {
        if(!hasDriverType(DriverTypes.TRUCK)){
            throw new IllegalArgumentException("Isn't truck driver!");
        }
        return truckDriversLicense;
    }

    public void setTruckDriversLicense(String truckDriversLicense){
        if(!hasDriverType(DriverTypes.TRUCK)){
            throw new IllegalArgumentException("Isn't a truck driver!");
        }
        if(truckDriversLicense == null){
            throw new IllegalArgumentException("Driver license can't be null!");
        }
        this.truckDriversLicense = truckDriversLicense;
    }

    public Double getCombineDriverWeekWorkingHours() {
        return combineDriverWeekWorkingHours;
    }

    public void setCombineDriverWeekWorkingHours(Double weekWorkingHours){
        if(!hasDriverType(DriverTypes.COMBINE)){
            throw new IllegalArgumentException("Isn't a combine driver!");
        }
        if(weekWorkingHours == null){
            throw new IllegalArgumentException("Working hours can't be null!");
        }
        this.combineDriverWeekWorkingHours = weekWorkingHours;
    }

    public Double getTruckDriverWorkingHoursPerWeek() {
        return truckDriverWorkingHoursPerWeek;
    }

    public void setTruckDriverWorkingHoursPerWeek(Double weekWorkingHours){
        if(!hasDriverType(DriverTypes.TRUCK)){
            throw new IllegalArgumentException("Isn't a truck driver!");
        }
        if(weekWorkingHours == null){
            throw new IllegalArgumentException("Working hours can't be null!");
        }
        this.truckDriverWorkingHoursPerWeek = weekWorkingHours;
    }

    public EnumSet<DriverTypes> getDriverTypes() {
        return driverTypes;
    }

    public double getWorkingHoursPerMonth(){
        if(hasDriverType(DriverTypes.COMBINE) && hasDriverType(DriverTypes.TRUCK)){
            return (combineDriverWeekWorkingHours.doubleValue() + truckDriverWorkingHoursPerWeek.doubleValue()) * 4;
        }else if(hasDriverType(DriverTypes.COMBINE)){
            return combineDriverWeekWorkingHours.doubleValue() * 4;
        }else{
            return truckDriverWorkingHoursPerWeek.doubleValue() * 4;
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        if(hasDriverType(DriverTypes.COMBINE)){
            sb.append("\t\t\tCombine driver license: " + combineDriversLicense + "\n");
            sb.append("\t\t\tWeek working hours like a combine driver: " + combineDriverWeekWorkingHours + "\n");
        }
        if(hasDriverType(DriverTypes.TRUCK)){
            sb.append("\t\t\tTruck driver license: " + truckDriversLicense + "\n");
            sb.append("\t\t\tWeek working hours like a truck driver: " + truckDriverWorkingHoursPerWeek + "\n");
        }
        sb.append("\t\t\tTotal working hours per month: " + getWorkingHoursPerMonth() + "\n");
        return sb.toString();
    }
}




/*
    public void addDriverType(DriverTypes driverType){
        if(driverType == null){
            throw new IllegalArgumentException("DriverType can't be null!");
        }
        if(!driverTypes.contains(driverType)){
            driverTypes.add(driverType);
        }
    }

    public void removeDriveType(DriverTypes driveType){
        if(driveType == null){
            throw new IllegalArgumentException("DriverType can't be null!");
        }
        if(driverTypes.contains(driveType)){
            driverTypes.remove(driveType);
        }
    }
 */