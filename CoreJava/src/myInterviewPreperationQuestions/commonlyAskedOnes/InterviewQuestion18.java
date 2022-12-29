package myInterviewPreperationQuestions.commonlyAskedOnes;
	/*
	 Ask user to enter the number of lines of a pyramid.
	  Type a program to create the pyramid.
	  For example if the number of lines is 5, the pyramid will be like;           *
																			      * * * 
																			    * * * * * 
																			  * * * * * * * 
																			* * * * * * * * *
	 */
public class InterviewQuestion18 {

	public static void main(String[] args) {

		int numOfRows = 5; 
		
		for(int i=1; i<=numOfRows; i++) {
			
			for(int space = 1; space<=numOfRows-i; space++) {
				System.out.print("  ");
			}
			
			for(int k=0; k<2*i-1; k++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
	}

}
