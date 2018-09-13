public class VariableTest
{
   public static void main(String[]args)
   {
      System.out.println(convertGallons(3.0));
      
   }
   
   public static int convertGallons(double l)
   {
      int gallons = (int)(3.785411784*l);
      return gallons;
   }
}