import Abstract_class_Polymorphic_method_calling.Mechanic;
import Abstract_class_Polymorphic_method_calling.Menager;
import Overlapping.Driver;

import java.time.LocalDate;
import java.util.EnumSet;

public class Main {

    public static void main(String args[]) throws Exception{

        //Test: Klasa abstrakcyjna i polimorficzne wolanie metod
        System.out.println("Klasa abstrakcyjna i polimorficzne wolanie metod************************************");

        Menager menager1 = new Menager("Jan", "Domanski", LocalDate.of(1994,2,1), LocalDate.now(), true);
        Mechanic mechanic1 = new Mechanic("Michal", "Michalski", LocalDate.of(1990,3,10), LocalDate.now());

        menager1.setHourRate(19);
        menager1.setPremiumPercent(7);

        mechanic1.setHourRate(23);

        System.out.println(menager1);
        System.out.println(mechanic1);

        System.out.println(menager1.getSalary(40));
        System.out.println(mechanic1.getSalary(40));
        System.out.println("***********************************************************************************");

        //Test: Dzidziczenie overlapping -> klasa wspolna
        System.out.println("Dzidziczenie overlapping -> klasa wspolna******************************************");

        Driver driver1 = new Driver("Tadeusz", "Kosciuszko", LocalDate.of(1985,11,10),
                LocalDate.now(), EnumSet.of(Driver.DriverTypes.COMBINE, Driver.DriverTypes.TRUCK),
                "CB6790543L", "TR6793490L", Double.valueOf(25), Double.valueOf(15));

        driver1.setCombineDriversLicense("999999999999");
        System.out.println(driver1);
        System.out.println(driver1.getWorkingHoursPerMonth());

        Driver driver2 = new Driver("Aleksander", "Jagiellonczyk", LocalDate.of(1975,3,30),
                LocalDate.now(), EnumSet.of(Driver.DriverTypes.TRUCK),
                null, "CB6790543L", null ,Double.valueOf(40));
//        driver2.setCombineDriversLicense("45363463456");
    }
}
