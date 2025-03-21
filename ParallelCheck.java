class Task extends Thread {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " running on " + Thread.currentThread().getName());
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

public class ParallelCheck {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("CPU Cores Available: " + cores);

        Task t1 = new Task("Task 1");
        Task t2 = new Task("Task 2");

        t1.start();
        t2.start();
    }
}
