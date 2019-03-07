public class EquilateralTriangle extends Triangle
{
	public EquilateralTriangle(double side)
        {
                super(side); //Calls Triangle side
        }

        @Override
        public double getArea()
        {
                return (getSide()*0.5)*(Math.sqrt(getSide()))*0.5;
        }

        @Override
        public double getPerimeter()
        {
                return getSide()*3.0;
        }
}
