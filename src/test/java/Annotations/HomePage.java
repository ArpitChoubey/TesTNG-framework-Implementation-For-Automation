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

public class HomePage {
  @Test
  public void f() {
	  System.out.println("Home Page - Open ");
  }
  @Test
  public void kk() {
	  System.out.println("Home Page - Open Test Form ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Home Before Method ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Home After Method ");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Home Before Class ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Home After Class ");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test 4565");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test 123 ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite 66");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite 88 ");
  }

}
