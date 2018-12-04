public class TestingArrays
{
   public static void main(String[] args)
   {
      int[] testScores = {75,88,92,100,50,64};
      System.out.println(findAverage(testScores));
   }
   
   public static int findAverage(int[] arr)
   {
      int sum = 0;
      for(int i = 0; i < arr.length; i++)
      {
         sum += arr[i];
      }
      return sum/arr.length;
   }
}