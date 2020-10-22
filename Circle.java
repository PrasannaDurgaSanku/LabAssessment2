public class Circle
{
	private int radius;
	private string color="red";
	
	public Circle(){}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return math.PI*radius*2;
	}
	public String toString()
	{
		return "circle["radius"+radius]";
	}
}
public class CircleTester
{
	Public static void main(String args[])
	{
		Circle circle=new Circle(4);
		System.out.println("Area of circle:"+getArea)
	}
}