public class Fraction
{
   private int num;
   private int denum;
   
   public Fraction()
   {
      num = 0;
      denum = 1;
   }
   
   public Fraction(int num)
   {
      this.num = num;
      this.denum = 1;
   }
   
   public Fraction(int num, int denum)
   {
      this.num = num;
      this.denum = denum;
   }
}