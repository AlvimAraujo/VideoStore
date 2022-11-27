import java.util.Enumeration;

public class TextStatement extends Statement {

  private static String s1 = "Rental Record for ";
  private static String s2 = "\n";
  private static String s3 = "\t";
  private static String s4 = "\n";
  private static String s5 = "Amount owed is ";
  private static String s6 = "\n";
  private static String s7 = "You earned ";
  private static String s8 = " frequent renter points";
  
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = s1 + aCustomer.getName() +
      s2;
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += each.getMovie().getTitle()+ s3 +
         String.valueOf(each.getCharge()) + s4;
      }
      //add footer lines
      result += s5 +
      String.valueOf(aCustomer.getTotalCharge()) + s6;
      result += s7 +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      s8;
      return result;
   }
  
}