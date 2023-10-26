## Anonymous Inner Class v/s Normal Class 

- Anonymous classes are typically used for creating small, localized implementations of interfaces or subclasses without the need to create a separate named class. 
- They are defined within a limited scope, often as method arguments or local variables, and are only present in memory for the duration of their use. Once the context in which they are defined goes out of scope, the anonymous class instances are no longer accessible and may be eligible for garbage collection.
- This makes anonymous classes useful for scenarios where you need a class with a short lifespan, such as providing a specific implementation for a single method or creating a class for a one-time-use task.

Here's an example of using an anonymous class for a specific task:


``` public class Example {
    public static void main(String[] args) {
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an anonymous class.");
            }
        };
        
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}

```
- In this example, the anonymous class implementing Runnable is used to provide a short-lived implementation for creating a new thread. Once the thread completes its task, the anonymous class instance is no longer accessible.

- While anonymous classes are useful for specific use cases, for more complex, reusable, or long-lived functionality, creating a named class is typically more appropriate. The choice between anonymous classes and named classes depends on the specific requirements and scope of your code.