import java.util.Scanner;

public class IntMath {
    public enum MathOperator { PLUS, MINUS, MULTIPLY, DIVIDE };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num1 = sc.nextInt();

        System.out.print("Please enter another number: ");
        int num2 = sc.nextInt();

        System.out.println("Sum: " + calculate(MathOperator.PLUS, num1, num2));
        System.out.println("Difference: " + calculate(MathOperator.MINUS, num1, num2));
        System.out.println("Product: " + calculate(MathOperator.MULTIPLY, num1, num2));
        System.out.println("Quotient: " + calculate(MathOperator.DIVIDE, num1, num2));

        sc.close();
    }

    public static int calculate (MathOperator operator, int operand1, int operand2) {
        switch(operator) {
            case PLUS:
                  return operand1 + operand2;
            case MINUS:
                  return operand1 - operand2;
            case MULTIPLY:
                  return operand1 * operand2;
            case DIVIDE:
                  return operand1 / operand2;
            default:
                  throw new UnsupportedOperationException();
     }
    }
}