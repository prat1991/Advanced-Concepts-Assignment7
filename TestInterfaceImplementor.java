import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;


public class TestInterfaceImplementor
{
	private InterfaceImplementor<Integer> arrayList ;
	
	
	@Before ////initializing objects that are used across multiple testcases
	public void setUp()
	{ 
		System.out.println("--------Executing Test Startup-----------");
		arrayList = new InterfaceImplementor<Integer>(10);
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void test1()
	{
		System.out.println("TestCase1: Can We See The Added Values In TheA rrayList?");
        arrayList.add(1);
        int expectedSize = 1;
        int actualSize = arrayList.getSize();
        Assert.assertEquals(expectedSize, actualSize);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	
	public void test2()
	{
		System.out.println("TestCase2: Can We Remove Values From  The ArrayList?");
        arrayList.remove(0);
        int expectedSize = 0;
        int actualSize = arrayList.getSize();
        Assert.assertEquals(expectedSize, actualSize);
	}
	@Test
	
	public void test3()
	{
		System.out.println("TestCase3: Can We Legally Add Values To The ArrayList?");
        boolean expectedValue = true;
        boolean actualValue=arrayList.add(1);
        Assert.assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void test4()
	{
		System.out.println("TestCase4: Can We Get Vales At A Particular Index?");
        arrayList.add(1);
        int expectedValue=1;
		int actualValue=arrayList.get(0);
        Assert.assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void test5()
	{
		System.out.println("TestCase5: Can We Udpate Values At A Particular Index?");
        arrayList.add(0,100);
        int expectedValue=100;
		int actualValue=arrayList.get(0);
        Assert.assertEquals(expectedValue, actualValue);
	}
	
	@After  // freeing up memory
	public void tearDown()
	{
		System.out.println("--------Executing Test Shutdown-----------");
		arrayList = null; 
	}
}
