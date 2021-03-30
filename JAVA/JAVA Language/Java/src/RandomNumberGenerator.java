import java.util.Random;

public class RandomNumberGenerator {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int randomNumber = rand.nextInt(10); //0 --- 9
		System.out.println(randomNumber);
		
		randomNumber = rand.nextInt(10)+1; //1 --- 10
		System.out.println(randomNumber);
		
		int randomNum = (int)Math.random()*10; //0 - 9
		System.out.println(randomNum);
	}
}
