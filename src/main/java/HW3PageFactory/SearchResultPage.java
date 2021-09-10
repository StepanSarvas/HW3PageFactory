package HW3PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends DefaultPage{

    @FindBy(xpath = "//a[contains(@class, 'btn-see-more js_show_more')]")
    WebElement showMoreResultsButton;

    @FindBy(xpath = "//div[contains(@data-product, '128354')]")
    WebElement appearNewItemForCheck;

    @FindBy(xpath = "//div[contains(@class, 'item-prod')]")
    private List<WebElement> itemsOnThePageList;

    public void ClickOnSHowMoreResults(){
       showMoreResultsButton.click();
    }

    public SearchResultPage(WebDriver driver){
        super(driver);
    }

    public List<WebElement> getItemsList(){
        return itemsOnThePageList;
    }

    public int getNumberOfResults(){
        return getItemsList().size();
    }

    public WebElement getAppearNewItemForCheck(){
        return appearNewItemForCheck;
    }


}
