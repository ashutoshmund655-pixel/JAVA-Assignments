class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    void circumference() {
        double pi = 3.14;
        double c = 2 * pi * radius;
        System.out.println("Circumference of Circle: " + c);
    }

    public static void main(String args[]) {
        Circle c = new Circle(2.5);

        c.area();
        c.circumference();
    }
}