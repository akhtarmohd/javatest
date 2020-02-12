package Oop;

public class Constructor_Parameter {

	
	int x;
	int y;
	
	Constructor_Parameter (int a, int b)
	
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		
		Constructor_Parameter cm1 =new Constructor_Parameter(100,200);
		cm1.display();
		

		
		

	}

}
