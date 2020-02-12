package Overloading;

public class Overload_main_method {

	public void main(int x)
	{
		System.out.println(x);
	}
	public void main (int x, int y)
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
		Constructor_overloading om=new Constructor_overloading();
		om.main(100);
		om.main(100,200);
		
	
	}

}
