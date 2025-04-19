package Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void TestMethod_1() {
	  System.out.println("This is a Test Method 1");
  }
  @Test
  public void TestMethod_12() {
	  System.out.println("This is a Test Method 21");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This After Method");
  }

}
