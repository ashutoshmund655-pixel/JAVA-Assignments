class Employee {
    String name;
    String job;
    double salary;

    double calculateSalary(int workingDays) {
        double dailySalary = salary / 30;
        return dailySalary * workingDays;
    }

    void updateSalary(int workingDays) {
        salary = calculateSalary(workingDays);
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Job = " + job);
        System.out.println("Salary = " + salary);
    }
}

public class Main {
    public static void main(String args[]) {

        Employee e = new Employee();

        e.name = "Rahul";
        e.job = "Manager";
        e.salary = 30000;

        double newSalary = e.calculateSalary(25);

        System.out.println("Calculated Salary = " + newSalary);

        e.updateSalary(25);

        System.out.println("Updated Employee Details:");
        e.display();
    }
}
