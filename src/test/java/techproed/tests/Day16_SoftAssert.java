package techproed.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Day16_SoftAssert {
    @Test
    public void softAssertTest(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Line 11 Code");
        softAssert.assertEquals(3,5);
        System.out.println("Line 13 Code");
        softAssert.assertAll();
    }
}
//Don't forget to use "softAssert.assertAll();". if we don't use it, we will see only happy scenario on the console.
//We are not able to see actual result. That's why, use "softAssert.assertAll(); whenever you use softAssertion.
//check requirements ==> verification
//check expected and actual match==>validation