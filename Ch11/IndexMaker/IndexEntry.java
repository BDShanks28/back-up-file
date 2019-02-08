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
      String result = word.toUpperCase() + " ";
      for(int i = 0; i < numList.size()-1; i++)
      {
         result += numList.get(i) + ", ";
      }
     return  result += numList.get(numList.size() - 1);
   }
}
