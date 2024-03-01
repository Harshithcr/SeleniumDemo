package Startingpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDrop {
    WebDriver driver;
    public DragAndDrop(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Drag and Drop")
    private WebElement Draganddrop;

    @FindBy(css = "#column-a")
    private WebElement source;

    @FindBy(css = "#column-b")
    private WebElement destination;


    public void getdragAndDropLink(){

        Draganddrop.click();
    }

    public void getDADopp() throws InterruptedException{
        Actions act = new Actions(driver);
        act.dragAndDrop(source, destination).build().perform();
        Thread.sleep(3000);
    }

}
