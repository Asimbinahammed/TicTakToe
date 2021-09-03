package bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
	char[] board;
	static char playerCharactor, cpuCharactor;

	// UC1 creating game board
	public TicTacToeGame() {
		board = new char[10];

		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
	}

	// UC2 selecting x or o
	public void userInput() {
		System.out.println("select x or o");
		Scanner input = new Scanner(System.in);
		char userInput = input.next().toUpperCase().charAt(0);
		System.out.println(userInput);

		if ('X' == userInput) {
			playerCharactor = 'X';
			cpuCharactor = 'O';
		} else if ('O' == userInput) {
			cpuCharactor = 'X';
			playerCharactor = 'O';
		} else {
			System.out.println("enter a valid choice");
			userInput();
		}
	}

	// UC3 show the board
	public void showBoard() {
		System.out.println("The game Board");
		for (int i = 1; i < 10; i += 3) {
			System.out.println(board[i] + " | " + board[i + 1] + " | " + board[i + 2]);
			System.out.println("----------");
		}

	}
	
	//main method
	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe Game");

		TicTacToeGame game = new TicTacToeGame();
		game.userInput();
		System.out.println("player is -" + playerCharactor + " computer is - " + cpuCharactor);

		game.showBoard();

	}
}
