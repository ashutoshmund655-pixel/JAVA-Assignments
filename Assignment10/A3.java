class Student {
    int rollno;
    String name;

    Student() {
        this(101, "Ashutosh Mund");
    }

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void show() {
        this.showName();
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollno);
    }
    void showName() {
        System.out.println("Students Details:");
    }
}

class A3 {
    public static void main(String args[]) {
        Student s = new Student();
        s.show();
    }
}