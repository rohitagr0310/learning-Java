// Package declaration
package Geekster.operators;

// Class for demonstrating type casting
public class TypeCasting {

  // Main method where the execution starts
  public static void main(String[] args) {
    // Example of casting from int to String
    int num = 27;
    System.out.println("Integer to String: " + Integer.toString(num));

    // Example of casting from double to int
    double dNum = 19.56;
    System.out.println("\nDouble to Int: " + (int) dNum);

    // Example of casting from float to double
    float fNum = 34.8f;
    System.out.println("\nFloat to Double: " + Double.valueOf(fNum));

    // Example of casting from char to int
    char ch = 'A';
    System.out.println("\nChar to Int: " + (int) ch);

    // Examples of various numeric type conversions
    byte bVal = 9;
    short sVal = 10;
    long lVal = 12L;

    System.out.println(
      "\nByte to Short: " +
      (short) bVal +
      "\nShort to Long: " +
      (long) sVal +
      "\nLong to Byte: " +
      (byte) lVal
    );
  }
}
