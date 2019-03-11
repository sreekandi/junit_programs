package tests;
import org.junit.Test;
import main.Greater;
import static org.junit.Assert.*;
public class GreeterTest
{
	@Test
	public void testGreet()
	{
		assertEquals("hello",new Greater().great());
		
	}
}