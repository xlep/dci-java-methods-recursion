import java.util.Scanner;

public class Solution {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Solution solution = new Solution();

    solution.getFactorial(scanner);
    solution.getSquares(scanner);
  }

  // Factorial
  void getFactorial(Scanner scanner) {
    System.out.println("Please input a positive number:");

    int inputNumber = scanner.nextInt();
    int factorial = calcFactorial(inputNumber);

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Result: " + inputNumber + "! = ");
    stringBuilder = buildFactorialString(inputNumber, stringBuilder);
    stringBuilder.append(" = " + factorial );

    System.out.println(stringBuilder.toString());
  }

  int calcFactorial(int number) {
    if (number == 1) {
      return 1;
    } else {
      return (number * calcFactorial(number - 1));
    }
  }

  StringBuilder buildFactorialString(int number, StringBuilder stringBuilder) {
    if (number == 1) {
      return stringBuilder.append("1");
    } else {
      stringBuilder.append(number + " x ");
      return buildFactorialString(number - 1, stringBuilder);
    }
  }

  // Triangle
  void getSquares(Scanner scanner) {
    System.out.println("\nPlease input the number of rows in our triangle:");
    int numberOfRows = scanner.nextInt();

    int numberOfSquares = triangle(numberOfRows);
    System.out.println("A triangle of " + numberOfRows + " rows has " + numberOfSquares + " squares.");

    // tail-recursive
    numberOfSquares = triangleTailRecursive(numberOfRows, 0);
    System.out.println("A triangle of " + numberOfRows + " rows has " + numberOfSquares + " squares.");
  }

  int triangle(int numberOfRows) {
    if (numberOfRows == 1) {
      return 1;
    }
    return numberOfRows + triangle(numberOfRows - 1);
  }

  int triangleTailRecursive(int numberOfRows, int sum) {
    if (numberOfRows == 0) {
      return sum;
    } else {
      return triangleTailRecursive(numberOfRows - 1, sum + numberOfRows);
    }
  }

}
