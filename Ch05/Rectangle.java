import java.awt.Color;

public class Rectangle
{
   private double length;
   private double width;
   private Color color;
   
   /**default rect has width = 2.5, length = 5.0
   */
   
   public Rectangle()
   {
      width = 2.5;
      length = 5.0;
      color = Color.RED;
   }
   
   public Rectangle(double length, double width, Color color)
   {
      this.width = width;
      this.length = length;
      this.color = color;
   }
   
   public static void main(String[] args)
   {
      Rectangle a = new Rectangle();
      System.out.println(a);
   }
}