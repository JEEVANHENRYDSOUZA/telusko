## Immutability In String
- This means that once a String object is created, its content cannot be changed. 
- Any operation that appears to modify a string actually creates a new string object with the modified content while leaving the original string object unchanged. This immutability is a fundamental characteristic of the String class in Java and has important implications for code safety, thread safety, and efficiency.

## Concatenation Of String
- When we perform concatenation of String it appears that two strings are merger together, 
but in reality we only create a new string with a refernce variable that  is referrring to it

## String Literals
- Same logic applied to string constant pool , if already present they will refer to the same object
