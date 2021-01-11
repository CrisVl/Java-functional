package thread.runnable;

public class RunnabaleMain {

    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Thread executed"));
        t.start();
    }
}
