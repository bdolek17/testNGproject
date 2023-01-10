package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class Homework {
    public Homework() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "exampleInputEmail1")
    public WebElement username;
    @FindBy(xpath = "//input[@id='exampleInputPassword1']")
    public WebElement psw;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;





}
