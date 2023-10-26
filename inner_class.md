
## Nested Inner Class

To create an object of a nested inner class, you typically need an instance of the outer class because an inner class is associated with an instance of its outer class. The inner class has access to the members of the outer class, including its instance variables and methods. Here's how you can create an object of a nested inner class:

1. **Static Nested Class:**
   - A static nested class is not tied to an instance of the outer class. You can create an object of a static nested class without an instance of the outer class.
   - To create an object of a static nested class, you use the outer class name followed by the static nested class name.

   ```java
   class OuterClass {
       static class StaticNestedClass {
           // ...
       }
   }

   

   // Create an object of the static nested class
   OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
   ```

### Top Level Class can never be static because static blocks can never be instantiated however inner class can be static as they are grouped to workk with outer class which will be instantiated


2. **Inner Class:**
   - An inner class, also known as a non-static nested class, is associated with an instance of the outer class. You need to create an instance of the outer class before creating an instance of the inner class.
   - To create an object of an inner class, you use the instance of the outer class.

   ```java
   class OuterClass {
       class InnerClass {
           // ...
       }
   }

   OuterClass outerObject = new OuterClass();
   // Create an object of the inner class using the outer object
   OuterClass.InnerClass innerObject = outerObject.new InnerClass();
   ```

For inner classes (non-static), you use the syntax `outerObject.new InnerClass()` to create an object of the inner class.

3. **Local Inner Class and Anonymous Inner Class:**
   - Local inner classes and anonymous inner classes can be created within a method or block of code. They are typically used for short-lived and specific tasks and don't have named instances in the same way as regular classes.
   - Creating objects of local inner classes and anonymous inner classes is done within the scope of the method or block where they are defined.

Creating objects of inner classes is a fundamental concept in Java, and it allows for more structured and encapsulated code by associating related classes closely with the classes that use them.