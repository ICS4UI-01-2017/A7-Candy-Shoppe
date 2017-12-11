/** 
 * Method to test all of your classes and inheritance structure.
 * It will print out exactly as shown in the example.
 * Be sure your output matches EXACTLY as part of this will be automarked!
 * 
 * @author Adam
 */

public class TestShoppe {

  public static void main(String[] args) {
  
    Checkout checkout = new Checkout();
    
    checkout.enterItem(new Candy("Peanut Butter Fudge", 2.25, 399));
    checkout.enterItem(new IceCream("Vanilla Ice Cream",105));
    checkout.enterItem(new Sundae("Choc. Chip Ice Cream",145, "Hot Fudge", 50));
    checkout.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 399));
    
    System.out.println(checkout);
    
    checkout.clear();
   
    System.out.println("\n");
    
    
    checkout.enterItem(new IceCream("Strawberry Ice Cream",145));
    checkout.enterItem(new Sundae("Vanilla Ice Cream",105, "Caramel", 50));
    checkout.enterItem(new Candy("Gummy Worms", 1.33, 89));
    checkout.enterItem(new Cookie("Chocolate Chip Cookies", 4, 399));
    checkout.enterItem(new Candy("Salt Water Taffy", 1.5, 209));
    checkout.enterItem(new Candy("Candy Corn",3.0, 109));
   
    System.out.println(checkout);
  }
}