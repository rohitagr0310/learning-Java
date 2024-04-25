package Geekster.operators;

import java.util.Scanner;

public class ConditionalOperation {

  Scanner scanner = new Scanner(System.in);
  int number;

  public ConditionalOperation() {
    System.out.println("Enter a number: ");
    number = scanner.nextInt();
  }

  public void display() {
    String result = (number % 2 == 0) ? "Even" : "Odd";

    System.out.println("The entered number is: " + result);
  }

  public static void main(String[] args) {
    ConditionalOperation example = new ConditionalOperation();

    example.display();
  }
}
