package test.pkg;

public class ParamConst {
	int total;
	public ParamConst(int a,int b,int c)
	{
		total=a+b+c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParamConst pc=new ParamConst(2,3,7);
		System.out.println("Sum of two integer number is "+pc.total);
	}

}
