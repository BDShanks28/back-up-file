public class VariableTest
{
   public static void main(String[]args)
   {
      VariableTest myTest = new VariableTest();
      int myNumber = (2 + 5) % 2;
      myTest.anotherMethod(myNumber);
      
      
      
   }
   
   public void anotherMethod(int myNumber)
   {
      System.out.println(myNumber);
   }
}