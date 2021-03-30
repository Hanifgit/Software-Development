import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main implements Comparable<Main> {
	public String a;
	public long b;
	public int c;

	public Main(String a, long b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public int compareTo(Main o) {
		if (this.c == o.c)
			return 0;
		else if (this.c < o.c)
			return -1;
		else
			return 1;
	}

	public static void Solve(Scanner input) {
		long tc = input.nextInt();
		for(int k=0;k<tc;k++) {
			String a;long b;int c;
			long n = input.nextInt();
			double sum = 0;
			ArrayList<Main> array = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				a = input.next();
				b = input.nextLong();
				c = input.nextInt();
				sum += c;
				array.add(new Main(a, b, c));
			}
			Collections.sort(array);
			double Avg = sum / n;
			for (Main j : array) {
				if (Avg > j.c)
					System.out.println(j.a + " " + j.b + " " + j.c);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Solve(scanner);
	}

}
