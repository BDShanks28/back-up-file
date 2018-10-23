import java.util.Scanner;

public class MyMath
{
  /**
   * Returns the sum of all integers from 1 to n, if n >= 1,
   * and 0 otherwise.
   */
  public static int sumUpTo(int n)
  {
    int sum = 0;

    for (int k = 1; k <= n; k++)
      sum += k;

    return sum;
  }

  /**
   * Returns 1 * 2 * ... * n, if n >= 1; otherwise returns 1
   */
  public static long factorial(int n)
  {
    long f = 1;

    for (int k = 2; k <= n; k++)
      f *= k;

    return f;
  }

  /**
   * Returns true if n is a prime; otherwise returns false
   */
  public static boolean isPrime(int n)
  {
    if (n <= 1)
      return false;

    int m = 2;

    while (m * m <= n)
    {
      if (n % m == 0)
        return false;
      m++;
    }

    return true;
  }

  /**
   * Tests Goldbach conjecture for even numbers
   * up to bigNum
   */
  public static boolean testGoldbach(int bigNum)
  {
    for (int n = 6; n <= bigNum; n += 2)  // obviously true for n = 4
    {
      boolean found2primes = false;

      for (int p = 3; p <= n/2; p += 2)
      {
        if (isPrime(p) && isPrime(n - p))
          found2primes = true;
      }

      if (!found2primes)
      {
        System.out.println(n + " is not a sum of two primes!");
        return false;
      }
    }

    return true;
  }
  
  public static boolean isPerfect(int n)
  {
   
   
   //check if even, if not -> false
   if (n % 2 == 1) return false;
   
   //Make a loop that finds factors and adds them to a running sum. If sum = n -> return true
   int sum = 1; //Since n is even, 1 and 2 are both factors -> 1 + 2 = 3
   for (int i = 2; i*i < n; i++)
   {
      //Check if i is a factor of n -> if so add both  and n/i to your sum
      if (n % i == 0) 
      {
         sum =  i + (n/i) + sum;
      }
      
   }
   if (sum == n) return true;
   return false;
  }
  
  public static void findFirstNPerfect(int n)
  {
   int count = 0;
   int num = 2;
   while (count < n)
   {
      if (isPerfect(num))
      {
         count++;
         System.out.print(num + ", ");
      }
      num++;
   }
  }

  /*********************************************************************/

  public static void main(String[] args)
  {
    /*Scanner kb = new Scanner(System.in);
    int n;

    do
    {
      System.out.print("Enter an integer from 4 to 20: ");
      n = kb.nextInt();
    } while (n < 4 || n > 20);

    kb.close();

    System.out.println();
    System.out.println("1 + ... + " + n + " = " + sumUpTo(n));
    System.out.println(n + "! = " + factorial(n));
    System.out.println("Primes: ");
    for (int k = 1; k <= n; k++)
      if (isPrime(k))
        System.out.print(k + " ");
    System.out.println();
    System.out.println("Goldbach conjecture up to " + n + ": " + testGoldbach(n));*/
  findFirstNPerfect(4);
  }
}

