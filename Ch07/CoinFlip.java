import java.util.Random; //imports random in place of using Math.rand()


public class CoinFlip  //created the class
{
   public static void main (String[] args)
   {
      int max = 2;     //declares max value as an int
      int min = 1;       // declare min value as an int
      Random rand = new Random();    //creates the new random
      
      int n = rand.nextInt(2) + 1;    //creates the random number from 1-100
      if( n == 1) System.out.println("Heads");
      else System.out.println("Tails");            // prints out random number made
   }
}