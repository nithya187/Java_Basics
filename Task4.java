abstract class Employee {
    void workHours() {
        System.out.println("Working 9 to 5");
    }
     
    abstract void calculateSalary();
}

class Manager extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Manager salary is calculated");
    }
}

public class Task4 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.workHours();
        m.calculateSalary();
    }
}
