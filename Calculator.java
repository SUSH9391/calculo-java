import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Console Calculator!");
        System.out.println("Enter an expression (or type 'exit' to quit):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                double result = eval(input);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }

    public static double eval(String expression) {
        // Basic evaluation logic for arithmetic operations
        String[] tokens = expression.split("(?<=[-+*/])|(?=[-+*/])"); // Split by operators
        double result = 0;
        String operator = "+";

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                operator = token;
            } else {
                double number = Double.parseDouble(token);
                switch (operator) {
                    case "+":
                        result += number;
                        break;
                    case "-":
                        result -= number;
                        break;
                    case "*":
                        result *= number;
                        break;
                    case "/":
                        if (number != 0) {
                            result /= number;
                        } else {
                            throw new ArithmeticException("Cannot divide by zero");
                        }
                        break;
                }
            }
        }
        return result;
    }
}
