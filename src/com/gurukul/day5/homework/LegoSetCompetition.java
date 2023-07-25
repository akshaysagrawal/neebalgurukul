package com.gurukul.day5.homework;

import java.util.Scanner;
//
//
//class CompetitionLog
//{
//	private int playerNumber;
//	private String completeSets;
//	private String incompleteSets;
//	private int piecesBuilt;
//	static int days = 1;
//    static int totalNoOfPieces;
//    static String lego1;
//    static String lego2;
//    static String lego3;
//    static int legoPieces1;
//    static int legoPieces2;
//    static int legoPieces3;
//    
//	CompetitionLog(){}
//	
//	public CompetitionLog(int playerNumber, String completeSets, String incompleteSets, int piecesBuilt)
//	{
//		this.playerNumber = playerNumber;
//		this.completeSets = completeSets;
//		this.incompleteSets = incompleteSets;
//		this.piecesBuilt = piecesBuilt;
//	}
//
//	public String getCompleteSets() {
//		return completeSets;
//	}
//
//	public void setCompleteSets(String completeSets) {
//		this.completeSets = completeSets;
//	}
//
//	public String getIncompleteSets() {
//		return incompleteSets;
//	}
//
//	public void setIncompleteSets(String incompleteSets) {
//		this.incompleteSets = incompleteSets;
//	}
//
//	public int getPiecesBuilt() {
//		return piecesBuilt;
//	}
//
//	public void setPiecesBuilt(int piecesBuilt) {
//		this.piecesBuilt = piecesBuilt;
//	}
//
//	public int getPlayerNumber() {
//		return playerNumber;
//	}
//	
//	public String toString()
//	{
//		return "Player "+playerNumber+" completed the following sets: "+completeSets+
//				"\n"+"Player "+playerNumber+" did not completed the following sets: "
//				+incompleteSets+"\n"+"Player "+playerNumber+" built total of "
//				+piecesBuilt+" pieces \n";
//	}
//	
//	public void setCalculations() 
//	{
//		int remPieces = this.getPiecesBuilt();
//		if (remPieces >= legoPieces1) 
//		{
//		    this.setCompleteSets(this.getCompleteSets() + lego1 + ", ");
//		    this.setIncompleteSets(lego2 + ", " + lego3);
//		}
//		remPieces -= legoPieces1;
//		if (remPieces >= legoPieces2) 
//		{
//		    this.setCompleteSets(lego1 + ", " + lego2);
//		    this.setIncompleteSets(lego3);
//
//		}
//		remPieces -= legoPieces2;
//		if (remPieces >=legoPieces3) 
//		{
//		    this.setCompleteSets(lego1 + ", " + lego2 + ", " + lego3);
//		    this.setIncompleteSets(" none");
//
//		}
//	}
//	
//	public String displayResult(CompetitionLog t) 
//	{
//		String s = "Congratulations to player " + this.playerNumber + " for winning the Lego Set Competition!" + "\n"+ "Additional information about the competition results is below" + "\n" + "Player " + this.playerNumber+ " completed the following sets: " + this.completeSets + "\n" + "Player " + this.playerNumber+ " did not complet the following sets :" + this.incompleteSets + "\n" + "Player " + this.playerNumber+ " built a total of " + this.piecesBuilt + " pieces." + "\n" + "Player " + t.playerNumber+ " completed the following sets :" + t.completeSets + "\n" + "Player " + t.playerNumber+ " did not complete the following sets : " + t.incompleteSets + "\n" + "Player " + t.playerNumber+ " built a total of " + t.piecesBuilt + " pieces." + "\n" + "The competiton lasted " + days + " days.";
//		return s;
//	
//	}
//}
//
//
//
//
//public class LegoSetCompetition {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		boolean flag = true;
//		while(flag)
//		{
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Welcome to Lego Set Competition !");
//			System.out.println("Enter the name of Lego Set 1");
//			String legoSet1 = sc.next();
//			System.out.println("Enter the number of pieces in Lego Set 1");
//			int pieces1 = sc.nextInt();
//			System.out.println("Enter the name of Lego Set 2");
//			String legoSet2 = sc.next();
//			System.out.println("Enter the number of pieces in Lego Set 2");
//			int pieces2 = sc.nextInt();
//			System.out.println("Enter the name of Lego Set 3");
//			String legoSet3 = sc.next();
//			System.out.println("Enter the number of pieces in Lego Set 3");
//			int pieces3 = sc.nextInt();
//			
//			CompetitionLog.totalNoOfPieces = pieces1 + pieces2 + pieces3;
//			
//			CompetitionLog player1 = new CompetitionLog(1, " none", legoSet1 + ", " + legoSet2 + ", " + legoSet3, 0);
//			CompetitionLog player2 = new CompetitionLog(2, " none", legoSet1 + ", " + legoSet2 + ", " + legoSet3, 0);
//			
//			CompetitionLog.lego1 = legoSet1;
//		    CompetitionLog.lego2 = legoSet2;
//		    CompetitionLog.lego3 = legoSet3;
//
//		    CompetitionLog.legoPieces1 = pieces1;
//		    CompetitionLog.legoPieces2 = pieces2;
//		    CompetitionLog.legoPieces3 = pieces3;
//		    
//		    while (player1.getPiecesBuilt() < CompetitionLog.totalNoOfPieces && player2.getPiecesBuilt() < CompetitionLog.totalNoOfPieces) 
//		    {
//				System.out
//					.println("Enter the number of pieces player 1 used for building on day " + CompetitionLog.days);
//				int a = sc.nextInt();
//				System.out
//					.println("Enter the number of pieces player 2 used for building on day " + CompetitionLog.days);
//				int b = sc.nextInt();
//				
//				player1.setPiecesBuilt(player1.getPiecesBuilt() + a);
//				player2.setPiecesBuilt(player2.getPiecesBuilt() + b);
//				player1.setCalculations();
//				player2.setCalculations();
//				
//				if (player1.getPiecesBuilt() >= CompetitionLog.totalNoOfPieces
//						&& player2.getPiecesBuilt() >= CompetitionLog.totalNoOfPieces) {
//					    player1.setPiecesBuilt(0);
//					    player2.setPiecesBuilt(0);
//					    System.out.println("The competition ended in a tie! There will be a tiebreaker round");
//					    break;
//					}
//					if (player1.getPiecesBuilt() >= CompetitionLog.totalNoOfPieces) {
//					    System.out.println(player1.displayResult(player2));
//					    flag = false;
//					} else if (player2.getPiecesBuilt() >= CompetitionLog.totalNoOfPieces) {
//					    flag = false;
//					    System.out.println(player2.displayResult(player1));
//					}
//					CompetitionLog.days++;
//				    
//		
//		    }
//		}
//
//	}
//}


//SIR'S METHOD


class CompetitionLog
{
	private int playerNumber;
	private String completeSets="";
	private String incompleteSets="";
	private int piecesBuilt;
	
    
  
    
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
	
	
}
public class LegoSetCompetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CompetitionLog player1=null,player2=null;
		int total=0;
		boolean winner1=false,winner2=false;
		outer:do {
		System.out.println("Welcome to the legoset Comption");
		System.out.println("Enter the name of the legoset1");
		String legoname1=sc.nextLine();
		System.out.println("Enter the number of legos");
		int number1=sc.nextInt();
		System.out.println("Enter the name of the legoset2");
		sc.nextLine();

		String legoname2=sc.nextLine();
		System.out.println("Enter the number of legos");
		int number2=sc.nextInt();
		System.out.println("Enter the name of the legoset2");
		sc.nextLine();

		String legoname3=sc.nextLine();
		System.out.println("Enter the number of legos");
		int number3=sc.nextInt();
		sc.nextLine();
		 total+=number1+number2+number3;
		int d=1;
		if(player1!=null) {
		player1=new CompetitionLog(1, player1.getCompleteSets(),legoname1+" "+legoname2+" "+legoname3,player1.getPiecesBuilt());
		player2=new CompetitionLog(2, player2.getCompleteSets(), legoname1+" "+legoname2+" "+legoname3,player2.getPiecesBuilt());	
		}
		else
		{
			player1=new CompetitionLog(1, "",legoname1+" "+legoname2+" "+legoname3,0);
			player2=new CompetitionLog(2, "", legoname1+" "+legoname2+" "+legoname3,0);
			
		}
			
			
		while(!(winner1 || winner2)) {
		System.out.println("Enter the number of pieces in day"+ d);
		int p1=sc.nextInt();
		System.out.println("Enter the number of pieces in day"+ d);
		int p2=sc.nextInt();
		sc.nextLine();
		d++;
		
		if(player1.getPiecesBuilt()+p1>=total)
			p1=total-player1.getPiecesBuilt();
		
		if(player2.getPiecesBuilt()+p2>=total)
			p2=total-player2.getPiecesBuilt();
		
		player1.setPiecesBuilt(player1.getPiecesBuilt()+p1);
		player2.setPiecesBuilt(player2.getPiecesBuilt()+p2);
		if(player1.getPiecesBuilt()>=number1)
			player1.setCompleteSets(player1.getCompleteSets()+" "+legoname1);
		    player1.setIncompleteSets(legoname2+" "+legoname3);
		
		if(player2.getPiecesBuilt()>=number1) {
			player2.setCompleteSets(player2.getCompleteSets()+" "+legoname1);
			 player1.setIncompleteSets(legoname2+" "+legoname3);
		}
		
		if(player1.getPiecesBuilt()-number1>=number2)
			player1.setCompleteSets(player1.getCompleteSets()+" "+ legoname1+ " "+ legoname1);
		    player1.setIncompleteSets(legoname3);
		
		if(player2.getPiecesBuilt()-number1>=number2) {
			player2.setCompleteSets(player2.getCompleteSets()+" "+legoname1+" "+legoname2);
			 player2.setIncompleteSets(legoname3);
		}
		if(player1.getPiecesBuilt()-number1-number2>=number2)
			player1.setCompleteSets(player1.getCompleteSets()+" "+legoname1+ " "+ legoname2+ " "+legoname3);
		    player1.setIncompleteSets("");
		
		if(player2.getPiecesBuilt()-number1-number2>=number3) {
			player2.setCompleteSets(player2.getCompleteSets()+" "+legoname1+ " "+legoname2+ " "+legoname3);
			 player2.setIncompleteSets("");
		}
		if(player1.getPiecesBuilt()==total) {
			winner1=true;
		}
		if(player2.getPiecesBuilt()==total) {
			winner2=true;
		}
		if(winner1&&winner2) {
			System.out.println("Tie");
			winner1=false; winner2=false;
			continue outer;
		}
		
	}
		if(winner1 || winner2) {
		if(winner1) {
			System.out.println("Winner is Player1" );
			
		}
		if(winner2) {
			System.out.println("Winner is Player2" );
			
		}
		System.out.println(player1 + "\n"+player2);
		break;
		}
		}while(true);
}
}
