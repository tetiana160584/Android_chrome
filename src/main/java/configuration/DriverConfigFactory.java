package configuration;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverConfigFactory {


    public static RemoteWebDriver setup(DEVICES devices){
        switch (devices){
            case Pixel_4 -> {
                return createPixel4();

            }
            case Pixel_6 -> {return createPixel6();}
        }
        return null;
    }

    private static RemoteWebDriver createPixel6() {
        RemoteWebDriver driver = null;
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability(AndroidMobileCapabilityType.BROWSER_NAME,"Chrome");
        caps.setCapability("appium:chromedriverExecutable","C:\\Users\\Asus\\Drivers\\chrom_103\\chromedriver.exe");
        caps.setCapability("appium:version", "13");//указываем версию Android
        caps.setCapability("appium:platformName", "Android");//Имя OS
        caps.setCapability("appium:deviceName", "emulator-5554");//Сообщаем, что будет использоваться эмулятор
        caps.setCapability("appium:newCommandTimeout", 1800);
        try {
            driver =new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver ;
    }

    private static RemoteWebDriver createPixel4() {
        RemoteWebDriver driver = null;
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability(AndroidMobileCapabilityType.BROWSER_NAME,"Chrome");
        caps.setCapability("appium:chromedriverExecutable","C:\\Users\\Asus\\Drivers\\chrome83\\chromedriver.exe");
        caps.setCapability("appium:version", "11");//указываем версию Android
        caps.setCapability("appium:platformName", "Android");//Имя OS
        caps.setCapability("appium:deviceName", "emulator-5554");//Сообщаем, что будет использоваться эмулятор
        caps.setCapability("appium:newCommandTimeout", 1800);
        try {
            driver =new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver ;
    }

}
