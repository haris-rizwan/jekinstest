package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class FlightPage {
    public static WebElement element = null;

    /**
     * @param driver** Web driver required **
     * @return WebElement
     */


    public static WebElement flyingFrom(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']"));
        return element;

    }

    /**
     * @param driver** Web driver required **
     * @return WebElement
     */

    public static WebElement flyingTo(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']"));
        return element;

    }

    /**
     * @param driver** Web driver required **
     * @return WebElement
     */

    public static WebElement departureDate(WebDriver driver) {
        element = driver.findElement(By.id("flight-departing-hp-flight"));
        return element;

    }

    /**
     * @param driver** Web driver required **
     * @return WebElement
     */

    public static WebElement returnDate(WebDriver driver) {
        element = driver.findElement(By.id("flight-returning-hp-flight"));
        return element;

    }

    /**
     * @param driver** Web driver required **
     * @return WebElement
     */

    public static WebElement adults(WebDriver driver) {
        element = driver.findElement(By.xpath("//select[@id='flight-adults-hp-flight']"));
        return element;

    }

    /**
     * @param driver** Web driver required **
     * @return WebElement
     */


    public static WebElement children(WebDriver driver) {
        element = driver.findElement(By.xpath("//select[@id='flight-children-hp-flight']"));
        return element;

    }

    /**
     * @param driver** Web driver required **
     * @return WebElement
     */


    public static WebElement addHotelOption(WebDriver driver) {
        element = driver.findElement(By.xpath("//label[contains(@class,'check col gcw-flights-add-hotel')]"));
        return element;

    }

    /**
     * @param driver** Web driver required **
     * @return WebElement
     */

    public static WebElement addCarOption(WebDriver driver) {
        element = driver.findElement(By.xpath("//label[contains(@class,'check col gcw-flights-add-car')]"));
        return element;

    }

    /**
     * @param driver** Web driver required **
     * @return WebElement
     */

    public static WebElement searchButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//form[@id='gcw-flights-form-hp-flight']//div[@class='cols-nested']//label[@class='col search-btn-col']//button[@type='submit']"));
        return element;

    }

    /**
     * @param driver** Web driver required **
     * @return WebElement
     */

    public  static WebElement advanceOptions(WebDriver driver) {
        element = driver.findElement(By.id("flight-advanced-options-hp-flight"));
        return element;

    }

    /**
     * Methods
     */

    /**
     * Enters the city name in the field
     *
     * @param driver     ** Web driver required **
     * @param CityName** String required **
     */
    public static void enterDepartureCity(WebDriver driver, String CityName) {
        flyingFrom(driver).sendKeys(CityName);
    }

    /**
     * Enters the city name in the field
     *
     * @param driver**   Web driver required **
     * @param CityName** String required **
     */

    public static void enterDestinationCity(WebDriver driver, String CityName) {
        flyingTo(driver).sendKeys(CityName);
    }

    /**
     * @param driver**Web   driver required**
     * @param month**String required **
     * @param date**String  required**
     * @param year**String  required**
     */
    public static void departureDate(WebDriver driver, String month, String date, String year) {
        departureDate(driver).sendKeys(String.format("%s/%s/%s", month, date, year));
    }

    /**
     * @param driver**Web   driver required**
     * @param month**String required**
     * @param date**String  required**
     * @param year**String  required**
     */
    public static void arrivalDate(WebDriver driver, String month, String date, String year) {
        returnDate(driver).clear();
        returnDate(driver).sendKeys(String.format("%s/%s/%s", month, date, year));

    }

    /**
     * Selects the adults with a value
     *
     * @param driver** Web driver required **
     * @param Value**  String**
     */

    public static void selectAdults(WebDriver driver, String Value) {
        WebElement el1 = adults(driver);
        Select newSelect = new Select(el1);
        newSelect.selectByValue(Value);

    }

    /**
     * Selects the adults with index value of the options
     *
     * @param driver** Web driver required **
     * @param Value**  Integar value**
     */

    public static void selectAdults(WebDriver driver, int Value) {
        WebElement el1 = adults(driver);
        Select newSelect = new Select(el1);
        newSelect.selectByIndex(Value);
    }

    /**
     * Clicks on the search button
     *
     * @param driver**web driver required**
     */

    public static void clickSearch(WebDriver driver) {
        searchButton(driver).click();
    }

    public static void clickadvanceOptions(WebDriver driver) {
        advanceOptions(driver).click();
    }
}



