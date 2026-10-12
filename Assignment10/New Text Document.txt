class Student {
    static int rollno;
    static String name;
    static String collegeName = "GIETU";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static {
        System.out.println("College Name: " + collegeName);
    }

    static void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
    }
}

class A4 {
    public static void main(String args[]) {

        Student s = new Student(101, "Lucky");
        Student.show();

        Student s1 = new Student(102, "Rocky");
        Student.show();
    }
}