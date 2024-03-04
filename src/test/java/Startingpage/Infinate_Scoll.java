package Startingpage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Infinate_Scoll {
    WebDriver driver;
    public Infinate_Scoll(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText="Infinite Scroll")
    private WebElement scrollClick;



    public void getLink(){
        scrollClick.click();

    }

    public void PerformAction() {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000000)","");
    }

}
