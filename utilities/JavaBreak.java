public class JavaBreak {

  public static void main(String[] args) {
    for (int i = 0; i < 20; i++) {
      if (i % 2 == 0) {
        System.err.println(i + " is even number");
      }
      if (i == 12) {
        break;
      }
    }
  }
}
