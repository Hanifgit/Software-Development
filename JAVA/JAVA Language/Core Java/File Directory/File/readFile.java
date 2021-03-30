package File;
import java.io.File;
import java.util.Scanner;

public class readFile {
	public static void main(String[] args) {
		try {
			File fName = new File("E:\\JAVA Language\\FileDirectory\\MyFile\\FileName.txt");
			Scanner input = new Scanner(fName);
			while (input.hasNext()) {
				int id = input.nextInt();
				String name = input.next();
				System.out.println(""+id+" "+name);
			}
			input.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
