package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Amazon {
    public Amazon(){
        PageFactory.initElements(Driver.getDriver(),this);
        Driver.iFrame();
    }
    @FindBy(id = "ui-id-3")
    public WebElement  section;
    @FindBy(xpath = "//*[@id='ui-id-4']")
    public WebElement text;


}
