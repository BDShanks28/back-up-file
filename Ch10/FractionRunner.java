public class FractionRunner
{
   public static void main(String[] args)
   {
      Fraction a = new Fraction(4,8);
      System.out.println(a);
      
      Fraction b = new Fraction(5);
      System.out.println(b);
      
      Fraction c = new Fraction();
      System.out.println(c);
      
      Fraction d = new Fraction(b);
      System.out.println(d);
         
      Fraction e=a.add(a);
      System.out.println(e);
   }
}