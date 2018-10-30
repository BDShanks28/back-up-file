import java.util.Random; //imports random in place of using Math.rand()


public class RandomNumberGenerator  //created the class
{
   public static void main (String[] args)
   {
      int max = 100;     //declares max value as an int
      int min = 1;       // declare min value as an int
      Random rand = new Random();    //creates the new random
      
      int n = rand.nextInt(100) + 1;    //creates the random number from 1-100
      System.out.println(n);            // prints out random number made
   }
}