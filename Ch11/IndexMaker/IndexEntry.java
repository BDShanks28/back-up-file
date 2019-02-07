import java.util.ArrayList;

public class IndexEntry
{
   private String word;
   private ArrayList<Integer> numList;
   
   public IndexEntry(String word)
   {
    this.word = word;
    numList = new ArrayList<Integer>();
   }
   
   public void add(int num)
   {
     numList.add(num);
   }
   
   public String getWord()
   {
      return word;
   }
   
   @Override
   public String toString()
   {
      return this.word + " " + for(int i = 0; i < numlist.length; i++)
      {
         int num = 0;
         return num++;
      }
   }
}
