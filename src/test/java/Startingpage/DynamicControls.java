package Startingpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.w3c.dom.html.HTMLImageElement;

import java.time.Duration;

public class DynamicControls {

    WebDriver driver;

    public DynamicControls(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Dynamic Controls")
    private WebElement DynamaicCon;

    @FindBy(css = "input[label='blah']")
    private WebElement ch;

    @FindBy(xpath="//button[text()='Remove']")
    private WebElement remove;

    @FindBy(xpath = "//button[text()='Add']")
    private WebElement add;

    @FindBy(id = "checkbox")
    private WebElement check;

    @FindBy(xpath = "//button[text()='Enable']")
    private WebElement enable;

    @FindBy(xpath = "//button[text()='Disable']")
    private WebElement disable;

    @FindBy(css = "input[type='text']")
    private WebElement text;

    public void getDynamicControls(){
        DynamaicCon.click();
    }

    public void getAddadnRemove() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        ch.click();
        remove.click();

        String addmessage=driver.findElement(By.id("message")).getText();
        Assert.assertEquals(addmessage,"It's gone!");
        add.click();
        String remmessage=driver.findElement(By.id("message")).getText();
        Assert.assertEquals(remmessage,"It's back!");
        check.click();
        remove.click();
        Thread.sleep(1000);
    }

    public void getEnableorDisable() throws InterruptedException {

        enable.click();
        Thread.sleep(4000);
        text.sendKeys("Hello");
        disable.click();
    }


}
