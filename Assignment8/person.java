class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String args[]) {
        Person p = new Person("Ashutosh", 18);
        Person p1 = new Person("Piyush", 19);

        p.display();
        p1.display();
    }
}