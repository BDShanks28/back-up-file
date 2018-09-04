public class Taco
{
   int numToppings;
   double price;
   boolean hasHardShell;
   String name;
   
   public Taco()
   {
      numToppings = 20;
      price = 600.00;
      hasHardShell = true;
      name = "Supreme Grande Taco Supreme";
   }
   
   public Taco(int numToppings, double price, boolean hasHardShell, String name)
   {
      this.numToppings = numToppings;
      this.price = price;
      this.hasHardShell = hasHardShell;
      this.name = name;
   }
   
   public String toString()
   {
      String result = "";
      result += "This is a " + name + ". It has " + numToppings + " toppings.";
      
      if (hasHardShell)
      {
         result += " It is a hard taco.";
      }
      else
      {
         result += " It is a soft taco.";
      }
      
      result += " It cost $" + price;
      return result;
   }
}