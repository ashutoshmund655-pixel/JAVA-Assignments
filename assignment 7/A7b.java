import java.util.Scanner;

class Student {
    String name;
    int roll_no;
    String course;

    void selectCourse() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select course:");
        System.out.println("1. ECE");
        System.out.println("2. CSE");
        System.out.println("3. EEE");

        int choice = sc.nextInt();

        if (choice == 1) {
            course = "ECE";
        } else if (choice == 2) {
            course = "CSE";
        } else if (choice == 3) {
            course = "EEE";
        } else {
            course = "Invalid course";
        }
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Roll No = " + roll_no);
        System.out.println("Course = " + course);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.println("Enter name:");
        s.name = sc.nextLine();

        System.out.println("Enter roll no:");
        s.roll_no = sc.nextInt();

        s.selectCourse();
        s.display();

        sc.close();
    }
}
