import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * InnerExecutorsExample: A basic example of Executors, which are very useful
 * for multi-threading. It creats a thread pool and helps to solve the problem
 * of high overheads by spliting tasks among the threads.
 */

public class ExecutorsExample {
    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(coreCount);
        for (int i = 0; i < 100; i++) {
            service.execute(new Task());
            System.out.println(i);
        }
    }

    static class Task implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
