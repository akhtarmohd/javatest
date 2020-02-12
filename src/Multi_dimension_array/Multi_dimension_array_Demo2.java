package Multi_dimension_array;

public class Multi_dimension_array_Demo2 {

	public static void main(String[] args) {
	

		
		int a[][]= {{100,200}, {300,400},{500,600}};
		
		System.out.println("Number of rows:" +a.length);
		System.out.println("Number of Colums:"+a[0].length);
	
		
		//enhanced for loop
		for (int r[]:a)
		{
			for(int i:r)
			{
			System.out.println(i);
			}
			
	}
		
	
}	
}
