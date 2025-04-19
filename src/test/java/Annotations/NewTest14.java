package Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest14 {
  @Test
  public void f() {
	  System.out.println("This is a Test Method 1");
  }
  
  @Test
  public void k() {
	  System.out.println("This is a Test Meth");
  }
  
  @Test
  public void fu() {
	  System.out.println("This is a Test Methods");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is a TMethod ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is a Test Metho");
	  
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is a Test Method 133");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is a Test Method 144");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is a Test Method 133");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is a Test Method 1");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is a Test Meth");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is a Test Meths");
  }

}
