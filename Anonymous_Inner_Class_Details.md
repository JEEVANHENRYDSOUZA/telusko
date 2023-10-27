## Why we use new after writing the anonymous class

- The syntax of using the interface name after the `new` keyword when creating an anonymous inner class is a special feature in Java. It can seem a bit counterintuitive, but it serves a specific purpose: to create an instance of an anonymous class that implements the interface. This syntax is designed to make it clear that you are creating an object with a specific interface implementation.

### Here's why it's written this way:

1. **Creating an Anonymous Class**: When you use `new MyInterface() { ... }`, you are actually defining and creating an anonymous class on the spot. The code within the curly braces `{ ... }` defines the body of this anonymous class.

2. **Implementing the Interface**: By specifying the interface name (`MyInterface`) immediately after `new`, you are indicating that the anonymous class is implementing that interface. The methods defined in the interface must be implemented within the anonymous class.

3. **Creating an Object**: The `new` keyword is used to create an instance of this anonymous class, which is an object that implements the specified interface.

In essence, this syntax is a way to define and create a class that adheres to the contract (interface) specified by the interface, and then you create an object of this class. It's a concise way to create instances that conform to an interface's requirements.