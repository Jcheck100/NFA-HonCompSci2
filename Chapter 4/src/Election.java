import java.text.NumberFormat;
import java.util.Scanner;


public class Election {

	public static void main(String[] args) {
		int voteNY1;
		int voteNY2;
		int voteCT1;
		int voteCT2;
		int voteNJ1;
		int voteNJ2;
		int firstVotes;
		int secondVotes;
		int totalVotes;
		double firstVotePercent;
		double secondVotePercent;
		NumberFormat percent = NumberFormat.getPercentInstance();	
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Please enter the number of votes from CT for Awbrey: ");
		voteCT1 = input.nextInt();
		System.out.print("Please enter the number of votes from CT for Martinez: ");
		voteCT2 = input.nextInt();
		System.out.print("Please enter the number of votes from NY for Awbrey: ");
		voteNY1 = input.nextInt();
		System.out.print("Please enter the number of votes from NY for Martinez: ");
		voteNY2 = input.nextInt();
		System.out.print("Please enter the number of votes from NJ for Awbrey: ");
		voteNJ1 = input.nextInt();
		System.out.print("Please enter the number of votes from NJ for Martinez: ");
		voteNJ2 = input.nextInt();
	
		
		
		firstVotes = voteNY1 + voteCT1 + voteNJ1;
		secondVotes = voteNY2 + voteCT2 + voteNJ2;
		totalVotes = firstVotes + secondVotes;
		
		
		firstVotePercent = (double)firstVotes/(double)totalVotes;
		secondVotePercent = (double)secondVotes/(double)totalVotes;
		
		System.out.print ("\n");
		System.out.format ("%9s %10s %10s","Candidate", "Votes", "Percent \n");
		System.out.format ("%-9s %10s %10s","Awbrey", firstVotes, percent.format(firstVotePercent) + "\n");
		System.out.format ("%-9s %10s %10s","Martinez", secondVotes, percent.format(secondVotePercent) + "\n");
		System.out.print ("Total Votes: " + totalVotes + "\n");
		
		
		input.close();
	
	}

}
