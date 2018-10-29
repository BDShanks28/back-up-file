import java.util.Random;


public class RandomNumberGenerator
{
   public static void main (String[] args)
   {
      int max = 100;
      int min = 1;
      Random rand = new Random();
      
      int n = rand.nextInt(100) + 1;
      System.out.println(n);
   }
}