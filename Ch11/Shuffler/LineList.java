import java.util.ArrayList;
import java.util.Random;

public class LineList
{
   //field
   private ArrayList<String> lines;
   private Random rand;
   
   //constructor
   
   public LineList()
   {
      lines = new ArrayList<String>();
      rand = new Random();
   }
   //set n to the size of list
   //randomly select an element among the first n
   //decrement n by one
   //repeat steps 2-3 while in >= 2
   public void shuffle()
   {
      int n = lines.size();
      while(n >= 2)
      {
         int r = rand.nextInt(n-1);
         String temp = lines.get(n-1);
         lines.set(n-1, lines.get(r));
         lines.set(r, temp);
         n--;
      }
   }
   
   //methods
   public int size()
   {
      return lines.size();
   }
   
   public String get(int k)
   {
      return lines.get(k);
   }
   
   public void add(String line)
   {
      lines.add(line);
   }
   
   public String remove(int k)
   {
      return lines.set(k, "");
   }
   
   
   public void move(int index, int newIndex)
   {
      String temp = lines.get(index);
      lines.set(index, lines.get(newIndex));
      lines.set(newIndex, temp);
   }
}