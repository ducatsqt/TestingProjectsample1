package Testing;

public class TestSample1 {

	
	String test="pass";
	
	public void test1()
	{
		if(test.contains("pas"))
		{
			System.out.println("test passed");
		}
		else if(test.contains("ss"))
		{
			System.out.println("test failed");
		}
			
	}
}
