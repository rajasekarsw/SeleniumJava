package Base;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

public class BaseClass {
public static WebDriver driver;

   static public Properties properties=new Properties();

   static public ExtentReports extentReports=null;

   static public ExtentTest extentTest;
     @BeforeSuite
     public void initialize() throws IOException {
        String propFilePath=System.getProperty("user.dir")+"/src/test/resources/config.properties";
        properties.load(new FileInputStream(new File(propFilePath)));

        extentReports=new ExtentReports();
         ExtentSparkReporter reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/currentreports.html");
        extentReports.attachReporter(reporter);
     }

    public static WebDriver getDriver()
    {


        if (driver==null) {
            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.manage().window().maximize();
            return driver;
        }
        else {
            return driver;
        }
    }

    @AfterSuite
    public void tearDown()
    {
        extentReports.flush();
        driver.close();
    }
}
