## Strings In Java
### Introduction To Strings
- Anything with double qoutes are treated as String in Java
- String are objects in Java and are not primitive data types
- String can be of two types namely
    1. Mutable Strings
    2. Immutable Strings
- As the name suggests mutable strings are those whose values can be changed
- Immutable strings once declared cannot be changed
### String Storage in Memory


1. **String Pool**: 
    - Java maintains a special memory area called the "String Pool" for storing string literals. When you create a string using double quotes (e.g., `String str = "Hello";`), Java checks if a string with the same value already exists in the pool. If it does, the new string variable will reference the existing string in the pool. This helps conserve memory and improve efficiency since identical string literals are not duplicated.

2. **Heap Memory**: 
    - If you create a string using the `new` keyword (e.g., `String str = new String("Hello");`), a new string object is created on the heap, regardless of whether the string value already exists in the pool. This can lead to multiple string objects with the same value.

3.  **String Constant Pool**:
    - In Java, string literals and String objects created using the new keyword are typically stored in the String Pool. 
    - This means that even if the content is not initially present in the String Pool, when you create a String object using new String("hello"), the content "hello" will be added to the String Pool.
    - The JVM will internally refernce the String in the String constant pool
    - If string already present in String Constant pool then it wont get created

4. Concatenation: String concatenation in Java often uses a `StringBuilder` (or `StringBuffer` in multi-threaded scenarios) under the hood to efficiently build the final string. This helps prevent excessive memory allocation when manipulating strings.


```java
String str1 = "Hello"; // Stored in the String Pool
String str2 = "Hello"; // Reuses the same "Hello" string in the String Pool

String str3 = new String("Hello"); // Creates a new string object on the heap
String str4 = new String("Hello"); // Creates another new string object on the heap

System.out.println(str1 == str2); // true, because they reference the same object in the String Pool
System.out.println(str1 == str3); // false, because str3 is a new object on the heap
```

