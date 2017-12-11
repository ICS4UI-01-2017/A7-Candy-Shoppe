/** 
 * A Dessert Shoppe class
 * 
 * This class stores all of the constants for the program. This class also has the ability to change
 * an integer for cents into a String that has the correct formatting in dollars.
 * DO NOT CHANGE THIS CLASS!
 * 
 * @author Mr. A. Lamont
 */

public class DessertShoppe {

  
  public final static double TAX_RATE = 13;        // 13%
  public final static String STORE_NAME = "HHSS Dessert Shoppe";
  public final static int RECEIPT_WIDTH = 30;
  
  
  /** 
   * Converts an integer value of cents into a String value for dollars and cents
   * 
   * @param cents A integer representing how many cents something will cost
   * @return A string that is formatted as dollars and cents
   */
  public static String cents2dollarsAndCents(int cents) {
 
    String s = "";
     
    if (cents < 0) {
      s += "-";
      cents *= -1;
    }
    
    int dollars = cents/100;
    cents = cents % 100;
    
    if (dollars > 0)
      s += dollars;
    
    s +=".";
      
    if (cents < 10)
      s += "0";
      
    s += cents;
    return s;
  } 
}