package Overloading;

public class Constructor_overloading {

	Constructor_overloading(int a, int b)
	{
		System.out.println(a+b);
	}
	
	Constructor_overloading(int a, double b)
	{
		System.out.println(a+b);
	}
	Constructor_overloading(double a, int b)
	{
		System.out.println(a+b);
	}
	Constructor_overloading(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor_overloading co =new Constructor_overloading(100,200,500);

	}

}
