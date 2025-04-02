package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {

		// New field specific to multiple choice questions
		private String[] choices;

		/**
		 * Constructor
		 * @param prompt the question text
		 * @param answer the correct answer
		 * @param points number of points the question is worth
		 * @param choices array of possible choices
		 */
		public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
			// Call parent constructor to set prompt, answer, points
			super(prompt, answer, points);
			this.choices = choices;
		}

		/**
		 * Display the prompt for the question in addition to 
		 * the choices present for the question.
		 */
		@Override
		public void displayPrompt() {
			// Display the base prompt and points
			super.displayPrompt();

			// Display the choices
			for (int i = 0; i < choices.length; i++) {
				System.out.println((i + 1) + ". " + choices[i]);
			}
		}

		/**
		 * Getter method for the available choices
		 * @return String[] of choices
		 */
		public String[] getChoices() {
			return choices;
		}

		public static void main(String[] args) {
			// Create and test a MultipleChoiceQuestion
			String[] options = {"131", "231", "425", "1301"};
			MultipleChoiceQuestion mcq = new MultipleChoiceQuestion(
				"Which course is the intro to computer science?", 
				"131", 
				3, 
				options
			);

			// Show the prompt and choices
			mcq.displayPrompt();

			// Check answer
			System.out.println("Answer: 131 -> Points: " + mcq.checkAnswer("131")); // Should return 3
			System.out.println("Answer: 231 -> Points: " + mcq.checkAnswer("231")); // Should return 0
		}
	}
