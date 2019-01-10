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
      reduce();
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
      
   public Fraction add(Fraction other)
   {
      int newNum = other.denum*this.num + other.num*this.denum;
      int newDenum = this.denum*other.denum;
      return new Fraction(newNum, newDenum);
   }
   
   private void reduce()
   {
      int gcf = ....;
      this.num /= gfc;
      this.denum /= gfc;
   }
   
   private int gcf()
   {
      for(int i = Math.min(num,denum); i > 0; i--)
      {
         if(num%i == 0 && denum%i = 0) return i;
      }
      return 1;
   }
   
}