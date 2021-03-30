import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class file {
	public static void main(String[] args) {
		// Check if file exists
		File file = new File("03022.txt");

		if (file.exists()) {
			System.out.println("File already exists");
			 System.exit(0);
		}

		// Create output file
		PrintWriter output = null;
		try {
			output = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Write 100 integers created radomly to file
		for (int i = 0; i < 100; i++) {
			output.print(((int) (Math.random() * 500) + 1));
			output.print(" ");
		}

	}
}
