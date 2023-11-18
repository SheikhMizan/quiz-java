import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions and their corresponding correct answers
        String[] questions = {
                "What is the capital of France?",
                "Which planet is known as the Red Planet?",
                "What is the largest mammal?",
                "What is the powerhouse of the cell?",
                "Who wrote 'Romeo and Juliet'?"
        };
        char[] correctAnswers = {'C', 'D', 'B', 'A', 'B'};

        // Counter to keep track of correct responses
        int correctCount = 0;

        // Display and process each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.println("A) Paris\tB) Mars\tC) Blue Whale\tD) Mitochondrion");

            // Prompt the user for an answer
            System.out.print("Your answer (A, B, C, or D): ");
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));

            // Compare the user's answer with the correct answer using switch
            switch (userAnswer) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswer == correctAnswers[i]) {
                        System.out.println("Correct!\n");
                        correctCount++;
                    } else {
                        System.out.println("Incorrect. The correct answer is " + correctAnswers[i] + ".\n");
                    }
                    break;
                default:
                    System.out.println("Invalid input. Please enter A, B, C, or D.\n");
            }
        }

        // Calculate and display the final score
        double score = (double) correctCount / questions.length * 100;
        System.out.println("Quiz completed! Your final score: " + score + "%");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
