package abstraction_multiinheritance_aspectInheritance;

import java.time.LocalDate;

public class Main {
    public static void main(String args[]) throws Exception {

        //An abstract class and polymorphic method invocation
        Employee menager1 = new Menager("Jan", "Domanski",
                LocalDate.of(1994, 2, 1), 20, true, Employee.StatusType.WORKER, LocalDate.now(), null);
        Employee mechanic1 = new Mechanic("Michal", "Michalski",
                LocalDate.of(1990, 3, 10), 22, 800, Employee.StatusType.WORKER, LocalDate.now(), null);

        menager1.setHourRate(19);
        ((Menager) menager1).setBonusPercent(7);

        mechanic1.setHourRate(23);

        System.out.println(menager1);
        System.out.println(mechanic1);

        System.out.println(menager1.getTotalMonthSalary(40));
        System.out.println(mechanic1.getTotalMonthSalary(40));


        // A multi-inheritance
        Employee managerMechanik = new MenagerMechanic("Martyn", "Gnys",
                LocalDate.of(1966,10,20), 900, 22, true, Employee.StatusType.WORKER, LocalDate.now(), null);
        System.out.println(managerMechanik.getTotalMonthSalary(160));


        // An aspect inheritance
        Menager newMenagerIntern = new Menager("John", "Wick",
                LocalDate.of(1975,10,10), 18, true, Employee.StatusType.INTERN, null, 12);
        System.out.println(newMenagerIntern);
        newMenagerIntern.becomeWorker(LocalDate.now());
        newMenagerIntern.setBonusPercent(3.0);
        System.out.println(newMenagerIntern);
    }

}
