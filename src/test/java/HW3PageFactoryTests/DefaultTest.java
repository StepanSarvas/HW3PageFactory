package HW3PageFactoryTests;

import HW3PageFactory.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class DefaultTest {

    private WebDriver driver;
    private static final String AVIC_URL = "https://avic.ua/";

    @BeforeTest
    public void profileSettings(){
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSettings(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }

    @AfterMethod
    public  void tearDown(){
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public StartPage getStartPage(){
        return new StartPage(getDriver());
    }

    public AudioDevicesPage getAudioDevicesPage(){
        return new AudioDevicesPage(getDriver());
    }

    public HeadphonesPage getHeadphonesPage(){
        return new HeadphonesPage(getDriver());
    }

    public MarshallHeadphonesPage getMarshallHeadphonesPage(){
        return new MarshallHeadphonesPage(getDriver());
    }

    public SearchResultPage getSearchResultPage(){
        return new SearchResultPage(getDriver());
    }
}
