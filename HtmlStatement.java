import java.util.Enumeration;

public class HtmlStatement extends Statement {

  private static String s1 = "<H1>Rentals for <EM>";
  private static String s2 = "</EM></H1><P>\n";
  private static String s3 = ": ";
  private static String s4 = "<BR>\n";
  private static String s5 = "<P>You owe <EM>";
  private static String s6 = "</EM><P>\n";
  private static String s7 = "On this rental you earned <EM>";
  private static String s8 = "</EM> frequent renter points<P>";

   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = s1 + aCustomer.getName() +
      s2;
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
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