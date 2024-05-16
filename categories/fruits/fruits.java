package categories.fruits;

public class fruits {

  public static void fruits() {
    String fruits[] = { "Apple", "banana", "mango", "Strawberry" };

    System.out.println("Fruits: ");

    for (int i = 0; i < fruits.length; i++) {
      System.out.println(fruits[i]);
    }
  }

  public static void main(String[] args) {
    fruits();
  }
}
