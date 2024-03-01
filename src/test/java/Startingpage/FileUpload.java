package Startingpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUpload {
    WebDriver driver;

    public FileUpload(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='File Upload']")
    private WebElement upload;

    @FindBy(id ="file-upload")
    private WebElement chfile;

    @FindBy(id = "file-submit")
    private WebElement upl;

    public void getUploadlink(){
        upload.click();
    }
    public void getchfile(){
        chfile.sendKeys("C:\\Users\\hacr\\Downloads\\cat.webp");
    }

    public void getUpload(){
        upl.click();
    }

}
