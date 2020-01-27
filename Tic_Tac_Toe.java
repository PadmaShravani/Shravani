package miniProject2;

import java.util.Scanner;

public class Tic_Tac_Toe {
static Scanner input=new Scanner(System.in);
static Character board[][]=new Character[3][3];
static int Player1_Hposition, Player1_Vposition,Player2_Hposition, Player2_Vposition;
static boolean gameOver=false;
static int blocksFilled=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printBoard();
		//while()
		player1();
		//player2();
		}

	public static void printBoard(){
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(board[i][j]!=null)
					System.out.print(board[i][j]+" ");
					else
				System.out.print("_ ");
			}System.out.println();
		}
	}
	public static void player1() {
		while(!gameOver) {		
	System.out.println("Enter player 1 horzontal and vertical position");
	String player1=input.next();
	//System.out.println(player1);
	char p1[]=player1.toCharArray();
	for (int i=0;i<player1.length();i++)
	System.out.println(p1[i]);
	int a[]=new int[p1.length];
	for (int i=0;i<a.length;i++) {
	a[i]=(int)p1[i]-48;
	}
	Player1_Hposition=a[0];
	Player1_Vposition=a[1];
	System.out.println("Enter Player1 Symbol-'X'");
	char symbol1=input.next().charAt(0);
	if(symbol1!='X'){
		System.out.println("Not Entered Your X Symbol. Changing to X");
		symbol1 = 'X';
	}	
//	System.out.println("Enter Yes to confirm Game Play or No to Play Again");
//	if(input.nextLine().equalsIgnoreCase("Yes")){
		if(board[Player1_Hposition][Player1_Vposition]==null ) {
		board[Player1_Hposition][Player1_Vposition]=symbol1;
	}
//		}
	printBoard();
	//isGameOver();
	blocksFilled++;
	System.out.println(blocksFilled);
	if(isGameOver()) {
		break;
	}
	else
		if(blocksFilled==9) {
		gameOver=true;
		break;
	}
	else player2();
	//gameOver=true;
		}
	}
	public static void player2() {
	while(!gameOver) {
		System.out.println("Enter player 2 horzontal and vertical position");
	String player2=input.next();
	System.out.println(player2);
	char p2[]=player2.toCharArray();
	for (int i=0;i<player2.length();i++)
	System.out.println(p2[i]);
	int b[]=new int[p2.length];
	for (int i=0;i<b.length;i++) {
	b[i]=(int)p2[i]-48;
	}
	Player2_Hposition=b[0];
	Player2_Vposition=b[1];
	System.out.println("Enter Player2 Symbol-'O'");
	char symbol2=input.next().charAt(0);
	if(symbol2!='O'){
		System.out.println("Not Entered Your O Symbol. Changing to O");
		symbol2 = 'O';
	}
//	System.out.println("Enter Yes to confirm Game Play or No to Play Again");
//	if(input.next().equalsIgnoreCase("Yes")){
		if(board[Player2_Hposition][Player2_Vposition]==null ) {
		board[Player2_Hposition][Player2_Vposition]=symbol2;
		}
//	}
	
	printBoard();
	//isGameOver();
	blocksFilled++;
	System.out.println(blocksFilled);
	if(isGameOver()) {
		break;
	}
	else
	if(blocksFilled==9) {
		gameOver=true;
		break;
	}
	 player1();
	//gameOver=true;
}
	}
	public static boolean isGameOver() {
		//System.out.println("Entered Gameover method");
		for(int k=0;k<3;k++) {
			//System.out.println("Entered Gameover method for loop verifying player1 row and column");
			
			if(!isNullExist(board[0][k], board[1][k], board[2][k]) && board[0][k].equals('X') && board[1][k].equals('X') && board[2][k].equals('X')) {
				System.out.println("Player 1 win ");
				gameOver=true;
				return gameOver;
			}else if(!isNullExist(board[k][0],board[k][1],board[k][2]) && board[k][0].equals('X') && board[k][1].equals('X') && board[k][2].equals('X')) {
				System.out.println("Player 1 win ");
				gameOver=true;
				return gameOver;
			}
			//System.out.println("Entered Gameover method for loop verifying player2 row and column");
			if(!isNullExist(board[0][k], board[1][k], board[2][k]) && board[0][k].equals('O') && board[1][k].equals('O') && board[2][k].equals('O')) {
				System.out.println("Player 2 win ");
				gameOver=true;
				return gameOver;
			}else if(!isNullExist(board[k][0],board[k][1],board[k][2]) && board[k][0].equals('O') && board[k][1].equals('O') && board[k][2].equals('O')) {
				System.out.println("Player 2 win ");
				gameOver=true;
				return gameOver;
			}
	}
		
		//System.out.println("Game pver method - Out from for loop");
		if(!isNullExist(board[0][0],board[1][1],board[2][2]) && board[1][1].equals('X') && board[2][2].equals('X')&&board[0][0].equals('X')) {
			System.out.println("Player 1 win ");
			gameOver=true;
			return gameOver;
		}else if(!isNullExist(board[2][0],board[1][1],board[0][2]) && board[2][0].equals('X') && board[1][1].equals('X')&&board[0][2].equals('X')) {
			System.out.println("Player 1 win ");
			gameOver=true;
			return gameOver;
		}
		if(!isNullExist(board[0][0],board[1][1],board[2][2]) && board[1][1].equals('O') && board[2][2].equals('O')&&board[0][0].equals('O')) {
			System.out.println("Player 2 win ");
			gameOver=true;
			return gameOver;
		}else if(!isNullExist(board[2][0],board[1][1],board[0][2]) && board[2][0].equals('O') && board[1][1].equals('O')&&board[0][2].equals('O')) {
			System.out.println("Player 2 win ");
			gameOver=true;
			return gameOver;
		}
		return gameOver;
	
	
	}
	
	public static boolean isNullExist(Character x, Character y, Character z) {
		Character[] arr = {x, y, z};
		boolean isNullExist = false;
		// Check if there is a null in array
		for (int i=0; i<arr.length; i++) {
		    if (arr[i]==null)
		    	isNullExist = true;
		    }
		return isNullExist;		
	}
}