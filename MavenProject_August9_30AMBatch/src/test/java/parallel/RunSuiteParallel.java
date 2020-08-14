package parallel;

import java.util.Arrays;

import org.testng.TestNG;

public class RunSuiteParallel 
{

	public static void main(String[] args)
	{
		/*
		 * String[] s = new String[10]; s[0]="ravi"; s[1]="lella";
		 * 
		 * String[] s2 =new String[] {"ravi","lella"};
		 * 
		 * String[] s1 = {"ravi","lella"};
		 */
		
		
		TestNG t = new TestNG();
		t.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"//megasuite.xml"}));
		t.setSuiteThreadPoolSize(2);
		t.run();
	}

}
