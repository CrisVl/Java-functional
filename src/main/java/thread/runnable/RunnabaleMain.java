package thread.runnable;

public class RunnabaleMain {


    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread t = new Thread(runnableDemo);
        runnableDemo.run();
    }
}
