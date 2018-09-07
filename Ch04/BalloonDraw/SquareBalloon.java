import java.awt.Color;
import java.awt.Graphics;

public class SquareBalloon extends Balloon
{
   public SquareBalloon()
   {
      super();
   }
   
   public SquareBalloon(int x, int y, int r, Color c)
   {
      super(x,y,r,c);
   }
   
    
   public void draw(Graphics g, boolean makeItFilled)
   {
      int xCenter = getX();
      int yCenter = getY();
      int radius = getRadius();
      Color color = getColor();
      g.setColor(color);
      if (makeItFilled)
         g.fillRect(xCenter - radius,
                    yCenter - radius, 2*radius, 2*radius);
      else
         g.drawRect(xCenter - radius,
                    yCenter - radius, 2*radius, 2*radius);
   }
}