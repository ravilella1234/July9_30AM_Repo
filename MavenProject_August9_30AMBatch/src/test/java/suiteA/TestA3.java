package suiteA;

import org.testng.annotations.Test;

public class TestA3 
{
  @Test
  public void f() throws Exception 
  {
	  System.out.println("Starting TestA3");
	  
	  Thread.sleep(2000);
	  
	  System.out.println("Ending TestA3");
  }
}
