package Excution;

import appium_flutter_driver.FlutterElement;
import bsh.BshClassManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import finder.FlutterFinder;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class TestBase {
    // Author by sonu kumar
    public static AppiumDriver<MobileElement> driver;
    public static String appPath = "H:\\FlutterLoginPage\\build\\app\\outputs\\apk\\debug\\app-debug.apk";

    public String reportDirectory = "reports";
    public String reportFormat = "html";
    public String testName = "Flutter Automation";
    public String udid = "1ab7cc0e";
    public String deviceName = "Redmi";
    DesiredCapabilities flutterCapabilities = new DesiredCapabilities();

    @BeforeClass
    public void setUp() throws MalformedURLException {

        try {
            flutterCapabilities.setCapability("deviceName", deviceName);
            flutterCapabilities.setCapability("platformName", "Android");
//            flutterCapabilities.setCapability("reportDirectory", reportDirectory);
//            flutterCapabilities.setCapability("reportFormat", reportFormat);
            flutterCapabilities.setCapability("testName", testName);
            flutterCapabilities.setCapability("automationName", "Flutter");
//            flutterCapabilities.setCapability("noReset", "true");
//            flutterCapabilities.setCapability("skipUnlock", "true");
            flutterCapabilities.setCapability("udid", udid);
            flutterCapabilities.setCapability("app", appPath);
            System.out.println("kjdjkdskldckl");
            URL url = new URL("http://127.0.0.1:4723/wd/hub ");
            driver = new AppiumDriver<>(url, flutterCapabilities);


          //  driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), flutterCapabilities);
            System.out.println("ttyyyuiiooooooooo");

        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println("print the error message" + e.getMessage());
            System.out.println(e.getStackTrace());
        }
//        File rootFile = new File("");
//        File appFile = new File(rootFile.getAbsoluteFile()+appPath );
//        String appPtah = appFile.getAbsolutePath();
        //BshClassManager classLoader = null;
        // File f = new File("H:\\FlutterLoginPage\\build\\app\\outputs\\flutter-apk\\app.apk");


    }


//    @AfterClass
//    public void tearDown() throws MalformedURLException {
//        driver.quit();
//    }


//    public static void switchContext(String context) {
//        driver.getContext();
//        System.out.println("778890");
//        Set<String> con = driver.getContextHandles();
//        for (String c : con) {
//            if (c.contains(context)) {
//                driver.context(c);
//                break;
//            }
//        }
}



