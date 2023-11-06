package test.pkg;

import java.util.*;
public class StingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=new String("Hello");
System.out.println(s);
System.out.println();

System.out.println("String charAt");
System.out.println(s.charAt(1));
System.out.println();

System.out.println("String length");
System.out.println(s.length());
System.out.println();

System.out.println("String substring from beg index");
System.out.println(s.substring(2));
System.out.println("String substring from beg index and ending index");
System.out.println(s.substring(2,4));
System.out.println();

System.out.println("String contains");
System.out.println(s.contains("ell"));
System.out.println(s.contains("lle"));
System.out.println();

System.out.println("String equals");
System.out.println(s.equals("Hello"));
System.out.println(s.equals("He"));
System.out.println();

System.out.println("String isEmpty");
System.out.println(s.isEmpty());
System.out.println();

System.out.println("String concat");
System.out.println(s.concat(" World"));
System.out.println();

System.out.println("String replace");
System.out.println(s.replace("llo","y"));
System.out.println();

System.out.println("String indexOf");
System.out.println(s.indexOf("e"));
System.out.println();

System.out.println("String uppercase");
System.out.println(s.toUpperCase());
System.out.println();

System.out.println("String lowercase");
System.out.println(s.toLowerCase());
System.out.println();

System.out.println("String trim");
String t="   Hai everyone";
System.out.println(t);
System.out.println(t.trim());



	}

}
