public class VariableType {

  public void localVariable() {
    String name = "jack";
    int marks = 90;
    System.out.println(name + "Scored = " + marks + "%.");
  }

  public static void main(String[] args) {
    VariableType vt = new VariableType();

    vt.localVariable();
  }
}
