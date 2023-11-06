package test.pkg;

import java.util.Scanner;

public class Area {
	int a,l,b;
	static int ch;
	double r,area;
	
	Scanner scn=new Scanner(System.in);
	Area(int a)
	{
		System.out.println("Enter the side of the square");
		a=scn.nextInt();
		area=a*a;
	}
	
	Area(double r)
	{
		
	area=3.14*r*r;	
	
	}
	
	Area(int l,int b)
	{
		
	area=l*b;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Area of the Square");
		System.out.println("2.Area of the Circle");
		System.out.println("3.Area of the Rectangle");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1: Area a1=new Area(2);
		System.out.println("Area of the square is "+a1.area);
		break;
		
		case 2:
			System.out.println("Enter the radius of the circle");
			double r=sc.nextDouble();
			Area a2=new Area(r);
		System.out.println("Area of the cirle is "+a2.area);
		break; 
		
		case 3:
			System.out.println("Enter the length of the rectangle");
			int l=sc.nextInt();
			System.out.println("Enter the breadth of the rectangle");
			int b=sc.nextInt();
			Area a3=new Area(l,b);
		System.out.println("Area of the rectangle is "+a3.area);
		break;
		}
		



	}

}
