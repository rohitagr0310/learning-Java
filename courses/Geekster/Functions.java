package Geekster;

public class Functions {

  public void printMessage() {
    System.out.println("This is a method with no parameter and no return.");
  }

  public void printMessage(String message) {
    System.out.println(message);
  }

  public String printMessageReturn() {
    return "This is a method with no parameter with return.";
  }

  public String printMessageReturn(String message) {
    return message;
  }

  public static void main(String[] args) {
    Functions fun = new Functions();

    fun.printMessage();
    fun.printMessage("This is a method with parameter and no return.");

    String str1 = fun.printMessageReturn();
    System.out.println(str1);

    String str2 = fun.printMessageReturn(
      "This is a method with parameter and return."
    );
    System.out.println(str2);
  }
}
