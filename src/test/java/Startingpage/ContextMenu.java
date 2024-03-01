package Startingpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenu {
    WebDriver driver;
    public ContextMenu(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Context Menu")
    private WebElement contextmenu;

    @FindBy(id = "hot-spot")
    private WebElement box;

    public void getContextMenu(){
        contextmenu.click();
    }

    public void getBox(){
        Actions a = new Actions(driver);
        a.contextClick(box).click().build().perform();
        driver.switchTo().alert().accept();
    }

}
