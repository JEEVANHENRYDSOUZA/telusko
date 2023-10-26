package jeevan;

//IS-A -> Abstract class
//behaviour -> interface

//Car and BMW

//Drivable and BMW

//class Remote extends ElectronicDevice implement Drivable

interface Car
{
 void drive();
}



//class SuperCar implements Car
//{
// public void drive() {
//     System.out.println("Need for Speed");
// }
//}


public class anonymous_inner {
 public static void main(String[] args) {


     Car obj = new Car()
     {
         public void drive()
         {
             System.out.println("NFS");
         }
     };

//       Car obj1 = () -> System.out.println("NFS");


     obj.drive();




 }
}
