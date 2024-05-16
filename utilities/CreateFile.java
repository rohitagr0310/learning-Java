package utilities;

import java.io.File;
import java.io.IOException;

public class CreateFile {

  public static void main(String[] args) {
    try {
      File myObj = new File("candidate1.txt");
      if (myObj.createNewFile()) {
        System.out.println("Created Successfully: " + myObj.getName());
      } else {
        System.out.println("Sorry, File not Created");
      }
    } catch (IOException e) {
      System.out.println("Error...");
      e.printStackTrace();
    }
  }
}
