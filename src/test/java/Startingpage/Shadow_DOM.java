package Startingpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Shadow_DOM {
   WebDriver driver;
    public Shadow_DOM(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText="Shadow DOM")
    private WebElement Click;

    @FindBy(xpath="//li[text()=\"Let's have some different text!\"]")
    private WebElement text;

    public void getLink(){
        Click.click();

    }

    public void PerformAction() {
        String exp="Let's have some different text!";
        String res=text.getText();
        Assert.assertEquals(res, exp);

    }

}

