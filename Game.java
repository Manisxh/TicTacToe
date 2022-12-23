package ticktaltoe;

import java.util.Scanner;

public class Game extends Back {

	public static void main(String[] args) {
		boolean P1=true;
		Back b=new Back();
		
		// Displaying board.
		b.DisplayBoard();
		
		Scanner sc=new Scanner(System.in);
		
		while(b.f) {
			while(P1 && b.f) {
				System.out.println("Player 1 Enter X at: ");
				int row=sc.nextInt();
				int col=sc.nextInt();
				if(row<=3 && col<=3) {	
					if(b.A[row-1][col-1]!='X' && b.A[row-1][col-1]!='O') {
						b.A[row-1][col-1]='X';
						P1=false;
					}
					else {
						System.out.println("Can't Add there");
					}
				}
				else {
					System.out.println("Enter proper position");
				}
			}
			b.DisplayBoard();
			b.WIN();
			if(!b.f) {
				break;
			}
			b.TIE();
			while(!P1 && b.f) {
				System.out.println("Player 2 Enter O at: ");
				int row=sc.nextInt();
				int col=sc.nextInt();
				if(row<=3 && col<=3) {	
					if(b.A[row-1][col-1]!='X' && b.A[row-1][col-1]!='O') {
						b.A[row-1][col-1]='O';
						
						P1=true;
					}
					else {
						System.out.println("Can't Add there");
					}
				}
				else {
					System.out.println("Enter proper position");
				}
			}
			if(!b.f) {
				break;
			}
			b.DisplayBoard();
			b.WIN();
			b.TIE();
		}
		
	}

}
