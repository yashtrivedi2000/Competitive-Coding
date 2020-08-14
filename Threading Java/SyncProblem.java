// Task class will provide the method to perform the task we're going to show. 
class Task {
    int number;

    Task(int num) {
        this.number = num;
    }

    // Both threads are going to access this same method.
    synchronized void getIncrement() {
        this.number++;
    }
}

class Thread1 extends Thread {
    Task t;

    Thread1(Task t) {
        this.t = t;
    }

    // Calling the method increment of Task class
    @Override
    public void run() {
        t.getIncrement();
    }
}

class Thread2 extends Thread {
    Task t;

    Thread2(Task t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.getIncrement();
    }
}

public class SyncProblem {
    public static void main(String[] args) {
        Task t = new Task(5);

        new Thread1(t).start();
        new Thread2(t).start();

        System.out.println(t.number);
    }
}
