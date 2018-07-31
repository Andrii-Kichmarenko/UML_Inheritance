package overlappingInheritance;

import java.time.LocalDate;
import java.util.EnumSet;

public class Main {

    public static void main(String args[]) throws Exception{

        //An overlapping inheritance -> common class
        Driver driver1 = new Driver("Tadeusz", "Kosciuszko", LocalDate.of(1985,11,10),
                LocalDate.now(), EnumSet.of(Driver.DriverTypes.COMBINE, Driver.DriverTypes.TRUCK),
                "CB6790543L", "TR6793490L", Double.valueOf(25), Double.valueOf(15));

        driver1.setCombineDriversLicense("999999999999");
        System.out.println(driver1);
        System.out.println(driver1.getWorkingHoursPerMonth());

        Driver driver2 = new Driver("Aleksander", "Jagiellonczyk", LocalDate.of(1995,3,30),
                LocalDate.now(), EnumSet.of(Driver.DriverTypes.TRUCK),
                null, "CB6790543L", null ,Double.valueOf(40));
    }
}
