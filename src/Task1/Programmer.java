package Task1;


public class Programmer extends Employee implements AttendTraining{
    String programmingLanguage;
    public Programmer(String name, int age, String programmingLanguage) {
        super(name, age);
        setProgrammingLanguage(programmingLanguage);
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public void attendTraining() {
        System.out.println(this.getName() + " is attending training.");
    }
}
