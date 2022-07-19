                                               Test 3 
Date -18/07/2022
1. var -args  is argument passed in main method 
    Syntax
   String... args
   
2.Block is set of satements used to initalize the object instance initalization block and static  instance initalization block.
Two types
a.IIB-Instance initalization block-use to initalize instance block.
b.SIB-static  instance initalization block-use to initalize static instance block.

3.hashcode is unique distinct interger number of hashcode and hashcode is genrated by jvm from adreess of the object.
 example
 public class Money{
 public static void main(String args[]){
 Money money=new Money();
 System.out.println(money.hashcode);
 
 }
 }
4.String is immutable because string is literal once we create an object it going to strore in string constant pool and we are not able to modify the object
  if we modify other object and other object get affected hence string is immutable.
  String constant pool- when we create an string by litreal and object is going to store in the string constant pool it is string constant pool.
  
6.Exception is an object which occur during program exceution and stop the flow of progarm exceution and code which are below the exception is not going to execute.
Two types of exception
1.Compile time exception/checked exception- Exception which is extends exception is called checked exception.
2.Run tome exception/unchecked exception-Exception which is extends run time exception is called unchecked exception.

7.* If error is occur progarm is going to stop if using exception we can handle the exception by throw,throws  try and catch block.

8.Yes

9.Throw key word is used to throw the exception object.
 
10.No.

11.*Finally block is associated with try and catch block.
   *Code which is written inside Finally block is always going excecute eiher exception occur or not.
   *Finally block is always will be last block of code.
   *Finally block is written with try block always.
   *Finally block is  not recommende written with cath block.
   *There is no multiple Finally block .

12. Error is an runtime interption which occur during program exceution and it not be recoverable.

13.when we not want total functionality of object is called Is-A RealtionShip .
 Example  car is  vechlie;
 When we want total functionality of object is called has-A RealtionShip
 Example-Car has engine;
 
14.public -If main method is public it can be used anywhere in application.
  Static - If main mehod is static we can accees with creating an object.
  void- If main methodis void it not return any thing to main method.

15.Yes

16.No

17.N0

18.Calss is an blue print of an object.
   Example public class Vechicle.
   Object is physical entity which as state and behaviour.
   Example
   State-color,brand;
   behaviour-speed,Driving; 
   
19. JIT-Just in time complier is used when we required to ecxcute repeated code when thershlodnumber is exceeds 3 time.

20. i clone not supported Exception.
   ii.io Exception.
   iii. sql Exception.
   iv.interpeted Exception
   v.class not found exception.
   vi.class cast exception.
   vii.out of bound exception.
   viii.file not found exception.
   ix.arry index out of bound exception.
   
21. Yes 
   publlic class InvalidPasswordexpection extends exception{
   
   }
   public class loginFrom{
   public static void main(String args[]){
   String id="Hanamant";
   String password="123456789";
   if(id.equal("Hanamant"){
   if(password==123456789){
   System.out.println("Login is successful");
   }
   else{
   try{
   InvalidPasswordexpection invalidExp=new InvalidPasswordexpection();
   thorw invalidExp;
   catch (InvalidPasswordexpection e){
   System.out.println(" Invalid password enter")
   }
   }
   }
   }
   }
   }
   
22.Try-The the line which give exception which is written is try block.

  Catch-Object which  throw in try block which is catch in catch block.
  
  Throw-Throw keyword is throw the object of exception.
  
  Throws-Throws keyword is give indication to caller about exception.
  
 
23. String is not keyword.

24. String object created by Literal and new keyword.
     Literal -String object created by literal then object is going to store in heap memory and string constant pool.
	 Example String s="Ravi";
	 
	 new Keyword-String object created by new then object is going to store in heap memory.
	 Examole String s=new String("Money");
	 
25 
25.1- public class Demo{
   static  int add(int a, int b){
	 return a+b;
	 }
	 public static void main(String args[]){
	 int result=add(10,20);
	 System.out.println(result);
	 }
	 }
	 
25.2-public class Demo1{
     static int dispaly(){
	 return dispaly;
	 }
	 public static void main(String args[]){
	 System.out.println(demoa.dispaly)
	 }
}

25.3-public class Demo1{
     static void dispaly(){
	 System.out.println(dispaly)
	 }
	 public static void main(String args[]){
	 System.out.println(demoa.dispaly)
	 }
}

25.4-public class Demo1{
     static void dispaly(){
	 System.out.println(dispaly)
	 }
	 public static void main(String args[]){
	 System.out.println(demoa.dispaly)
	 }
}
