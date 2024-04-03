package Exceptions;

public class ArthmaticException {
	
	public static void main(String[] args) {
			
			System.out.println("Before Exection");
			
			int a;
			
				try{
					
					a = 10/0;
				
				} catch(ArithmeticException e){
					
					System.out.println("Exception handled - "+e);
					
				}
			
			System.out.println("After Exception");
			
		}

}