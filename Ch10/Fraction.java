public class Fraction
{
   private int num;
   private int denum;
   
   public Fraction()
   {
      //num = 0;
      //denum = 1;
      this(0,1);
   }
   
   public Fraction(int num)
   {
      //this.num = num;
      //this.denum = 1;
      this(num,1);
   }
   
   public Fraction(int num, int denum)
   {
      this.num = num;
      this.denum = denum;
   }
   
   public Fraction(Fraction other)
   {
      //this.num = other.num;
      //this.denum = other.denum;
      this(other.num,other.denum);
   }
   
   @Override
   public String toString()
   {
      return this.num + "/" + denum;
   }
}