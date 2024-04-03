package Exceptions;

public class TryCatch1 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
	System.out.println("Before Exection");
	//Exception handling	
	try {
		int a = 10/0;            //Arthmetic exception, program will stop here itself
		}catch (Exception e) {
			System.out.println("Exection is handled here");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();  //More details about error
		}
			
			
		
		System.out.println("After Exception ");
	
	}

}
