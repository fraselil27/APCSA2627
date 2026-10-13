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

			if(answerToQuestion == "D")
			{
				numCorrectAnswers++;
				numQuestion++;
			}

			else
			{
				numQuestion++;
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
			if(answerToQuestion == "A")
			{
				numCorrectAnswers++;
				numQuestion++;
			}
			else
			{
				numQuestion++;
			}
		}

			
			
		



		}

	}


}