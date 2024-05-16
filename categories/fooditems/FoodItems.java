public class FoodItems {

  public static void Vegetables() {
    String vegetables[] = { "Onion", "Potato", "Carrot", "Radish" };

    System.out.println("Vegetables: ");

    for (int i = 0; i < vegetables.length; i++) {
      System.out.println(vegetables[i]);
    }
  }

  public static void Fruits() {
    String fruits[] = { "Apple", "Banana", "Mango", "Strawberry" };

    System.out.println("\n\nFruits: ");

    for (int i = 0; i < fruits.length; i++) {
      System.out.println(fruits[i]);
    }
  }

  public static void main(String[] args) {
    Vegetables();
    Fruits();
  }
}
