public class Example1_update_values {

  String name = "Rajesh";
  int age = 20;

  public static void main(String[] argv) {
    Example1 ex = new Example1();

    ex.name = "Sanjay";
    ex.age = 25;

    System.out.println("Name: " + ex.name);
    System.out.println("Age: " + ex.age);
  }
}
