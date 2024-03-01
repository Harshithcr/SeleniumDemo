package Startingpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileDownload {
    WebDriver driver;
    public FileDownload(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//a[text()='File Download']")
    private WebElement dwnlink;

    @FindBy(xpath = "//a[text()='sample.txt']")
    private WebElement dwn;


    public void getdwnlink()
    {

        dwnlink.click();

    }

    public void getdwn()
    {
        dwn.click();
    }
}
