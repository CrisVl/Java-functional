package functional.interfaces;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        functionOnTheFly(() -> System.out.println("Hello World"));
    }
    public static void functionOnTheFly(MyFunInterface demo) {
        demo.myMethod();
    }
}
