package main;

public class Triangle
{
	private int side1;
	private int side2;
	private int side3;
	public Triangle()
	{
	}
	public Triangle(int side1,int side2,int side3)
	{
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public boolean isRight()
	{
		int hypotenus;
		int perpenducular;
		int base;
		if(side1>side2 && side1>side3)
		{
			 hypotenus=side1;
			perpenducular=side2;
			base =side3;
		}
		else if(side2>side3)
		{
			 hypotenus=side2;
			perpenducular=side1;
			base=side3;
		}
		else
		{
			 hypotenus=side3;
			perpenducular=side1;
			base=side2;
		}
		if(hypotenus*hypotenus==perpenducular*perpenducular+base*base)
		{	
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isScalene()
		{
	
		if (side1==side2)
		{

			return false;
		}

		else if(side1==side3)
		{
			return false;	
		}

		else if(side2==side3)
		{
			return false;
		}

		else 
		{

			return true;
		}		
	}
	public boolean isIsosceles()
	{
	
		if (side1==side2 || side1==side3 || side2==side3)
		{
			return true;
		}
		else 
		{
			return false;
		}
			
	}
	public boolean isEquilateral()
	{
	
		if(side1==side2 && side2==side3 &&side3==side1)
		{			
			return true;
		}
		else
		{
			return false;
		}
	}
		
}
