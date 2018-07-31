package abstraction_multiinheritance_aspectInheritance;

import java.time.LocalDate;

public class Worker extends Status {
    private LocalDate hireDate;
    private LocalDate firedDate;

    public Worker(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public LocalDate getFiredDate() {
        return firedDate;
    }

    public void setFiredDate(LocalDate firedDate) {
        this.firedDate = firedDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Hiring date: " + hireDate + "\n");
        if(firedDate != null){
            sb.append("Fired data: " + firedDate);
        }else{
            sb.append("Fired data: NULL(still working)\n");
        }
        return sb.toString();
    }
}
