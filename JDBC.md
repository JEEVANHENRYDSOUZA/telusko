### JDBC
- JDBC stands for Java Database Connectivity
- Java sql package has all the interfaces for different database
- The implementation of these interface are done by third party db vendors
- This implementation is stored in a JAR file
- A JAR (Java Archive) file is a compressed file format that allows multiple files and directories to be bundled together into a single archive. 
- JAR files are primarily used to package Java classes and related resources, such as images, sound files, and configuration files, into a single  file for distribution.
- To interact with database Java team has given on jar file called as rt.jar
- This is already present in JDK
- All things are present inside the SQL package
- To get the implementation for interfaces abstract methods of JAVA sql package we need to take help of third party db wendors
- Those db vendors will have implementation and they will give us those implementation in the form of JAR
- Depending on which db we use , we need to add that specific JAR file
### Data
- Any information is called as data
- Databasd is a collection of such data 
### Advantages Of Using Database
- Security
- Managing and maintaing data is easy
- We can store large amount of data
### RDBMS tradoff
- RDBMS is storage efficient but it is not very fast
- Hence new database evovled such as nosql
-  Nosql implies not only sql
### Steps to be followed for JDBC operations
- Import the required packages download and add the required driver to s/w jar from db wendor
- Load and register the driver
- Establish the connection
- Create statement object it is this object that will pass our query/ prepared statement to transfer our query
- Execute the query
- Process the result
- Closing the resources
- Handling exceptions
### Some Important points
- When we take back data we will get an result set 
- To execute select query  we need to use public ResultSet executeQuery(String Query) throws SQLexception
- To execute non select query we need to use public int executeUpdate(String query) throws SQLexception
- For registration driver we do Class.forName("path")
- For establishing connection we do DriverManager.getConection(url,userName,password)
- We are using the Connection interface
- Creating the statement we do connect.createStatement() the return type is statement
### Organizing Code
- The organized way of writing would be to have all the intializing process in a seperate .class file in the same package 
- And that should be written in a static block , as the static block is execuetd at class loading phase there is no need for us to do
anything it will be done by JVM at runtime
- Have the connection part written in a static connection function which will return the connection object