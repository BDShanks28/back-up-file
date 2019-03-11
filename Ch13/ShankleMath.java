public class ShankleMath
{
	public static int addSquares(int n)
	{
		if(n==0) return 0;
		else return n*n + addSquares(n-1);
	}

	public static void main(String[] args)
	{
	System.out.println(addSquares(5));
	}
}
