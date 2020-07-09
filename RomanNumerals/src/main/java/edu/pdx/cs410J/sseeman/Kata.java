package edu.pdx.cs410J.sseeman;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }

  public static String romanNumeralFor(int number) {
    String retValue;                  // Default value

     switch(number) {
      case 1:
        retValue="I";
        break;
      case 5:
        retValue="V";
        break;
       case 10:
         retValue="X";
         break;
       case 50:
         retValue="L";
         break;
       case 100:
         retValue="C";
         break;
       case 500:
         retValue="D";
         break;
       case 1000:
         retValue="M";
         break;
       default:
        retValue="Not Implemented";
    }
    return retValue;
  }

  public static String iMultiples(int number) {
      int count = 0;
      String romanNumeral = "";
      if (number < 4) {                 // how many "I"s needed
          count = number;
          for (int i = 0; i < count; i++) {
              romanNumeral += romanNumeralFor(1);
          }
      } else if (number < 9) {
          count = number % 5;
          romanNumeral += romanNumeralFor(5);
          for (int i = 0; i < count; i++) {
              romanNumeral += romanNumeralFor(1);
          }
      }
      return romanNumeral;

  }
}