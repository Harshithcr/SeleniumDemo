package Startingpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicContent {
    WebDriver driver;

    public DynamicContent(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Dynamic Content")
    private WebElement Dynamiccontent;

    @FindBy(linkText = "click here")
    private WebElement Click;

    public void getDynamicContent(){
        Dynamiccontent.click();
    }

    public void getClick(){
        Click.click();
    }
}
