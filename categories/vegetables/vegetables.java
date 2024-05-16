package categories.vegetables;

public class vegetables {

  public static void vegetables() {
    String vegetables[] = { "Onion", "Potato", "Carrot", "Raddish" };

    System.out.println("vegetables: ");

    for (int i = 0; i < vegetables.length; i++) {
      System.out.println(vegetables[i]);
    }
  }

  public static void main(String[] args) {
    vegetables();
  }
}
