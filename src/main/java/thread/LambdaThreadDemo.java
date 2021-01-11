package thread;

public class LambdaThreadDemo {

    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Thread executed"));
        t.start();
    }
}
