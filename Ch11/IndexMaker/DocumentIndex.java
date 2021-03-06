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
      int pos = foundOrInserted(word);
      if(this.size() > 0 && pos < this.size() && word.toLowerCase().equals(this.get(pos).getWord()))
      {
         get(pos).add(num);
      }
      else
      {
         IndexEntry newEntry = new IndexEntry(word);
         newEntry.add(num);
         this.add(newEntry);
      }
   }
   
   public void addAllWords(String str, int num)
   {
      String[] words = str.split("\\W+");
      for(String word : words )
      {
         addWord(word, num);
      }
   }

   
   private int foundOrInserted(String word)
   {
      int pos = 0;
      while(this.size() > 0 && pos < this.size() && word.toLowerCase().compareTo(this.get(pos).getWord()) < 0)
      {
          pos++;
      }
      return pos;
   }
}
