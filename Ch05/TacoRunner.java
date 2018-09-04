public class TacoRunner
{
   public static void main(String[] args)
   {
      Taco myTaco = new Taco();
      System.out.println(myTaco);
      Taco tacoSupremo = new Taco(7, 7.99, false, "Taco Supremo");
      System.out.println(tacoSupremo);
   }
}