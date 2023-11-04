## MultiThreading 
- Multithreading is a programming concept that allows a program or application to execute multiple threads concurrently. 
- A thread is the smallest unit of a process that can be scheduled for execution by the operating system.
-  Multithreading is commonly used in software development to improve performance, responsiveness, and resource utilization in applications, 
especially in cases where tasks can be parallelized.
### Disadvantages Of Using a Single Threaded Program
- **Lack of Parallelism**: Single-threaded programs can't take full advantage of modern multi-core processors. They run sequentially, which means they may not make efficient use of available CPU resources.
- **Limited Responsiveness**: Single-threaded programs may become unresponsive when performing time-consuming operations, such as I/O tasks or complex calculations. This can result in a poor user experience, where the application freezes or lags.
- **Inefficient Resource Utilization**: Single-threaded programs may underutilize system resources. For example, while one thread is waiting for I/O (e.g., reading from a file or waiting for network data), the CPU remains idle.
- **Difficulty in Handling Concurrent Tasks**: Single-threaded programs struggle to handle multiple tasks or events concurrently. This can be a problem in applications where multiple tasks need to be processed simultaneously, such as in server applications, where numerous client requests are received simultaneously.
- **Limited Scalability**: Single-threaded programs may not scale well as the workload increases. They can reach a point where performance degrades, and it's challenging to handle more concurrent users or processes.
- **Reduced Throughput**: In scenarios where tasks can be executed concurrently, single-threaded programs may have lower throughput, as they can only handle one task at a time.
- **No Built-In Fault Isolation**: In a single-threaded program, a crash or an unhandled exception can bring down the entire application. Multi-threaded programs can isolate errors and exceptions to individual threads, allowing the rest of the application to continue running.
- **Limited Use in Real-Time Systems**: Real-time systems, which require tasks to be completed within strict time constraints, often rely on multithreading to ensure timely responses. Single-threaded programs may not be suitable for such applications.
- **Complex Workarounds**: To address some of the limitations of single-threaded programs, developers may need to implement complex workarounds, such as asynchronous programming, which can make code more difficult to understand and maintain.
- **Potential for Bottlenecks**: In single-threaded applications, certain operations, such as long-running computations, can create bottlenecks that slow down the entire program, affecting the user experience.

### Advantages Of Using Multithreaded Environment
- ```Concurrency```: Multithreading enables concurrency, which means that multiple threads can run in parallel, performing different tasks simultaneously.
- ```Thread Creation```: In most programming languages, including Java, C++, and Python, you can create and manage threads. Typically, you create a thread by instantiating an object of a Thread class or a similar construct.
- ```Thread Synchronization```: When multiple threads access shared resources, you need to ensure proper synchronization to avoid data races and conflicts. Locks, semaphores, and other synchronization primitives are used for this purpose.
- ```Thread States```: Threads can be in different states, such as "running," "waiting," "blocked," "terminated," and more. The operating system scheduler manages the execution of threads.
- ```Parallelism```: Multithreading can provide parallelism on multi-core processors, where multiple threads can run on different CPU cores, improving performance.
- ```Asynchronous Programming``: Multithreading is commonly used for asynchronous programming, where threads perform tasks independently, and communication between them often involves callback mechanisms or other synchronization techniques.

### Creating Multiple Threads In Java
- There are two ways to create multiple threads in Java
    1. Extendeding the Thread
    2. Implementing the runnable class
- **Main Thread In Java**: In a typical Java program, the main thread is indeed the first thread to start executing because it's the thread responsible for running the main method, which serves as the entry point for your program. The main thread is created and started automatically when your Java program begins its execution.
- **Thread Schudeler**:The thread scheduler, often referred to as the operating system's thread scheduler, is a fundamental component of a multi-threaded operating system. Its primary responsibility is to manage the execution of multiple threads on a CPU, ensuring that each thread gets a fair share of CPU time and that threads are scheduled efficiently. The threads are selected randomly but ther are done in such a way that ensures the **computer cycle** will never be wasted
### Creating a Thread By extending it to the thread class
In Java, you can create a thread by extending the `Thread` class. When you extend the `Thread` class, you create a new class that represents a thread, and you can override the `run()` method in that class to define the code to be executed by the thread. Here's a step-by-step example of how to create a thread by extending the `Thread` class:

1. Create a new class that extends the `Thread` class:

   ```java
   public class MyThread extends Thread {
       @Override
       public void run() {
           // Code to be executed by the thread
           for (int i = 1; i <= 5; i++) {
               System.out.println("Thread is running: " + i);
           }
       }
   }
   ```

   In this example, `MyThread` is a subclass of `Thread`, and we override the `run()` method to define the code that the thread will execute.

2. Create an instance of your custom thread class and start it:

   ```java
   public class Main {
       public static void main(String[] args) {
           MyThread myThread = new MyThread();
           myThread.start(); // Starts the thread, which executes the run() method

           // Main thread continues to execute here
           for (int i = 1; i <= 5; i++) {
               System.out.println("Main thread is running: " + i);
           }
       }
   }
   ```

3. Thread will come to life only when we give it to the threadScheduler.For this we do thread_name.start()
4. To check if our thread is active or not we can use the thread.isalive() that returns a boolean based on the threads status.
5. The ```join()``` method in Java is a thread synchronization mechanism provided by the Thread class. It allows one thread to wait for another thread to complete its execution before continuing. When you call join() on a thread, the calling thread will block until the thread being joined has finished
### Creating a Thread By implementing the Runnable Interface
In Java, you can create a thread by implementing the `Runnable` interface. This approach is often preferred over extending the `Thread` class because it allows you to separate the code to be executed by the thread from the thread management logic. Here's a step-by-step guide on how to create a thread by implementing the `Runnable` interface:

1. Create a class that implements the `Runnable` interface:

   ```java
   public class MyRunnable implements Runnable {
       @Override
       public void run() {
           // Code to be executed by the thread
           for (int i = 1; i <= 5; i++) {
               System.out.println("Thread is running: " + i);
           }
       }
   }
   ```
2. Create an instance of your `Runnable` class and pass it to a `Thread` object:

   ```java
   public class Main {
       public static void main(String[] args) {
           Runnable myRunnable = new MyRunnable();
           Thread myThread = new Thread(myRunnable);
           myThread.start(); // Starts the thread, which executes the run() method

           // Main thread continues to execute here
           for (int i = 1; i <= 5; i++) {
               System.out.println("Main thread is running: " + i);
           }
       }
   }
   ```

In the `Main` class, we create an instance of `MyRunnable` and pass it to a `Thread` object. The `start()` method is then called on the `Thread` object to start the thread. The code inside the `run()` method of `MyRunnable` begins executing concurrently with the main thread.

