package Startingpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Advertisement {

    WebDriver driver;

    public Advertisement(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[text()='Entry Ad']")
    private WebElement ad;

    @FindBy(xpath = "//p[text()='Close']")
    private WebElement close;

    public void getad(){
        ad.click();
    }

    public void getclosead(){
        close.click();
    }

}
