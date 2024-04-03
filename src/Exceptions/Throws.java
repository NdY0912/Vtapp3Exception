package Exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Throws {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\nisha\\Documents\\xyz.txt");
		
		FileReader fr = new FileReader(f);
	}

}
