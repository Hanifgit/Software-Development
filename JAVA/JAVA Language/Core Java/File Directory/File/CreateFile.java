package File;
import java.io.File;

public class CreateFile {
	public static void main(String[] args) {
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
	}
}
