// Lily Fraser
// FirstQuarterQuiz.java
//Extra Credit Assignment

import java.util.Scanner;

public class FirstQuarterQuiz
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.println("Hello, today I have a APCSA first quarter quiz for you! What is your name?");
		name = scan.nextLine();
		System.out.println("Hi, "+name+". Nice to meet you. The quiz is 5 questions long. There will be 4 options for each question.\nType the capital letter of the answer choice that you think is right. \nAfter you answer all of the questions, I'll let you know your score out of 5, percentage, letter grade, which question(s) you got wrong (if any), and what the right answers are to the questions you got wrong. \nPut away your notes, and let's get started! \n\n\n\n"); 
		//declaring Strings for the answers to the questions 
		String answerToQuestion;
		int numQuestion = 1;
		int numCorrectAnswers = 0;
		boolean questionOneRight = false;
		boolean questionTwoRight = false;
		boolean questionThreeRight = false;
		boolean questionFourRight = false;
		boolean questionFiveRight = false;

		System.out.println("Here is Question "+numQuestion+". Remember to type the capital answer of the letter of your response.");
		
		//asking question1

		if (numQuestion == 1)
		{
			System.out.println("The following line outputs which of the following when compiled and run? \nSystem.out.print(6/0);");
			System.out.println("A. 6/0");
			System.out.println("B. A runtime error is issued and the program does not compile.");				
			System.out.println("C. A syntax error is issued.");
			System.out.println("D. A runtime error is issued once the program compiles and tries to run.");
			System.out.println("Type your answer here: ");
			answerToQuestion = scan.nextLine();

			if(answerToQuestion.equals("D"))
			{
				numCorrectAnswers++;
				numQuestion++;
				questionOneRight = true;
			}

			else
			{
				numQuestion++;
				questionOneRight = false;
			}

		}


		//asking question 2

		System.out.println("Here is Question "+numQuestion+". Remember to type the capital answer of the letter of your response.");

		if(numQuestion == 2)
		{
			System.out.println("Which of the following is the binary code for white?");
			System.out.println("A. 1111 1111.1111 1111. 1111 1111");
			System.out.println("B. 0000 0000.0000 0000.0000 0000");
			System.out.println("C. 1111 1111. 0000 0000. 1111 1111");
			System.out.println("D. 1111 0000. 0000 1111. 1111 0000");
			System.out.println("Type your answer here: ");
			answerToQuestion = scan.nextLine();
			if(answerToQuestion.equals("A"))
			{
				numCorrectAnswers++;
				numQuestion++;
				questionTwoRight = true;
			}
			else
			{
				numQuestion++;
				questionTwoRight = false;
			}
		}

		//asking question 3

		System.out.println("Here is Question "+numQuestion+". Remember to type the capital answer of the letter of your response.");

		if(numQuestion == 3)
		{
			System.out.println("Which of the following correctly declares and initializes a primitive variable?");
			System.out.println("A. String quiz = Quiz today!!;");
			System.out.println("B. double quizScore = 98;");
			System.out.println("C. Int numStudents = 10;");
			System.out.println("D. char letterGrade = A;");
			System.out.println("Type your answer here: ");
			answerToQuestion = scan.nextLine();
			if(answerToQuestion.equals("B"))
			{
				numCorrectAnswers++;
				numQuestion++;
				questionThreeRight = true;
			}
			else
			{
				numQuestion++;
				questionThreeRight = false;
			}
		}	
		//asking question 4

		System.out.println("Here is Question "+numQuestion+". Remember to type the capital answer of the letter of your response.");

		if(numQuestion == 4)
		{
			System.out.println("What is the output of the following statement?\nSystem.out.print(12%5);");
			System.out.println("A. 2");
			System.out.println("B. 2.4");
			System.out.println("C. 12%5");
			System.out.println("D. 12.5");
			System.out.println("Type your answer here: ");
			answerToQuestion = scan.nextLine();
			if(answerToQuestion.equals("A"))
			{
				numCorrectAnswers++;
				numQuestion++;
				questionFourRight = true;
			}
			else
			{
				numQuestion++;
				questionFourRight = false;
			}
		}	
		//asking question 5

		System.out.println("Here is Question "+numQuestion+". Remember to type the capital answer of the letter of your response.");

		if(numQuestion == 5)
		{
			System.out.println("What does OOP stand for?");
			System.out.println("A. Object Oriented Programs");
			System.out.println("B. Object Output Programs");
			System.out.println("C. Object Oriented Programming");
			System.out.println("D. Open Object Programming");
			System.out.println("Type your answer here: ");
			answerToQuestion = scan.nextLine();
			if(answerToQuestion.equals("C"))
			{
				numCorrectAnswers++;
				questionFiveRight = true;
			}
			else
			{
				questionFiveRight = false;
			}
		}	

		double percentCorrect = ((double)(numCorrectAnswers)/(double)(numQuestion))*100;
		System.out.println("Your percentage of correct answers is "+percentCorrect+"%. You got "+numCorrectAnswers+" correct.");
		
		//saying letter grades
		if(numCorrectAnswers == 5)
		{
			System.out.println("You got every question correct! You earned an A+ on this quiz.");
		}
		else if(numCorrectAnswers == 4)
		{
			System.out.println("You earned a B- on this assignment.");
		}
		else if(numCorrectAnswers == 3)
		{
			System.out.println("You earned a D- on this assignment.");
		}
		else if(numCorrectAnswers < 3)
		{
			System.out.println("You failed this assignment.");
		}


		//saying which questions are wrong and what correct answers are
		

		if(questionOneRight == false)
		{
			System.out.println("You got question one wrong. The correct answer to question one was D.");
		}
		if(questionTwoRight == false)
		{
			System.out.println("You got question two wrong. The correct answer to question two was A.");
		}
		if(questionThreeRight == false)
		{
			System.out.println("You got question three wrong. The correct answer to question three was B.");
		}
		if(questionFourRight == false)
		{
			System.out.println("You got question four wrong. The correct answer to question four was A.");
		}
		if(questionFiveRight == false)
		{
			System.out.println("You got question five wrong. The correct answer to question five was C.");
		}

	}
}