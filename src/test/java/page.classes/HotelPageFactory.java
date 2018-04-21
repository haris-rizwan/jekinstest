package page.classes;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPageFactory {

    WebDriver driver;

    @FindBy(name = "destination")
    WebElement Destination;

    @FindBy(id = "hotel-checkin-hp-hotel")
    WebElement checkIn;

    @FindBy(id = "hotel-checkout-hp-hotel")
    WebElement checkOut;

    @FindBy(className = "gcw-storeable gcw-guests-field gcw-guests-field-total-travelers")
    WebElement guests;

    @FindBy(className = "col search-btn-col")
    WebElement searchBtn;

    @FindBy(id = "hotel-rooms-hp-hotel")
    WebElement rooms;

    @FindBy(id = "hotel-1-adults-hp-hotel")
    WebElement adults;

    @FindBy(id = "hotel-1-children-hp-hotel")
     WebElement children;


    @FindBy(id = "hotel-1-age-select-1-hp-hotel")
    WebElement age;

    @FindBy(className = "check col gcw-hotel-add-flight")
    WebElement addFlight;

    @FindBy(className = "check col gcw-hotel-add-car")
    WebElement addCar;

    @FindBy(id = "tab-hotel-tab-hp")
    WebElement hotelTabBtn;


    public HotelPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void clickHotelTabBtn(){
        hotelTabBtn.click();
    }


    public void enterDestination(String city){
        Destination.clear();
        Destination.sendKeys(city);
        Destination.sendKeys(Keys.ENTER);
    }

    public void enterCheckIn(String month, String date, String year) {
        checkIn.clear();
        checkIn.sendKeys(String.format("%s/%s/%s", month, date, year));
        checkIn.sendKeys(Keys.ENTER);

    }

    public  void enterCheckOut(String month, String date, String year) {
        checkOut.clear();
        checkOut.sendKeys(String.format("%s/%s/%s", month, date, year));
        checkOut.sendKeys(Keys.ENTER);
    }


}
