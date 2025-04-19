package AssertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardTest {
	
	@Test
	public void WebAppTest() {
		
		String expectedValue = "Arpit Choubey";
		String actualvalue = "Arpit Choubey";
		
		System.out.println(" Assertion Demo");
		Assert.assertEquals(actualvalue,expectedValue);
		System.out.println(" After Assertion");
		
		String expectedV2 = "TesTNGG";
		String actualv2 = "TesTNG";
		
		System.out.println(" Assertion Not Equal Demo");
		Assert.assertNotEquals(actualv2, expectedV2);
		System.out.println(" After Assertion Test");
		
		String actual3= null;
		Assert.assertNull(actual3);
		System.out.println(" After Assertion Test 23");
		
		String actual4= "Organize";
		Assert.assertNotNull(actual4);
		System.out.println(" After Assertion Test 213");
	}
	
	
	
}
