package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.Amazon;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Practice_Amazon {
    /*
    When user goes to https://jqueryui.com/accordion/
    And user clicks on Section2 accordion
    Verify the text contains “Sed non urna.”
    */
@Test
    public void test(){
    Driver.getDriver().get(ConfigReader.getProperty("amazon"));

    Amazon amazon1= new Amazon();
    amazon1.section.click();
    String textContain=amazon1.text.getText();
    String real="Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit amet purus. Vivamus hendrerit, dolor at aliquet laoreet, mauris turpis porttitor velit, faucibus interdum tellus libero ac justo. Vivamus non quam. In suscipit faucibus urna.";

    Assert.assertEquals(textContain,real);
}

}
