package abstraction_multiinheritance_aspectInheritance;

public class Intern extends Status{
    private Integer internshipWeeks;

    public Intern(Integer internshipWeeks) {
        this.internshipWeeks = internshipWeeks;
    }

    public int getInternshipWeeks() {
        return internshipWeeks;
    }

    public void setInternshipWeeks(Integer internshipWeeks) {
        if(internshipWeeks == null){
            throw new IllegalArgumentException("InternshipWeeks can't be null.");
        }
        this.internshipWeeks = internshipWeeks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Intership weeks: " + internshipWeeks + "\n");
        return sb.toString();
    }
}
