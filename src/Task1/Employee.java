package Task1;

public class Employee {
    String name;
    int age;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    Employee(String name, int age){
        setName(name);
        setAge(age);

    }
}
