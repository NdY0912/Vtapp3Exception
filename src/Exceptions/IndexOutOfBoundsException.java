package Exceptions;

public class IndexOutOfBoundsException {

	public static void main(String[] args) {
		
		System.out.println("Before Exection");
		
		int[] a = new int[2];
		
		try{
			
			a[0] = 5;
			a[1] = 3;
			a[2] = 9;
			
		} catch(ArrayIndexOutOfBoundsException f){
			
			
			System.out.println("Exception handled - "+f);
			
		}
		
		System.out.println("After Exception");
		
	

}
}
