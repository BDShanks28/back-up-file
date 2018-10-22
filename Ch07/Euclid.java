public class Euclid
{
   public static int findGCF(int a, int b)
   {
      while (a != b)
      {
         if ( a > b)
         {
           //a = a - b;
           a -= b;
         }
         else
         {
            //b = b - a;
            b -= a;
         }
      }
      
      return a;
   }
}