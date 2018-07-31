package dynamicInheritance;



import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Driver driver1 = new Driver("Andrii", "Kichmarenko",
                LocalDate.of(1995, 10, 9), LocalDate.now(), Driver.DriverTypes.TRUCK,
                null, null,"FKH00845", null, 40.0);
        System.out.println(driver1);

        driver1.becomeCombineDriver("CB80983", CombineDriver.CombineLicenseType.A ,30.0);
        System.out.println(driver1);

        driver1.becomeTruckDriver("FKH00845",40.0);
        System.out.println(driver1);

    }
}