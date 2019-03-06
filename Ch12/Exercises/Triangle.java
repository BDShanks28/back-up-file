// Chapter 12 Question 6

public class Triangle
{
	private String type;
	private double side;

	public Triangle(double side)
  	{
    		this.side = side;
  	}

        public double getSide()
        {
                return side;
        }

  	public abstract double getPerimeter();

  	public abstract double getArea();

  	public double getRatio()
  	{
    		return getArea()/getPerimeter();
  	}

	@Override
	public String toString()
	{
		return "This trianglr has an area of " +
		    getArea() + " and a perimeter of "+  getPerimeter();
	}
}
