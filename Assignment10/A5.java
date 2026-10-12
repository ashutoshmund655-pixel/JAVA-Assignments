class P1 {
    int a;
}

class P2 extends P1 {
    int b;
}

class Child extends P2 {
    void input() {
        a = 5;
        b = 10;
    }
}

class D extends Child {
    void sum() {
        System.out.println(a + b);
    }
}

class A5 {
    public static void main(String args[]) {
        D obj = new D();
        obj.input();
        obj.sum();
    }
}