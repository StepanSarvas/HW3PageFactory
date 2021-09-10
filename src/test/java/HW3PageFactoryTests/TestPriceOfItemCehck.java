package HW3PageFactoryTests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class TestPriceOfItemCehck extends DefaultTest{
    private String EXPECTED_PRICE = "7598 грн";

    @Test
    public void checkPriceOfItem(){
        getStartPage().clickOnMenuButton();
        getStartPage().clickOnAudioDevicesButton();
        getAudioDevicesPage().clickOnHeadphonesButton();
        getHeadphonesPage().clickOnMarshallBrandButton();
        getMarshallHeadphonesPage().clickOnBuyMarshallButton();
        getMarshallHeadphonesPage().waitForElementVisibility(10, getMarshallHeadphonesPage().getPlusItemButton());
        getMarshallHeadphonesPage().clickPlusItemButton();
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }                                                   //New price value become available in 3-5 seconds
        assertEquals(getMarshallHeadphonesPage().getPriseOfItem(), EXPECTED_PRICE);
    }
}
