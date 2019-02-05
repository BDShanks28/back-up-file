import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry>
{

   /**
   * adds num to the IndexEntry for word by calling that
   * IndexEntry's add(num) method. if word is not yet in this
   * DocumentIndex, make a new IndexEntry for word
   * @param wor Word to be added
   * @param num current line number
   */      
   public void addWord(String word, int num)
   {
      for(int i = 0; i < this.size(); i++)
      {
         if(word.compareTo(this.get(i).getWord()) == 0)
         {
            
            
            return;
         }
         else if(word.conmpareTo(this.get(i).getWord()) > 0)
         {
            
            
            
            return;
         }
      }
   }
   
   public void addAllWords(String word, int num)
   {
      String[] split = word.split("\\W+");
      for(int i = 0; i < split.length; i++)
      {
         
      }
   }

   
   private int foundOrInserted(int num)
   {
      
   }

}