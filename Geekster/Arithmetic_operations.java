package Geekster;

import java.util.Scanner;

public class Arithmetic_operations {

  Scanner scanner_class = new Scanner(System.in);

  int number1;
  int number2;

  public Arithmetic_operations() {
    System.out.print("Enter first number - ");
    number1 = scanner_class.nextInt();
    System.out.print("Enter Second number - ");
    number2 = scanner_class.nextInt();
  }

  public void display() {
    System.out.println("Number 1: " + number1);
    System.out.println("Number 2: " + number2);
  }

  public int Addition(int num1, int num2) {
    return (num1 + num2);
  }

  public int Subtraction(int num1, int num2) {
    return (num1 - num2);
  }

  public int Multiplication(int num1, int num2) {
    return (num1 * num2);
  }

  public int Division(int num1, int num2) {
    return (num1 / num2);
  }

  public static void main(String[] args) {
    Arithmetic_operations obj = new Arithmetic_operations();
    obj.display();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the operation you want to perform (1-4):");
    int choice = scanner.nextInt();

    switch (choice) {
      case 1:
        System.out.print("\nAddition of two numbers: ");
        System.out.println(obj.Addition(obj.number1, obj.number2));
        break;
      case 2:
        System.out.print("\nSubtraction of two numbers: ");
        System.out.println(obj.Subtraction(obj.number1, obj.number2));
        break;
      case 3:
        System.out.print("\nMultiplication of two numbers: ");
        System.out.println(obj.Multiplication(obj.number1, obj.number2));
        break;
      case 4:
        System.out.print("\nDivision of two numbers: ");
        System.out.println(obj.Division(obj.number1, obj.number2));
        break;
      default:
        System.out.println(
          "Invalid choice. Please enter a number between 1 and 4."
        );
    }

    scanner.close();
  }
}
