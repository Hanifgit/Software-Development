package File;
import java.util.Formatter;
import java.util.Scanner;

public class writeFile {
	public static void main(String[] args) {
		try {
			Formatter FM = new Formatter("E:\\JAVA Language\\FileDirectory\\MyFile\\FileName.txt");
//			FM.format("%s %s\r\n", "101","Papon");
//			FM.format("%s %s\r\n", "102","Ahasan");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			for (int i = 0; i < num; i++) {
				int id = input.nextInt();
				String name = input.next();
			    FM.format("%d %s\r\n", id, name);
			}
			input.close();
			FM.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
