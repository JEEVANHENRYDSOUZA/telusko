## Creating Object Of Inner Class
To create an object of an inner class in Java, you typically follow this syntax:

```java
OuterClass outerObject = new OuterClass();
OuterClass.InnerClass innerObject = outerObject.new InnerClass();
```

### Here's a breakdown of this code:

1. `OuterClass` is the outer class that contains the inner class.
2. `OuterClass.InnerClass` is the full name of the inner class you want to create an object of.
3. `outerObject` is an instance of the outer class.
4. `new` is used to create a new instance of the inner class.
5. `InnerClass` is the name of the inner class.

Let's provide a full example to illustrate this:

```java
public class OuterClass {
    private int outerValue = 10;

    public class InnerClass {
        public void display() {
            System.out.println("Inner class value: " + outerValue);
        }
    }

    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();

        innerObject.display();
    }
}
```

In this code, we have an `OuterClass` that contains an `InnerClass`. In the `main` method, we create an instance of the outer class, `outerObject`, and then use `outerObject.new InnerClass()` to create an instance of the inner class, `innerObject`. Finally, we call the `display` method of the inner class.

This demonstrates how to create an object of an inner class in Java. The instance of the inner class is associated with an instance of the outer class, and you need to use the syntax `outerObject.new InnerClass()` to create it.