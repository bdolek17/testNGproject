package techproed.tests.smoketest.logintests;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Day18_NegativeLoginTest {
    /*
    Name:
    Login screen error messages
    Description:
    User should see error message when user tries to login with incorrect credentials
    Acceptance Criteria:
    As admin or customer, I should be able to see error message,
    when I provide a correct email address BUT incorrect password in a pop up window
    Error Message: Bad credentials
     */
    HomePage homePage;
    LoginPage loginPage;
    @Test
    public void test() {
        //going to blue rental car home page
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        homePage = new HomePage();
        loginPage = new LoginPage();

        homePage.homePageLoginLink.click();
        ReusableMethods.waitFor(3);
        loginPage.userName.sendKeys("jack@gmail.com");
        ReusableMethods.waitFor(3);
        loginPage.password.sendKeys("1234");
        ReusableMethods.waitFor(3);
        loginPage.loginButton.click();
        ReusableMethods.waitFor(3);
        //verify login is unsuccessful
        ReusableMethods.verifyElementDisplayed(loginPage.alertMessage);
        ReusableMethods.waitFor(3);
    }
        @Test
        public void test2(){

        /*
        Name:
        Login screen error messages
        Description:
        User should see error message when an invalid email is entered
        Acceptance Criteria:
        As admin or customer, I should be able to see error message, when I do not provide a complete valid email address in email address box
        Error Message: email must be a valid email
        When I enter a valid email domain, then I should not see the error message
        https://email-verify.my-addr.com/list-of-most-popular-email-domains.php
         */
            Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
            homePage=new HomePage();
            loginPage=new LoginPage();


            homePage.homePageLoginLink.click();
            loginPage.userName.sendKeys("jac");
            loginPage.password.sendKeys("12345");
            loginPage.loginButton.click();
            ReusableMethods.verifyElementDisplayed(loginPage.errorMessage);
            ReusableMethods.waitFor(3);
            loginPage.userName.sendKeys("k@gmail.com");
            loginPage.loginButton.click();
            ReusableMethods.verifyElementDisplayed(homePage.userID);





        }


    }
