public class RightTriangle extends Triangle
{

//Creates a right isoscoles triangle
//@param side length of legs of right triangle

	public RightTriangle(double side)
	{
		super(side); //Calls Triangle side
	}

	@Override
	public double getArea()
	{
		return (getSide()*2.0)*0.5;
	}

	@Override
	public double getPerimeter()
	{
		return (getSide()*2.0)+(Math.sqrt((getSide()*2.0)+(getSide()*2.0)));
	}
}
