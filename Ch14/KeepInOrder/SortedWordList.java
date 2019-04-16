import java.util.ArrayList;

public class SortedWordList extends ArrayList<String>
{
	public SortedWordList()
	{
		super();
	}

	public SortedWordList(int x)
	{
		super(x);
	}

	@Override
	public boolean add(String str)
	{
		if(this.contains(str))
		{
			return false;
		}
		else
		{
			for(int i = 0; i < this.size(); i++)
			{
				if(word.comparToIgnoreCase(this.get(i)) < 0)
				{
					super.add(i, str);
					return true;
				}
			}
			super.add(str);
			return true;
		}
	}


	@Override
	public void add(


	@Override
	public boolean contains((Object str)
	{
		int temp = binarySearch(this, String(str));
		if( temp >= 0) return true;
		else return false;
	}


	@Override
	public int indexOf(Object str)
	{
		return binarySearch(this, String(str));
	}


	private static int binarySearch(ArrayList<String> a, String target)
	{
        	int left = 0, right = a.size() - 1;
        	while (left <= right)
        	{
            		int middle = (left + right) / 2;
            		int diff = target.compareTo(a.get(middle));
            		if (diff < 0) right = middle - 1;
            		else if (diff > 0) left = middle + 1;
            		else return middle;
        	}
        	return -1;
    	}
}
