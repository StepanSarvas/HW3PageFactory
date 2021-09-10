package HW3PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarshallHeadphonesPage extends DefaultPage{

    @FindBy(xpath = "//a[contains(@data-ecomm-cart, 'Marshall Major IV Black')]")
    WebElement buyMarshallHeadphonesButton;

    @FindBy(xpath = "//span[contains(@class, 'count--plus ')]")
    WebElement plusItemButton;

    @FindBy(xpath = "//div[contains(@class, 'item-total')]/span [contains(@class , 'prise')]")
    WebElement priseOfItem;

    public void clickOnBuyMarshallButton(){
        buyMarshallHeadphonesButton.click();
    }

    public void clickPlusItemButton(){
        plusItemButton.click();
    }

    public String getPriseOfItem(){
        return priseOfItem.getText();
    }

    public WebElement getPlusItemButton(){
        return plusItemButton;
    }

    public MarshallHeadphonesPage(WebDriver driver){
        super(driver);
    }
}
