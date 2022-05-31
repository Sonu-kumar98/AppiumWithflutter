package Excution;

import appium_flutter_driver.FlutterElement;
import finder.FlutterFinder;
import org.testng.annotations.Test;

public class AppiumTestDemo extends TestBase {

   // TestBase b = new TestBase();

    @Test(priority = 1, description = "bhhjhjjjj")
    public void testOne(){
        try{
            System.out.println("sonukumar");
          //  switchContext("FLUTTER");
            FlutterFinder find = new FlutterFinder(driver);
            Thread.sleep(5000);
            FlutterElement email = find.byValueKey("Textemail");
            email.sendKeys("sonukumariimt22@gmail.com");
            FlutterElement pass = find.byValueKey("Textpass");
            pass.sendKeys("Noida@18");
            FlutterElement loginButton = find.byValueKey("ButtonLogin");
            loginButton.click();


        }catch (Exception e){
            e.printStackTrace();
        }



    }


}
