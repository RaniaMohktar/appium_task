import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

public class first_TC {

    @Test
    public void openCalculator() throws Exception {

        // browser stack data
        String USERNAME = "raniamokhtar_ptP7m5";
        String ACCESS_KEY = "e97KqiMg9sncz6nvxBCp";

        URL url = new URL("https://" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub");

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");


        options.setCapability("bstack:options", new HashMap<String, Object>() {{
            put("deviceName", "Google Pixel 7");
            put("osVersion", "13.0");
        }});


        options.setAppPackage("com.android.calculator2");
        options.setAppActivity("com.android.calculator2.Calculator");

        AndroidDriver driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.findElement(AppiumBy.accessibilityId("5")).click();


        driver.quit();
    }
}
