package HW3PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AudioDevicesPage extends DefaultPage{

    @FindBy(xpath = "//img[contains(@alt, 'Навушники')]")
    private WebElement headphonesButton;

    public void clickOnHeadphonesButton(){
        headphonesButton.click();
    }

    public AudioDevicesPage (WebDriver driver){
        super (driver);
    }
}
