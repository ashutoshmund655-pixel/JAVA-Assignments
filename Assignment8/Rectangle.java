class Rectangle {
    int width;
    int height;

    void area(int w, int h) {
        width = w;
        height = h;
        System.out.println("Area of Rectangle: " + (width * height));
    }

    void perimeter() {
        int p = 2 * (width + height);
        System.out.println("Perimeter of Rectangle: " + p);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.area(5, 6);
        r.perimeter();
    }
}