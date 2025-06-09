import java.util.*;
class CubeData
{
	private double l,b,h;
	public CubeData()//default constructor
	{
		l=0;b=0;h=0;
	}
	public CubeData(double l, double b, double h)//parameterized constructor
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public CubeData(CubeData x)//Copy constructor
	{
		l=x.l;
		b=x.b;
		h=x.h;
	}
	public void inputData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of a cube: ");
		l=sc.nextDouble();
		System.out.println("Enter breadth of a cube: ");
		b=sc.nextDouble();
		System.out.println("Enter heigth of a cube: ");
		h=sc.nextDouble();
	}
	public void displayArea()
	{
		double Area;
		Area=l*b*h;
		System.out.println("Area of a cube= "+Area);
	}
	public void displayVolume()
	{
		double Volume;
		Volume=2*(l*b+b*h+l*h);
		System.out.println("Volume of a cube= "+Volume);
	}
}//end of data class

class CubeMain
{
	public static void main(String args[])
	{
		CubeData c1=new CubeData(12.1,3.2,5.5);
		CubeData c2=new CubeData();
		CubeData c3=new CubeData(c1);
		CubeData c4=new CubeData();
		c1.displayArea();
		c1.displayVolume();
		c2.displayArea();
		c2.displayVolume();
		c3.displayArea();
		c3.displayVolume();
		c4.inputData();
		c4.displayArea();
		c4.displayVolume();
	}
}