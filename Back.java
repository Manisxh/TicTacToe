package ticktaltoe;

class Back { 
	static char A[][]= new char[3][3];
	boolean f=true;
	
	public void DisplayBoard() {
		System.out.println(A[0][0]+" | "+A[0][1]+" | "+A[0][2]);
		System.out.println("--+---+--");
		System.out.println(A[1][0]+" | "+A[1][1]+" | "+A[1][2]);
		System.out.println("--+---+--");
		System.out.println(A[2][0]+" | "+A[2][1]+" | "+A[2][2]);		 
	}
	
	void WIN() {	
		if(A[0][0]=='X' && A[0][1]=='X' && A[0][2]=='X') {
			System.out.println();
			System.out.println("Player 1 Wins");
			System.out.println("Thanks for Playing :)");
			f=false;
		}
		else if(A[0][0]=='O' && A[0][1]=='O' && A[0][2]=='O') {
			System.out.println();
			System.out.println("Player 2 Wins");
			System.out.println("Thanks for Playing :)");
			f=false;
		}
		else if(A[1][0]=='X' && A[1][1]=='X' && A[1][2]=='X') {
			System.out.println();
			System.out.println("Player 1 Wins");
			System.out.println("Thanks for Playing :)");
			f=false;
		}
		else if(A[1][0]=='O' && A[1][1]=='O' && A[1][2]=='O') {
			System.out.println();
			System.out.println("Player 2 Wins");
			System.out.println("Thanks for Playing :)");
			f=false;
		}
		else if(A[2][0]=='X' && A[2][1]=='X' && A[2][2]=='X') {
			System.out.println();
			System.out.println("Player 1 Wins");
			System.out.println("Thanks for Playing :)");
			f=false;
		}
		else if(A[2][0]=='O' && A[2][1]=='O' && A[2][2]=='O') {
			System.out.println();
			System.out.println("Player 2 Wins");
			System.out.println("Thanks for Playing :)");
			f=false;
		}
		else if(A[0][0]=='X' && A[1][0]=='X' && A[2][0]=='X') {
			System.out.println();
			System.out.println("Player 1 Wins");
			System.out.println("Thanks for Playing :)");
			f=false;
		}
		else if(A[0][0]=='O' && A[1][0]=='O' && A[2][0]=='O') {
			System.out.println();
			System.out.println("Player 2 Wins");
			System.out.println("Thanks for Playing :)");
			f=false;
		}
		else if(A[0][1]=='X' && A[1][1]=='X' && A[2][1]=='X') {
			System.out.println();
			System.out.println("Player 1 Wins");
			System.out.println("Thanks for Playing :)");
			f=false;
		}
		else if(A[0][1]=='O' && A[1][1]=='O' && A[2][1]=='O') {
			System.out.println();
			System.out.println("Player 2 Wins");
			System.out.println("Thanks for Playing :)");
			f=false;
		}
		else if(A[0][2]=='X' && A[1][2]=='X' && A[2][2]=='X') {
			System.out.println();
			System.out.println("Player 1 Wins");
			System.out.println("Thanks for Playing :)");
			f=false;
		}
		else if(A[0][2]=='O' && A[1][2]=='O' && A[2][2]=='O') {
			System.out.println();
			System.out.println("Player 2 Wins");
			System.out.println("Thanks for Playing :)");
			f=false;
		}
		else if(A[0][0]=='X' && A[1][1]=='X' && A[2][2]=='X') {
			System.out.println();
			System.out.println("Player 1 Wins");
			System.out.println("Thanks for Playing :)");
			f=false;
		}
		else if(A[0][0]=='O' && A[1][1]=='O' && A[2][2]=='O') {
			System.out.println();
			System.out.println("Player 2 Wins");
			System.out.println("Thanks for Playing :)");
			f=false;
		}
		else if(A[0][2]=='X' && A[1][1]=='X' && A[2][0]=='X') {
			System.out.println();
			System.out.println("Player 1 Wins");
			System.out.println("Thanks for Playing :)");
			f=false;
		}
		else if(A[0][2]=='O' && A[1][1]=='O' && A[2][0]=='O') {
			System.out.println();
			System.out.println("Player 2 Wins");
			System.out.println("Thanks for Playing :)");
			f=false;
		}
}
	
	void TIE() {
		int count=0;
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A.length;j++) {
				if(A[i][j]=='X' || A[i][j]=='O') {
					count++;
				}
			}
		}
		if(count==9) {
			System.out.println();
			System.out.println("no one wins");
			System.out.println("Thanks for Playing :)");
			count++;
			f=false;
		}
	}
	
}
