package studio8;

import support.cse131.NotYetImplementedException;

public class Question {

	// Step 1: Add instance variables
	private String prompt;
	private String answer;
	private int points;

	/**
	 * Constructor
	 * @param prompt the question prompt
	 * @param answer the correct answer
	 * @param points the number of points the question is worth
	 */
	public Question(String prompt, String answer, int points) {
		this.prompt = prompt;
		this.answer = answer;
		this.points = points;
	}

	/**
	 * Prints out the current question's prompt, with a parenthetical 
	 * number of points possible.
	 */
	public void displayPrompt() {
		System.out.println(this.prompt + " (" + this.points + " points)");
	}

	/**
	 * Check the answer provided by a user
	 * @param givenAnswer
	 * @return the number of points earned by the givenAnswer
	 */
	public int checkAnswer(String givenAnswer) {
		if (answer.equals(givenAnswer)) {
			return this.points;
		} else {
			return 0; 
		}
	}

	/**
	 * Getter method for the points possible
	 * @return int points
	 */
	public int getPoints() {
		return this.points;
	}

	/**
	 * Getter method for the answer to the question
	 * @return String answer
	 */
	public String getAnswer() {
		return this.answer;
	}

	public static void main(String[] args) {
		// Create and test a Question object
		Question q = new Question("What is the capital of France?", "Paris", 5);
		q.displayPrompt(); // Should print: What is the capital of France? (5 points)

		System.out.println("Answer: Paris -> Points: " + q.checkAnswer("Paris")); // Should print: 5
		System.out.println("Answer: London -> Points: " + q.checkAnswer("London")); // Should print: 0
	}
}
