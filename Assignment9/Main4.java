class Shape {
    static double PI = 3.14;
    double radius;

    void getPerimeter() {
    }

    void getArea() {
    }
}

class Circle extends Shape {
    void getPerimeter() {
        System.out.println(2 * PI * radius);
    }

    void getArea() {
        System.out.println(PI * radius * radius);
    }
  }
    public class Main4 {
    public static void main(String args[]) {
        Circle c = new Circle();

        c.radius = 2.5;
        c.getPerimeter();
        c.getArea();
    }
}