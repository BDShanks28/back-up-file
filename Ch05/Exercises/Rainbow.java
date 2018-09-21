// Chapter 5 Question 27

// ________________________________________________

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  // Blue
  private Color skyColor;
   
  public Rainbow()
  {
    skyColor = Color.CYAN;
    
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();
    int xCenter = width/2;
    int yCenter = height*3/4;
    int largeRadius = width/4;
    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
    // 
 
    // Declare and initialize the radius of the large semicircle:
    // 

    g.setColor(Color.RED);

    // Draw the large semicircle:
    g.fillArc( xCenter - largeRadius, yCenter - largeRadius, 2*largeRadius, 2*largeRadius, 0,180);

    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
    int smallRadius = height/4;
    int mediumRadius = (int)Math.sqrt(smallRadius * largeRadius);
    g.setColor(Color.GREEN);
    g.fillArc( xCenter - mediumRadius, yCenter - mediumRadius, 2*mediumRadius, 2*mediumRadius, 0,180);
    
    g.setColor(Color.MAGENTA);
    g.fillArc( xCenter - smallRadius, yCenter - smallRadius, 2*smallRadius, 2*smallRadius, 0,180);

    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    // ________________________________________________

    // Draw the sky-color semicircle:
    // ________________________________________________
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
