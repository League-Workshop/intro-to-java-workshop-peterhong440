package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int userScore = 0;
		// 2.  Ask the user a question 
		String input = JOptionPane.showInputDialog(null, "What is the best color?");
		// 3.  Use an if statement to check if their answer is correct
		if (input.equals("blue")) {
		JOptionPane.showMessageDialog(null, "Your answer is correct!");
		}
		// 4.  if the user's answer was correct, add one to their score 
		if (input.contentEquals("blue")) {
		   userScore =+ 1;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		 input = JOptionPane.showInputDialog(null, "What is the best food?");
		if (input.equals("hamburger")) {
			userScore = userScore + 1;
		}
		// 6.  After all the questions have been asked, print the user's score 
		 JOptionPane.showMessageDialog(userScore);
		System.out.println(userScore);
	}
}
