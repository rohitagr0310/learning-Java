package loops;

public class Loops {

  public void forLoopExample() {
    System.out.println("For Loop Example:");
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
    }
  }

  public void whileLoopExample() {
    System.out.println("\nWhile Loop Example:");
    int j = 1;
    while (j <= 5) {
      System.out.println(j);
      j++;
    }
  }

  public void doWhileLoopExample() {
    System.out.println("\nDo-While Loop Example:");
    int k = 1;
    do {
      System.out.println(k);
      k++;
    } while (k <= 5);
  }

  public static void main(String[] args) {
    Loops example = new Loops();

    example.forLoopExample();
    example.whileLoopExample();
    example.doWhileLoopExample();
  }
}
