public class NestedLoop {

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.err.println(i + " * " + j + " = " + i * j);
      }
      System.err.println();
    }
  }
}
