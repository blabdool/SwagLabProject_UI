package stepDef;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
//import org.apache.commons.io.FileUtils;


public class Hook extends BaseUtil
{
    private BaseUtil base;

    public Hook(BaseUtil base)
    {
       this.base = base;
    }
    @Before
    public void initialize()
    {
       WebDriverManager.chromedriver().setup();
       base.driver = new ChromeDriver();
    }
    @After
    public void tearDown() throws InterruptedException, IOException {
    takeScreenShot(); //Add taking screenshots later
    Thread.sleep(3000);
    base.driver.close();
    base.driver.quit();
    }

    private void takeScreenShot() throws IOException {
        TakesScreenshot screenShot = ((TakesScreenshot)base.driver);
        File SrcFile=screenShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile, new File("target/my-screenshots/SS" + System.currentTimeMillis() + ".png"));

    }
}
