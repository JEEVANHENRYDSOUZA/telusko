## Anonmymous Inner Class

- Interfaces are abstract by nature and cannot be instantiated on their own. However, when you use an anonymous inner class, you are not creating  an object of the interface itself. Instead, you are creating an instance of a class that implements the interface.

Here's how it works:

1. **Anonymous Inner Class**: When you create an anonymous inner class that implements an interface, you are actually defining a new class on the spot that implements the interface. This anonymous inner class is essentially a subclass of the interface.

2. **Object of the Anonymous Inner Class**: You create an object of the anonymous inner class, not the interface. This object is an instance of the anonymous class and, at the same time, also implements the interface.

For example, suppose you have an interface `MyInterface`:

```java
interface MyInterface {
    void someMethod();
}
```

You can create an object of an anonymous inner class that implements `MyInterface` like this:

```java
MyInterface myObject = new MyInterface() {
    @Override
    public void someMethod() {
        System.out.println("This is the implementation of the interface method.");
    }
};
```

In this code, `myObject` is not an object of the `MyInterface` interface itself; it is an object of an anonymous inner class that implements the interface. This allows you to use polymorphism, and you can call the methods defined in the interface through `myObject`.

In summary, when you create an object of an anonymous inner class that implements an interface, you are actually creating an instance of a new class that implements the interface, not an object of the interface itself. This is a way to achieve the behavior defined by the interface through a concrete, albeit anonymous, class.