## Annotation
### Introduction
- Meta data or extra information about code or file
- Comments VS Annotations
    1. Comments are not given to the compiler it is only for the programmer
    2. Annotations are given to the compiler and the developer 
- We can our own annotation as well
- The praent object of annotaion is the Annotation class
### Creating our own Annotations
- Create and interface with ```@``` symbol in front that annotation type is being getting created
- Create the target where the annotation can be used
```java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Specifies when the annotation should be available (at runtime in this case)
@Target(ElementType.METHOD)       // Specifies where the annotation can be used (on methods in this case)
public @interface MyAnnotation {
    String value() default "Default Value"; // Define elements in the annotation (in this case, a single String element)
    int count() default 0;
}
```
- `@Retention(RetentionPolicy.RUNTIME)`: This annotation specifies that the `MyAnnotation` should be available at runtime. This is important if you want to inspect annotations at runtime using reflection.
- `@Target(ElementType.METHOD)`: This annotation specifies that `MyAnnotation` can be used on methods. You can choose different targets like classes, fields, or parameters depending on your requirements.
- `public @interface MyAnnotation { ... }`: This defines the custom annotation `MyAnnotation`. Inside the annotation, you can define elements, which are similar to fields in a class. In this case, we have defined two elements: `value` and `count`.
- `String value() default "Default Value";`: This defines an element named `value`, which is a String. The `default` keyword sets a default value for the element.
- `int count() default 0;`: This defines another element named `count`, which is an integer with a default value of 0.

