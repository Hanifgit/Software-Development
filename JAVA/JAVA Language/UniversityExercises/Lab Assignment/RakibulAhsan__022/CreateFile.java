package RakibulAhsan__022;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class CreateFile implements Runnable {
	@Override
	public void run() {
		/*1 Way*/
		File folder1 = new File("MyFile");
		File folder2 = new File("C:\\Users\\papon\\Desktop\\MyFile");
		
		folder1.mkdir(); //Create File
		folder2.mkdir(); //Create File
		
		String fileLocation =  folder2.getAbsolutePath(); //File Path location dhakte
		System.out.println(fileLocation);
		
		System.out.println(folder1.getName()); //File Name
		folder2.delete(); //File Delete Korte
		
		/*2 Way*/
		File fileName = new File("E:\\JAVA Language\\FileDirectory\\MyFile\\FileName.txt");
		try {
			fileName.createNewFile(); //File Create
		} catch (Exception e) {
			System.out.println(e);
		}
		
		/*3 Way*/
		
		String pathname = folder1.getAbsolutePath();
		File fNFile = new File(pathname+"\\Ahasan.txt");
		fNFile.mkdir();
		
		try {
			fNFile.createNewFile(); //File Create
		} catch (Exception e) {
			System.out.println(e);
		}
		
		if(folder1.exists()) System.out.println("File Exists");
		
		//Read File
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
		
		//Write File
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
