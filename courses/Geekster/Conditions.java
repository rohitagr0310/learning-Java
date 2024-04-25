package Geekster;

import java.util.Scanner;

public class Conditions {

  Scanner scanner = new Scanner(System.in);
  int number;

  public Conditions() {
    System.out.println("Enter a number: ");
    number = scanner.nextInt();
  }

  public void display() {
    if (number > 0) {
      System.out.println("The entered number is positive.");
    } else if (number < 0) {
      System.out.println("The entered number is negative.");
    } else {
      System.out.println("The entered number is zero.");
    }
  }

  public static void main(String[] args) {
    Conditions example = new Conditions();

    example.display();
  }
}
