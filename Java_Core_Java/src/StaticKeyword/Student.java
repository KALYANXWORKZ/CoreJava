package StaticKeyword;

/*
 1.Static is a keyword which can be used with class,variable,method and block
 2. 
  
 */

public class Student {
	static int age = 20;

	static void study() {
		System.out.println("Student is Studying");
	}

	public static void main(String[] args) {
		System.out.println(Student.age);
		Student.study();

		System.out.println("------------------");
		System.out.println(age); //
		study();

	}

}
