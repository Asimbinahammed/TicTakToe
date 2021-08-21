package bridgeLabs;
import java.util.Scanner;

public class UC2ChoosingXor0 {
	
		//creating board
		public void TicTacToeGame(){
			int board[] = new int[10];
			for (int i = 1; i <=9; i++) {
				System.out.print(" "+board[i]+ " ");
				if(i%3==0) {
					System.out.println();
				}
			}	
		}
		
		//player choosing
		public void PlayerChoose() {
			//choosing X or O
			Scanner sc = new Scanner(System.in);
			System.out.println("Player One: Chose X or O =");
			char playerChoose=sc.next().charAt(0);
			System.out.println(playerChoose);
			if (playerChoose == 'X') {
				System.out.println("Player Selected X");
				System.out.println("CPU Selected O");
			}
			else {
				System.out.println("Player Selected O");
				System.out.println("CPU Selected X");
			}
			
			System.out.println();

			
		}
		
		public static void main(String[] args) {
			
		UC2ChoosingXor0 obj=new UC2ChoosingXor0();
		obj.TicTacToeGame();
		obj.PlayerChoose();
		}
		
		

	}
	


