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
			throw new IllegalArrangementException("the word " + str + " is at position " + this.indexOf(str));
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

	public boolean add(String str)
	{
		if(this.contain(str)
		{
			throw
		}
	}
}
