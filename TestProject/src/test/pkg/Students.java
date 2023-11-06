
package test.pkg;
import java.util.Scanner;
public class Students {
	
	//variable declarations
	
	String name;
	int age;
	static String schoolname;
	
	//constructor declaration--default constructor
	
	public Students()
	{
		Scanner scn=new Scanner(System.in);
		Students.schoolname="Indian School";
		System.out.println("Enter the name");
	name=scn.next();
	System.out.println("Enter the age");
	age=scn.nextInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object creation for invoking details
		
		Students s1=new Students();
		Students s2=new Students();
		
		//invoking details using object for student 1
		
		System.out.println("Name of student1 is "+s1.name);
		System.out.println("Age of student1 is "+s1.age);
		System.out.println("School name of student1 is "+Students.schoolname);
		
		//invoking details using object for student 2
		
		System.out.println("Name of student2 is "+s2.name);
		System.out.println("Age of student2 is "+s2.age);
		System.out.println("School name of student2 is "+Students.schoolname);
		
		
	}

}
