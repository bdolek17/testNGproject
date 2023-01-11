package techproed.tests;

import org.testng.annotations.Test;
import techproed.pages.DataPickerPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class DataPicker {
    /*// When user goes to https://jqueryui.com/datepicker/
        driver.get("https://jqueryui.com/datepicker/");

       // And select the next date of the current date

     */

    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("data_picker"));
        DataPickerPage dataPickerPage = new DataPickerPage();
        dataPickerPage.date.click();
        dataPickerPage.date.sendKeys("01/10/2023");

    }
}
