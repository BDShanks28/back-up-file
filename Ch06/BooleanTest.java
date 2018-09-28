public class BooleanTest
{
   public static void main (String[] args)
   {
      System.out.println(Math.sqrt(-2));
      System.out.println(Math.sqrt(-2));
   }
   
   public static boolean shortCircuit(int x)
   {
      if (Math.sqrt(x) <= 15)
      {
         return true;
      }
      else
      {
      return false;
      }
   }
}