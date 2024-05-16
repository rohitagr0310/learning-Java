import java.util.Scanner;

public class IncrementDecrementOperations {

  Scanner scanner = new Scanner(System.in);

  int number;

  public IncrementDecrementOperations() {
    System.out.print("Enter a number - ");
    number = scanner.nextInt();
  }

  public void display() {
    System.out.println("Entered Number: " + number);
  }

  public int preIncrement() {
    return ++number;
  }

  public int postIncrement() {
    return number++;
  }

  public int preDecrement() {
    return --number;
  }

  public int postDecrement() {
    return number--;
  }

  public static void main(String[] args) {
    IncrementDecrementOperations operations = new IncrementDecrementOperations();

    operations.display();

    System.out.println(
      "Result of Pre-Increment Operation: " + operations.preIncrement()
    );
    System.out.println(
      "Result of Post-Increment Operation: " + operations.postIncrement()
    );
    System.out.println(
      "Result of Pre-Decrement Operation: " + operations.preDecrement()
    );
    System.out.println(
      "Result of Post-Decrement Operation: " + operations.postDecrement()
    );
  }
}
