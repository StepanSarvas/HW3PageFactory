package HW3PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeadphonesPage extends DefaultPage{

    @FindBy(xpath = "//a[contains(@class, 'filter-link') and contains(@href, 'naushniki/proizvoditel--marshall')]")
    WebElement showOnlyMarshall;

    public void clickOnMarshallBrandButton(){
        showOnlyMarshall.click();
    }

    public HeadphonesPage(WebDriver driver){
        super (driver);
    }
}
