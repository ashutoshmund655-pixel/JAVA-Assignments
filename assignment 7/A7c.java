class Area {
    static void rectangle(int l, int b) {
        int area = l * b;
        System.out.println("Area of rectangle = " + area);
    }
    void square(int side) {
        int area = side * side;
        System.out.println("Area of square = " + area);
    }

    public static void main(String args[]) {
        rectangle(10, 5);
        Area obj = new Area();
        obj.square(6);
    }
}
