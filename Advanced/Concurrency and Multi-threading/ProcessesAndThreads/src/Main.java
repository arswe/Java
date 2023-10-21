public class Main {
    public static void main(String[] args) {
        // Processes And Threads:

        // Process: an instance of a program
        // Thread: a sequence of instructions within a process
        // Multithreading: multiple threads running concurrently
        // Concurrency: multiple tasks making progress at the same time
        // Parallelism: multiple tasks executing at the same time
        // Thread Scheduler: the part of the OS that decides which thread to run next


        System.out.println(Thread.activeCount()); // 2
        System.out.println(Runtime.getRuntime().availableProcessors()); // 12
        System.out.println(Runtime.getRuntime().freeMemory()); // 247,000,000
        System.out.println(Runtime.getRuntime().totalMemory()); // 247,000,000
        System.out.println(Runtime.getRuntime().maxMemory()); // 3,500,000,000
        System.out.println(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()); // 0

    }
}