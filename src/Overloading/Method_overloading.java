package Overloading;

public class Method_overloading {

	// method overloading is feature that allows a class
	// to have more than one method have the same name
	void add (int a, int b)
	
	{
		System.out.println(a+b);
	}
	
	void add (int a, double b)
	
	{
		System.out.println(a+b);
	}
	 void add (double a, double b)
	 
	 {
	System.out.println(a+b);
	}
	 
	 void add (int a, int b, int c)
	 {
	System.out.println(a+b+c);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Method_overloading mo=new Method_overloading();
		mo.add(10, 20);//1
		mo.add(10, 20.0);//2
		mo.add(1.0, 2.0);
		mo.add(10, 20,3);
		
		

	}

}
