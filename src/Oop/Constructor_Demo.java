package Oop;

public class Constructor_Demo {

	
	int x;
	int y;
	
	Constructor_Demo ()
	{
		x=10;
		y=20;
	}
	
	void display ()
	{
		System.out.println(x+y);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor_Demo cm1=new Constructor_Demo();
	}

}
