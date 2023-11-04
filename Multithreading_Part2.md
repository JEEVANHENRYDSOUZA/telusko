## Multithreading Continued
### Need For Synchronization
- Synchronization in multithreading is essential because it ensures the proper and safe operation of concurrent programs. Without synchronization, multiple threads can access shared resources and data simultaneously, leading to several problems and potential issues, including:
1. **Data Races**: When multiple threads access and modify shared data without proper synchronization, data races occur. Data races can result in unpredictable and erroneous behavior because it's uncertain which thread's modification will take effect. This can lead to incorrect calculations and data corruption.
2. **Race Conditions**: Race conditions occur when the outcome of a program depends on the relative timing of events, such as the order in which threads execute. Race conditions can lead to inconsistencies and unexpected results.
3. **Inconsistent Data**: Without synchronization, one thread may read a shared data item while another thread is in the process of modifying it. This can lead to reading partially updated or inconsistent data.
4. **Deadlocks**: Deadlocks can occur when two or more threads are waiting for each other to release locks or resources, causing the program to come to a standstill. Deadlocks can be challenging to diagnose and resolve.
5. **Starvation**: Starvation happens when a thread is unable to make progress because other threads have exclusive access to shared resources. This can lead to unfair or inefficient resource allocation.
6. **Thread Interference**: Concurrent access to shared resources can lead to thread interference, where one thread's actions interfere with another thread's intended behavior.
7. **Lost Updates**: Without synchronization, updates made by one thread can be lost or overwritten by updates from another thread, resulting in lost data.

### How to acheieve Syncronization in Java
In Java, synchronization is a technique used to coordinate and control access to shared resources or critical sections of code in a multithreaded environment, ensuring that multiple threads can interact with those resources safely and predictably. Synchronization is primarily achieved through the use of the `synchronized` keyword, synchronized methods, and synchronized blocks. Here's an overview of synchronization in Java:

1. **`synchronized` Keyword**: The `synchronized` keyword is used to declare a method or code block that should be executed by only one thread at a time. When a thread enters a synchronized method or block, it acquires a lock associated with the object or class and ensures that other threads cannot concurrently execute the same synchronized code.

   - Synchronized Method:
     ```java
     public synchronized void synchronizedMethod() {
         // Synchronized method code
     }
     ```

   - Synchronized Block:
     ```java
     public void someMethod() {
         // Non-critical section code

         synchronized (lockObject) {
             // Critical section code
         }

         // Non-critical section code
     }
     ```
2. **Intrinsic Locks (Monitors)**: In Java, every object has an associated intrinsic lock (also known as a monitor). When a thread enters a synchronized block or method, it acquires the intrinsic lock of the associated object. The intrinsic lock is released when the synchronized section is exited.

3. **Mutual Exclusion**: Synchronization provides mutual exclusion, ensuring that only one thread can execute a synchronized section at any given time. This guarantees that conflicting operations do not overlap.

4. **Thread Safety**: Synchronization is crucial for ensuring thread safety, which means that shared resources are accessed and modified in a safe and predictable manner. It prevents data races, data corruption, and other concurrency-related issues.

5. **Wait and Notify**: Java provides `wait()`, `notify()`, and `notifyAll()` methods for inter-thread communication and coordination within synchronized sections. These methods allow threads to wait for specific conditions and for other threads to notify them when conditions change.

6. **Deadlocks**: While synchronization is essential for multithreading, it can also lead to deadlocks if not used carefully. Deadlocks occur when two or more threads are waiting for each other to release locks, resulting in a standstill. Proper design and deadlock detection are necessary.

7. **Thread Safety Considerations**: When designing multithreaded applications, it's essential to carefully consider synchronization and locking strategies to prevent deadlocks, livelocks, and contention issues. Proper synchronization ensures that threads can work together safely and efficiently.


