import java.io.*;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.sql.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

// ==============================
// 1. Bubble Sort Demo
// ==============================
class BubbleSortDemo {
    public static void run() {
        int[] arr = {100, 20, 30, 10, 50};
        System.out.println("\n--- Bubble Sort Demo ---");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("Pass " + (i+1));
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                printArray(arr);
            }
            System.out.println();
        }
    }
    static void printArray(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}

// ==============================
// 2. Deadlock Example
// ==============================
class DeadlockExample {
    public static void run() {
        final String r1 = "Resource1";
        final String r2 = "Resource2";

        Thread t1 = new Thread(() -> {
            synchronized(r1) {
                System.out.println("Thread1 locked r1");
                try { Thread.sleep(100); } catch(Exception e){}
                synchronized(r2) { System.out.println("Thread1 locked r2"); }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(r2) {
                System.out.println("Thread2 locked r2");
                try { Thread.sleep(100); } catch(Exception e){}
                synchronized(r1) { System.out.println("Thread2 locked r1"); }
            }
        });

        t1.start(); t2.start();
    }
}

// ==============================
// 3. Executor Framework
// ==============================
class ExecutorDemo {
    public static void run() {
        System.out.println("\n--- Executor Framework Demo ---");
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(() -> System.out.println("Task 1 running"));
        service.execute(() -> System.out.println("Task 2 running"));
        service.shutdown();
    }
}

// ==============================
// 4. Reflection API
// ==============================
class Person {
    private String name = "Ashutosh";
}
class ReflectionDemo {
    public static void run() throws Exception {
        System.out.println("\n--- Reflection Demo ---");
        Person p = new Person();
        Field f = Person.class.getDeclaredField("name");
        f.setAccessible(true);
        System.out.println("Name: " + f.get(p));
    }
}

// ==============================
// 5. Custom Annotation
// ==============================
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
}
@MyAnnotation("TestClass")
class Demo {}
class AnnotationDemo {
    public static void run() {
        System.out.println("\n--- Annotation Demo ---");
        MyAnnotation ann = Demo.class.getAnnotation(MyAnnotation.class);
        System.out.println("Annotation value: " + ann.value());
    }
}

// ==============================
// 6. Generics
// ==============================
class Box<T> {
    private T value;
    public void set(T v) { value = v; }
    public T get() { return value; }
}
class GenericDemo {
    public static void run() {
        System.out.println("\n--- Generics Demo ---");
        Box<String> b = new Box<>();
        b.set("Hello Generics");
        System.out.println(b.get());
    }
}

// ==============================
// 7. Streams API
// ==============================
class StreamDemo {
    public static void run() {
        System.out.println("\n--- Streams Demo ---");
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        nums.stream().filter(n -> n%2==0).map(n -> n*n).forEach(System.out::println);
    }
}

// ==============================
// 8. Lambda Expressions
// ==============================
interface MyFunc { void show(String msg); }
class LambdaDemo {
    public static void run() {
        System.out.println("\n--- Lambda Demo ---");
        MyFunc f = (msg) -> System.out.println("Message: " + msg);
        f.show("Hello Lambda");
    }
}

// ==============================
// 9. Singleton Pattern
// ==============================
class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if(instance
