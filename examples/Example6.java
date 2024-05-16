public class Example6 {

  String name;
  int age;

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public static void main(String[] args) {
    Example4 obj = new Example4();

    obj.setName("Rajesh");
    obj.setAge(20);

    System.out.println("Name: " + obj.name);
    System.out.println("Age: " + obj.age);
  }
}
