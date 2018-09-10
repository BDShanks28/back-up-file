import java.awt.Color;
import java.awt.Graphics;

public class OvalBalloon extends Balloon
{
   public OvalBalloon()
   {
      super();
   }
   
   public OvalBalloon(int x, int y, int r, Color c)
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
         g.fillOval(xCenter - radius/2,
                    yCenter - radius, radius, 2*radius);
      else
         g.drawOval(xCenter - radius/2,
                    yCenter - radius, radius, 2*radius);
   }

   @Override
   public double distance(int x, int y)
   {
      int xCenter = getX();
      int yCenter = getY();
      
      double dx = x - xCenter;
      dx*=2;
      
      double dy = y - yCenter;
      dy*=2;
      
      return Math.sqrt(dx*dx + dy*dy);
   }
}