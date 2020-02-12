package Inheritance;

	class A1
	
	{
	int a;
	void display()
	{
		System.out.println(a);
	}
	}
	
	class B1 extends A1
	{
		int b;
		void display()
	
	{
			
	
		System.out.println(b);
		
	}
		
	}
	
	class C extends B
	
	{
		int c;
		void show()
		{
			System.out.println(c);
		}
	}
	
	
public class Inheritance2 {
		
public static void main(String[] args) {
		
		C cobj=new C();
		
		cobj.a=10;
		cobj.b=20;
		cobj.c=30;
		
		cobj.display();
		cobj.display();
		cobj.show();
		
	}

}
