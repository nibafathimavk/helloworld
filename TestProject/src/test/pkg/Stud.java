package test.pkg;
import java.util.Scanner;

public class Stud {
	int age;
	String name;
	
	public Stud()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the name");
		name=scn.next();
		System.out.println("Enter the age");
		age=scn.nextInt();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud s1=new Stud();
		s1.disName();
		
	}
	void disName() {
		
		System.out.println("Name is "+name);
		this.disAge();
	}
void disAge() {
		
	
	System.out.println("Age is "+age);
	}

}
