package Startingpage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExitIntent {
    WebDriver driver;
    public ExitIntent(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Exit Intent']")
    private WebElement exitlink;

    public void getexitlink(){
        exitlink.click();
    }

    public void getExitIntent(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Execute JavaScript to move the mouse outside the viewport
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        /*Actions a = new Actions(driver);
        a.moveToElement(element)*/
    }

}
