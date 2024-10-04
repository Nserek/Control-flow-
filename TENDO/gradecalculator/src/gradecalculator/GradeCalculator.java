package gradecalculator;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numScores = 5;
		double sum = 0;
		
		for (int i = 0; i < numScores; i++) {
			System.out.println("Enter score" + (i + 1) + ": ");
			
			double score = scanner.nextDouble();
				sum += score;
		}

		double average = sum / numScores;
		
		System.out.println("Average grade: + average");
		
		
		
		
		
		
	}

}
