package ExceptionTypes;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\nisha\\Documents\\xyz.txt");
		
		//FileReader fr = new FileReader(f);
		try {
			FileReader fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Checked exception
	}

}
