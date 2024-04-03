package Exceptions;

public class ExceptionalHandlingDemo {
	
	public static void main(String[] args) {
			
			System.out.println("Before Exection");
			
			int[] a = new int[2];
			
			try{
				
				a[0] = 5;
				a[1] = 3;
				a[2] = 9;
				
			} catch(Exception e){
				
				
				System.out.println("Exception handled - "+e);
				
			}
			
			System.out.println("After Exceptio");
			
	}
		

}