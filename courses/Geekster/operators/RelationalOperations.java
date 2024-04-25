package Geekster.operators;

import java.util.Scanner;

public class RelationalOperations {

  Scanner scanner = new Scanner(System.in);

  int number1;
  int number2;

  public RelationalOperations() {
    System.out.print("Enter first number - ");
    number1 = scanner.nextInt();
    System.out.print("Enter Second number - ");
    number2 = scanner.nextInt();
  }

  public void display() {
    System.out.println("Number 1: " + number1);
    System.out.println("Number 2: " + number2);
  }

  public boolean greater_than(int num1, int num2) {
    return (num1 > num2);
  }

  public boolean less_than(int num1, int num2) {
    return (num1 < num2);
  }

  public boolean greater_than_equalto(int num1, int num2) {
    return (num1 >= num2);
  }

  public boolean less_than_equalto(int num1, int num2) {
    return (num1 <= num2);
  }

  public boolean equalto(int num1, int num2) {
    return (num1 == num2);
  }

  public boolean not_equalto(int num1, int num2) {
    return (num1 != num2);
  }

  public static void main(String[] args) {
    RelationalOperations operations = new RelationalOperations();

    operations.display();

    System.out.println(
      "Answer of Greater than Operator - " +
      operations.greater_than(operations.number1, operations.number2)
    );
    System.out.println(
      "Answer of Less than Operator - " +
      operations.less_than(operations.number1, operations.number2)
    );
    System.out.println(
      "Answer of Greater than Equal to Operator - " +
      operations.greater_than_equalto(operations.number1, operations.number2)
    );
    System.out.println(
      "Answer of Less than Equal to Operator - " +
      operations.less_than_equalto(operations.number1, operations.number2)
    );
    System.out.println(
      "Answer of Equal to Operator - " +
      operations.equalto(operations.number1, operations.number2)
    );
    System.out.println(
      "Answer of Not Equal to Operator - " +
      operations.not_equalto(operations.number1, operations.number2)
    );
  }
}
