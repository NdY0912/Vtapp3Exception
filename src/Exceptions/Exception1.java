package Exceptions;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Before Exection");
		
		int a = 10/0;            //Arthmetic exception, program will stop here itself
		
		System.out.println("After Exception "+a);
	}

}
