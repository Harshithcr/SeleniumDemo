package testpacakge;

import Startingpage.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class Operations {
    WebDriver driver;
    @BeforeTest
    public void init() {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://the-internet.herokuapp.com/");
    }

    @Test(priority = 1)
    public void addanddelete() throws InterruptedException {
        AddandDelete ad =new AddandDelete(driver);
        ad.getaddordel();
        Thread.sleep(2000);

        ad.getadd();
        ad.getdel();
    }

    @Test(priority = 2)
    public void checkboxes() throws InterruptedException {
        driver.navigate().back();
        checkbox ck= new checkbox(driver);
        ck.getCheckBox();
        Thread.sleep(2000);
        ck.getChk1();
        ck.getChk2();
    }

    @Test(priority = 3)
    public void conText() throws InterruptedException {
        //driver.navigate().back();

        ContextMenu cm = new ContextMenu(driver);
        cm.getContextMenu();
        Thread.sleep(2000);
        cm.getBox();
       
    }

    @Test(priority = 4)
    public void DragAndDropopp() throws InterruptedException {

        DragAndDrop dd=new DragAndDrop(driver);
        dd.getdragAndDropLink();
        Thread.sleep(2000);
        dd.getDADopp();
    }


    @Test(priority = 5)
    public void DropDownOpp() throws InterruptedException {
        //driver.navigate().back();
        DropDown d=new DropDown(driver);
        d.getDropdownLink();
        Thread.sleep(2000);
        d.getDDopp();

    }

    @Test(priority = 6)
    public void DynamicCon() throws InterruptedException {
        //driver.navigate().back();
        DynamicContent dc= new DynamicContent(driver);
        dc.getDynamicContent();
        Thread.sleep(2000);
        dc.getClick();
    }

    @Test(priority = 7)
    public void DynamicControls() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/");
        DynamicControls dc =new DynamicControls(driver);
        dc.getDynamicControls();
        dc.getAddadnRemove();
        Thread.sleep(1000);
        dc.getEnableorDisable();

    }

    @Test(priority = 8)
    public void Download() throws InterruptedException {
        FileDownload fd = new FileDownload(driver);
        Thread.sleep(2000);
        fd.getdwnlink();
        fd.getdwn();

    }

    @Test(priority = 9)
    public void Upload() throws InterruptedException {
        FileUpload fu = new FileUpload(driver);
        Thread.sleep(2000);
        fu.getUploadlink();
        fu.getchfile();
        fu.getUpload();
    }

    @Test(priority = 10)
    public void FloatingWindow() throws InterruptedException {
        FloatingMenu fm = new FloatingMenu(driver);

        fm.getMenu();
        Thread.sleep(2000);
        fm.getFloating();
    }

    @Test (priority = 11)
    public void Advertisement() throws InterruptedException {
        Advertisement a=new Advertisement(driver);
        a.getad();
        Thread.sleep(2000);
        a.getclosead();
    }

    @Test (priority = 12)
    public void exitIntent(){
        ExitIntent ei = new ExitIntent(driver);
        ei.getexitlink();
        ei.getExitIntent();

    }




}
