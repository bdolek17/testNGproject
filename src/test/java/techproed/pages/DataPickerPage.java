package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class DataPickerPage {
    public DataPickerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        Driver.iFrame();
    }
    @FindBy(id= "datepicker")
    public WebElement date;


}
