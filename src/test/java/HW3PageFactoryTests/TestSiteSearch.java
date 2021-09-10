package HW3PageFactoryTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestSiteSearch extends DefaultTest{

    private String BRAND_NAME = "Philips";
    private String BRAND_NAME_ALT = "PHILIPS";
    private String PAGE_NAME_CONTAINS = "query=Philips";

    @Test (priority = 1)
    public void checkBrandNameInURL(){
        getStartPage().searchByBrandName(BRAND_NAME);
        assertTrue (getDriver().getCurrentUrl().contains(PAGE_NAME_CONTAINS));
    }

    @Test (priority = 2)
    public void checkGoodsAmountAfterShowMore(){
        getStartPage().searchByBrandName(BRAND_NAME);
        getSearchResultPage().ClickOnSHowMoreResults();
        getSearchResultPage().waitForElementVisibility(15, getSearchResultPage().getAppearNewItemForCheck());
        assertEquals(getSearchResultPage().getNumberOfResults(), 24);
    }

    @Test (priority = 3)
    public void checkThatGoodsContainBrandName(){
        getStartPage().searchByBrandName(BRAND_NAME);
        getSearchResultPage().ClickOnSHowMoreResults();
        getSearchResultPage().waitForElementVisibility(15, getSearchResultPage().getAppearNewItemForCheck());
        for (WebElement webElement : getSearchResultPage().getItemsList()){
            assertTrue(webElement.getText().contains(BRAND_NAME) || webElement.getText().contains(BRAND_NAME_ALT));

        }
    }


}

