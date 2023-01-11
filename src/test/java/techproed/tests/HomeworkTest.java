package techproed.tests;

import com.github.dockerjava.api.model.Frame;
import org.testng.annotations.Test;
import techproed.pages.DataPickerPage;
import techproed.pages.Homework;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class HomeworkTest {

    @Test
    public void test() {
        Homework homework = new Homework();
        Driver.getDriver().get(ConfigReader.getProperty("url_homework"));

        homework.username.sendKeys("techproed");
        homework.psw.sendKeys("SuperSecretPassword");
        homework.submitButton.click();
    }

    @Test
    public void test1() {
        Driver.getDriver().get(ConfigReader.getProperty("data_picker"));
        DataPickerPage dataPickerPage = new DataPickerPage();
        dataPickerPage.date.click();
        dataPickerPage.date.sendKeys("01/10/2023");
    }
}
