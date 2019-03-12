package tests;
import org.junit.Test;
import main.Triangle;
import static org.junit.Assert.*;

public class TriangleTest
{
	
	

	
	@Test
	public void TriangleWhichisrightAngletriangle()
	{
		Triangle triangle=new Triangle(3,4,5);

		assertTrue(triangle.isRight());
	}
	@Test
	public void TriangleWhichisNotrightAngleTriangle()
	{
		Triangle triangle=new Triangle(2,4,5);

		assertFalse(triangle.isRight());
	}
	
	
	@Test
	public void testTriangleIsScalene(){
	
		Triangle triangle= new Triangle(1,4,2);
		assertTrue(triangle.isScalene());
	
	}
	@Test
	public void testTriangleIsNotIsScalene(){
	
		Triangle triangle= new Triangle(1,1,2);
		assertFalse(triangle.isScalene());
	
	}
	
	@Test
	public void testTriangleIsNotIsosceles(){
	
		Triangle triangle= new Triangle(1,4,2);
		assertFalse(triangle.isIsosceles());
	
	}
	@Test
	public void testTriangleIsIsosceles(){
	
		Triangle triangle= new Triangle(1,1,2);
		assertTrue(triangle.isIsosceles());
	
	}

	@Test
	public void testTriangleIsNotEquilateral(){
	
		Triangle triangle= new Triangle(1,4,2);
		assertFalse(triangle.isEquilateral());
	
	}
	@Test
	public void testTriangleIsEquilateral(){
	
		Triangle triangle= new Triangle(1,1,1);
		assertTrue(triangle.isEquilateral());
	
	}
	
	
} 
