public class LipogramAnalyzer
{
   private String text;
   
   /*
   *  Saves the STring text to the fieled text
   */
   
   public LipogramAnalyzer(String text)
   {
      this.text = text;
   }
   
   /**
   * retrns saved text String withh all characters
   * equal to a specified letter replaced with a pound sign (#)
   */
   
   public String mark(char letter)
   {
      return text.replace(letter, '#');
   }
   
    /**
   * Returns a string that concatenates all "offending" words from the text
   * that contained the specific letter; the words are joined by the '\n' character.
   * Do not duplicate words - offending words should onnly appear once in the list.
   */
   
   public String allWordsWith(char letter)
   {
      String result = "";
      
      
      
      return (" ");
   }
   
   
   private int findSpace(int location)
   {
      while(location > 0)
      {
         locatin--;
         if (Character.isWhitespace(text.charAt(location)))
         {
            location++;
            return location;
         }
      }
      return 0;
   }
}