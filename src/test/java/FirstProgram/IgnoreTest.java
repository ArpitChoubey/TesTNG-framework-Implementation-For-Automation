package FirstProgram;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	@Ignore
	@Test
	  public void TestMethod_1() {
		  System.out.println("This is a Test Method 1");
	  }
	  
	  
	  @Test(enabled= false)
	  public void TestMethod_12() {
		  System.out.println("This is a Test Method 21");
	  }
		  
		  @Test
		  public void TestMethod_19() {
			  System.out.println("This is a Test Method 2991");

}
}
