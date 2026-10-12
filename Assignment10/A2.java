interface A {
    default void show() {
        System.out.println("This is A Interface");
    }
}

interface B {
    default void show() {
        System.out.println("This is B Interface");
    }
}

class C implements A, B {
    public void show() {
        A.super.show();
        B.super.show();
    }
}

public class A2 {
    public static void main(String args[]) {
        C obj = new C();
        obj.show();
    }
}
