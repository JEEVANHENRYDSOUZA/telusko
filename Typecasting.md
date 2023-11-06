## Typecasting 
### Rules For Typecasting Objects
- In Java, you cannot perform typecasting between two objects that do not have a class hierarchy or interface relationship. 
- Typecasting is only applicable when there is a relationship, such as inheritance (subclass to superclass) or when both classes implement the same interface. Attempting to cast an object to an unrelated type will result in a compilation error.
### Types Of Casting
- Upcasting
    1. Upcasting (Implicit Typecasting): Upcasting is the process of converting a reference of a subclass to a reference of a superclass. 
    2. It is performed automatically by the Java compiler, and no explicit casting is required.
    3. This is always safe because the subclass is guaranteed to have all the members of the superclass.
- DownCasting
    1. Downcasting (Explicit Typecasting): Downcasting is the process of converting a reference of a superclass to a reference of a subclass. 
    2. It is not performed automatically and requires explicit casting using the (Subclass) syntax. 
    3. Downcasting can lead to a ClassCastException if the object being downcasted is not an instance of the target subclass