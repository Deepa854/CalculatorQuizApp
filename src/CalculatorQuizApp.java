
import java.util.Scanner;
import java.util.Random;

public class CalculatorQuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int choice;

        do {
            System.out.println("====== Mini Project ======");
            System.out.println("1. Calculator");
            System.out.println("2. Quiz");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                // ===== Calculator =====
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                System.out.println("Choose operation (+, -, *, /): ");
                char op = sc.next().charAt(0);

                double result = 0;
                boolean valid = true;

                switch (op) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error: Cannot divide by zero!");
                            valid = false;
                        }
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        valid = false;
                }

                if (valid) {
                    System.out.println("Result = " + result);
                }

            } else if (choice == 2) {
                // ===== Quiz (random questions) =====
                int score = 0;
                System.out.println("=== Quiz Time! ===");

                // Question 1: addition
                int a = rand.nextInt(10);
                int b = rand.nextInt(10);
                System.out.print("Q1: What is " + a + " + " + b + "? ");
                int ans1 = sc.nextInt();
                if (ans1 == a + b) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! Correct answer = " + (a + b));
                }

                // Question 2: subtraction
                int c = rand.nextInt(10);
                int d = rand.nextInt(10);
                System.out.print("Q2: What is " + c + " - " + d + "? ");
                int ans2 = sc.nextInt();
                if (ans2 == c - d) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! Correct answer = " + (c - d));
                }

                // Question 3: multiplication
                int e = rand.nextInt(10);
                int f = rand.nextInt(10);
                System.out.print("Q3: What is " + e + " * " + f + "? ");
                int ans3 = sc.nextInt();
                if (ans3 == e * f) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! Correct answer = " + (e * f));
                }

                System.out.println("You got " + score + " out of 3 correct!");

            } else if (choice == 3) {
                System.out.println("Exiting... Thank you!");
            } else {
                System.out.println("Invalid choice, try again.");
            }

            System.out.println(); // blank line
        } while (choice != 3);

        sc.close();
    }
}
