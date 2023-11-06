package test.pkg;
import java.util.*;

public class Palindrome {

	String s,st,rev="";
	
	public Palindrome() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		s=scn.next();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Palindrome p=new Palindrome();
		String st=p.s;
		
	//	System.out.println(st);
		//System.out.println(p.s.length());
		
	for(int i=p.s.length()-1;i>=0;i--)
		{
			//System.out.println(p.s.charAt(i));
			p.rev=p.rev+p.s.charAt(i);
			
		}
	//System.out.println(p.rev.toUpperCase());
	
	if(p.rev.toUpperCase().equals(st.toUpperCase()))
	{
		System.out.println("String is palindrome");
	}
	else
	{
		System.out.println("String is not palindrome");	
	}
	
	

	}

}
