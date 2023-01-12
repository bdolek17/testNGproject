package techproed.tests;

import org.testng.annotations.Test;
import techproed.pages.Homework;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class HomeworkTest {

    @Test
    public void test(){
        Homework homework= new Homework();
        Driver.getDriver().get(ConfigReader.getProperty("url_homework"));
        homework.username.sendKeys("techproed");
        homework.psw.sendKeys("SuperSecretPassword");
        homework.submitButton.click();
    }
}