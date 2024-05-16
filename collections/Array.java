import java.util.Scanner;

public class Array {

  public int[] initializeArray(int size) {
    int[] array = new int[size];
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter " + size + " elements for the array:");
    for (int i = 0; i < size; i++) {
      array[i] = scanner.nextInt();
    }

    scanner.close();
    return array;
  }

  public void displayArray(int[] array) {
    System.out.println("Array elements:");
    for (int num : array) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public int calculateSum(int[] array) {
    int sum = 0;
    for (int num : array) {
      sum += num;
    }
    return sum;
  }

  public int findMax(int[] array) {
    int max = array[0];
    for (int num : array) {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    Array Array = new Array();

    int[] myArray = Array.initializeArray(5);

    Array.displayArray(myArray);

    int sum = Array.calculateSum(myArray);
    System.out.println("Sum of array elements: " + sum);

    int maxElement = Array.findMax(myArray);
    System.out.println("Maximum element in the array: " + maxElement);
  }
}
