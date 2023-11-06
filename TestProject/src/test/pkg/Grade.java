package test.pkg;

import java.util.Scanner;

public class Grade {
String name;
int m1,m2,m3,total;

	public Grade()
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter mark 1");
		m1=scn.nextInt();
		System.out.print("Enter mark 2");
		m2=scn.nextInt();
		System.out.print("Enter mark 3");
		m3=scn.nextInt();
		total=m1+m2+m3;
		
		
		if(total<100)
		{
			System.out.println("Your grade is C");
		}
		else if(total>=100 && total<200 )
		{
			System.out.println("Your grade is B");
		}
		else
			System.out.println("Your grade is A");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade g1=new Grade();
		System.out.println("Total mark of student 1 is "+g1.total);
		System.out.println();
		
		Grade g2=new Grade();
		System.out.println("Total mark of student 2 is "+g2.total);
		System.out.println();
		
		Grade g3=new Grade();
		System.out.println("Total mark of student 3 is "+g3.total);
		System.out.println();
		
	
	}

}
