package AssertionTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
    
    @Test
    public void testSoftAssertions() {
        SoftAssert softAssert = new SoftAssert();

        String expectedVal = "Arpit Choubey";
        String actualval = "Arpit Choubey";
        softAssert.assertEquals(actualval, expectedVal, "Values do not match");

        String expectedV2 = "TesTNGG";
        String actualv2 = "TesTNG";
        System.out.println("Assertion Not Equal Demo");
        softAssert.assertNotEquals(actualv2, expectedV2, "Values should not match");

        System.out.println("After Assertion");

        String actual3 = null;
        softAssert.assertNull(actual3, "Value should be null");
        System.out.println("After Assertion Test 23");
        