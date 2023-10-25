## Method Hiding/Shadowing

### Method hiding and method overriding are two important concepts in object-oriented programming, particularly in Java, and they deal with how methods are defined and used in a class hierarchy. Let's compare them:


**Method Hiding:**

1. **Static Methods:** Method hiding is associated with static methods (class methods).
2. **Static Binding:** It is resolved at compile-time, which means the decision about which method to call is made based on the reference type.
3. **Superclass and Subclass:** In method hiding, a subclass defines a static method with the same name, return type, and parameter types as a static method in its superclass. The subclass's method "hides" the superclass method, and the choice of which method to call is based on the reference type.
4. **Example:**
   ```java
   class Parent {
       static void someMethod() {
           System.out.println("Static method in Parent");
       }
   }
   
   class Child extends Parent {
       static void someMethod() {
           System.out.println("Static method in Child");
       }
   }
   ```

**Method Overriding:**

1. **Instance Methods:** Method overriding is associated with instance methods.
2. **Dynamic Binding:** It is resolved at runtime using polymorphism, which means the decision about which method to call is made based on the actual object's type.
3. **Superclass and Subclass:** In method overriding, a subclass provides a specific implementation for an instance method declared in its superclass. The subclass's method overrides the superclass method, and the choice of which method to call is based on the runtime type of the object.
4. **Example:**
   ```java
   class Animal {
       void makeSound() {
           System.out.println("Animal makes a sound");
       }
   }
   
   class Dog extends Animal {
       @Override
       void makeSound() {
           System.out.println("Dog barks");
       }
   }
   ```

In summary, method hiding applies to static methods in a class hierarchy and is resolved at compile-time based on the reference type. Method overriding applies to instance methods and is resolved at runtime through polymorphism, based on the runtime type of the object. Method overriding is a core mechanism for achieving runtime polymorphism and is a key concept in object-oriented programming.