import java.util.*;

public class ListTest
{
   public static void main(String[] args)
   {
      ArrayList<String> names = new ArrayList<String>();
      names.add("Jake");
      names.add(0, "Tayt");
      System.out.println(names);
      String name1 = names.set(0, "Jaloni");
   }
}