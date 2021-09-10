package HW3PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends DefaultPage{
    @FindBy(xpath = "//input[contains(@class, 'search-query')]")
    private WebElement searchLine;

    @FindBy(xpath = "//button[contains(@class, 'button-reset search-btn')]")
    private WebElement startSearch;

    @FindBy(xpath = "//span[text() = 'Каталог товарів']")
    private WebElement menuButton;

    @FindBy(xpath = "//span[text() = 'Аудіо техніка']")
    private WebElement audioDevicesPage;

    public void searchByBrandName(final String keyword){
        searchLine.sendKeys(keyword);
        startSearch.click();
    }

    public void clickOnMenuButton(){
        menuButton.click();
    }

    public void clickOnAudioDevicesButton(){
        audioDevicesPage.click();
    }

    public StartPage (WebDriver driver){
        super (driver);
    }
}
