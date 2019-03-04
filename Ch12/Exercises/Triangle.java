// Chapter 12 Question 6

public class Triangle
{
	private String type;
	private double side;

	public Triangle(, double side)
  	{
    		this.side = side;
  	}

  	public double getPerimeter();

  	public abstract double getArea();

  	public double getRatio()
  	{
    		return getArea()/getPerimeter();
  	}
}
