package com.gurukul.day5.homework;

import java.util.Scanner;


class CompetitionLog
{
	private int playerNumber;
	private String completeSets;
	private String incompleteSets;
	private int piecesBuilt;
	static int days = 1;
    static int totalNoOfPieces;
    static String lego1;
    static String lego2;
    static String lego3;
    static int legoPieces1;
    static int legoPieces2;
    static int legoPieces3;
    
	CompetitionLog(){}
	
	public CompetitionLog(int playerNumber, String completeSets, String incompleteSets, int piecesBuilt)
	{
		this.playerNumber = playerNumber;
		this.completeSets = completeSets;
		this.incompleteSets = incompleteSets;
		this.piecesBuilt = piecesBuilt;
	}

	public String getCompleteSets() {
		return completeSets;
	}

	public void setCompleteSets(String completeSets) {
		this.completeSets = completeSets;
	}

	public String getIncompleteSets() {
		return incompleteSets;
	}

	public void setIncompleteSets(String incompleteSets) {
		this.incompleteSets = incompleteSets;
	}

	public int getPiecesBuilt() {
		return piecesBuilt;
	}

	public void setPiecesBuilt(int piecesBuilt) {
		this.piecesBuilt = piecesBuilt;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}
	
	public String toString()
	{
		return "Player "+playerNumber+" completed the following sets: "+completeSets+
				"\n"+"Player "+playerNumber+" did not completed the following sets: "
				+incompleteSets+"\n"+"Player "+playerNumber+" built total of "
				+piecesBuilt+" pieces \n";
	}
	
	public void setCalculations() 
	{
		int remPieces = this.getPiecesBuilt();
		if (remPieces >= legoPieces1) 
		{
		    this.setCompleteSets(this.getCompleteSets() + lego1 + ", ");
		    this.setIncompleteSets(lego2 + ", " + lego3);
		}
		remPieces -= legoPieces1;
		if (remPieces >= legoPieces2) 
		{
		    this.setCompleteSets(lego1 + ", " + lego2);
		    this.setIncompleteSets(lego3);

		}
		remPieces -= legoPieces2;
		if (remPieces >=legoPieces3) 
		{
		    this.setCompleteSets(lego1 + ", " + lego2 + ", " + lego3);
		    this.setIncompleteSets(" none");

		}
	}
	
	public String displayResult(CompetitionLog t) 
	{
		String s = "Congratulations to player " + this.playerNumber + " for winning the Lego Set Competition!" + "\n"+ "Additional information about the competition results is below" + "\n" + "Player " + this.playerNumber+ " completed the following sets: " + this.completeSets + "\n" + "Player " + this.playerNumber+ " did not complet the following sets :" + this.incompleteSets + "\n" + "Player " + this.playerNumber+ " built a total of " + this.piecesBuilt + " pieces." + "\n" + "Player " + t.playerNumber+ " completed the following sets :" + t.completeSets + "\n" + "Player " + t.playerNumber+ " did not complete the following sets : " + t.incompleteSets + "\n" + "Player " + t.playerNumber+ " built a total of " + t.piecesBuilt + " pieces." + "\n" + "The competiton lasted " + days + " days.";
		return s;
	
	}
}




public class LegoSetCompetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		while(flag)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to Lego Set Competition !");
			System.out.println("Enter the name of Lego Set 1");
			String legoSet1 = sc.next();
			System.out.println("Enter the number of pieces in Lego Set 1");
			int pieces1 = sc.nextInt();
			System.out.println("Enter the name of Lego Set 2");
			String legoSet2 = sc.next();
			System.out.println("Enter the number of pieces in Lego Set 2");
			int pieces2 = sc.nextInt();
			System.out.println("Enter the name of Lego Set 3");
			String legoSet3 = sc.next();
			System.out.println("Enter the number of pieces in Lego Set 3");
			int pieces3 = sc.nextInt();
			
			CompetitionLog.totalNoOfPieces = pieces1 + pieces2 + pieces3;
			
			CompetitionLog player1 = new CompetitionLog(1, " none", legoSet1 + ", " + legoSet2 + ", " + legoSet3, 0);
			CompetitionLog player2 = new CompetitionLog(2, " none", legoSet1 + ", " + legoSet2 + ", " + legoSet3, 0);
			
			CompetitionLog.lego1 = legoSet1;
		    CompetitionLog.lego2 = legoSet2;
		    CompetitionLog.lego3 = legoSet3;

		    CompetitionLog.legoPieces1 = pieces1;
		    CompetitionLog.legoPieces2 = pieces2;
		    CompetitionLog.legoPieces3 = pieces3;
		    
		    while (player1.getPiecesBuilt() < CompetitionLog.totalNoOfPieces && player2.getPiecesBuilt() < CompetitionLog.totalNoOfPieces) 
		    {
				System.out
					.println("Enter the number of pieces player 1 used for building on day " + CompetitionLog.days);
				int a = sc.nextInt();
				System.out
					.println("Enter the number of pieces player 2 used for building on day " + CompetitionLog.days);
				int b = sc.nextInt();
				
				player1.setPiecesBuilt(player1.getPiecesBuilt() + a);
				player2.setPiecesBuilt(player2.getPiecesBuilt() + b);
				player1.setCalculations();
				player2.setCalculations();
				
				if (player1.getPiecesBuilt() >= CompetitionLog.totalNoOfPieces
						&& player2.getPiecesBuilt() >= CompetitionLog.totalNoOfPieces) {
					    player1.setPiecesBuilt(0);
					    player2.setPiecesBuilt(0);
					    System.out.println("The competition ended in a tie! There will be a tiebreaker round");
					    break;
					}
					if (player1.getPiecesBuilt() >= CompetitionLog.totalNoOfPieces) {
					    System.out.println(player1.displayResult(player2));
					    flag = false;
					} else if (player2.getPiecesBuilt() >= CompetitionLog.totalNoOfPieces) {
					    flag = false;
					    System.out.println(player2.displayResult(player1));
					}
					CompetitionLog.days++;
				    
		
		    }
		}

	}
}
