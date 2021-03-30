import java.util.Scanner;
import java.util.Vector;

public class compare {
	public static void main(String[] args) {
		String name[] = { "Papon Ahasan", "Rakibul Ahasan", "Rahim", "Karim" };
		Scanner input = new Scanner(System.in);
		
		Vector<String> playerOne = new Vector<String>();  
		Vector<String> playerTwo = new Vector<String>();  

		int len = name.length;

		int player1 = 0, player2 = 0, closePlay = 0, playerPoint = 0;

		while (closePlay < 2) {
			if (closePlay == 0)
				System.out.println("Play Player1: ");
			if (closePlay == 1)
				System.out.println("Play Player2: ");

			String user = input.nextLine();
			int count = 0;
			for (int j = 0; j < len; j++) {
				String board = name[j];
				if (board.equalsIgnoreCase(user)) {
					playerPoint++;
					count++;
					if(closePlay == 0) {
						playerOne.add(board);
					}else {
						playerTwo.add(board);
					}
					break;
				}
			}
			if (count>0) {
				continue;
			}
			if (closePlay==0) {
				player1 = playerPoint;
				playerPoint = 0;
				closePlay++;
				System.out.println("Player1 Score is "+player1);
				System.out.println();
			}
			else if (closePlay==1) {
				player2 = playerPoint;
				playerPoint = 0;
				closePlay++;
				System.out.println("Player2 Score is "+player2);
			}
		}

		if (player1 > player2) {
			System.out.print("\nPlayer1 is Win.player1 line is: "+playerOne);
		}
		else if(player1 == player2) {
			System.out.print("\nBoth Player same score: "+playerOne+" "+playerTwo);
		}
		else {
			System.out.print("\nPlayer2 is Win.player2 line is: "+playerTwo);
		}

		System.out.println(" Score is :"+Math.max(player1, player2));
		input.close();
	}
}
