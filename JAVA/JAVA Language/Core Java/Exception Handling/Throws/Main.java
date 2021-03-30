package Throws;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException,ArithmeticException {
		File file = new File("E:\\JAVA Language\\Core Java\\File Directory\\MyFile\\FileName.txt");
		
		Scanner input = new Scanner(file);
		int num = input.nextInt();
		System.out.println(num);
		input.close();
	}
}
