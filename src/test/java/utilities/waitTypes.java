package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class waitTypes {
    WebDriver driver;

    public waitTypes(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement waitForWebElement(By Locater, int timeOut) {
        WebElement element = null;

        try {
            System.out.println("Waiting for elment in given Time :: " + timeOut + " Seconds");

            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(Locater));
            System.out.println("Element appeared on the Web Page");


        } catch (Exception e) {
            System.out.println("Unable to locate element in " + timeOut + " Seconds");
        }

        return element;

    }


    public void clickWhenReady(By Locater, int timeOut) {
        try {
            WebElement element;
            System.out.println("Waiting for element in given Time :: " + timeOut + " Seconds");

            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            element = wait.until(ExpectedConditions.elementToBeClickable(Locater));
            element.click();
            System.out.println("Element clicked");

        } catch (Exception e) {
            System.out.println("Unable to locate element in " + timeOut + " Seconds");
        }


    }

    public WebElement getElement(String locator , String type){
        WebElement element = null;
        type = type.toLowerCase();


        try {
            if (type.equals("id")){
                element = driver.findElement(By.id(locator));


            }
            else if (type.equals("xpath")){
                element=driver.findElement(By.xpath(locator));


            }
            else if (type.equals("classname")){
                element = driver.findElement(By.className(locator));

            }

            else if (type.equals("cssselector")){
                element = driver.findElement(By.cssSelector(locator));

            }

            else if (type.equals("linktext")){
                element = driver.findElement(By.linkText(locator));


            }

            else if (type.equals("name")){
                element = driver.findElement(By.name(locator));


            }

            else if (type.equals("tagname")){
                element = driver.findElement(By.tagName(locator));

            }



            else {
                return element;
            }

            if (element!=null){
                System.out.println("Element found on web page with locater: "+locator+" and type: " + type);
            }
            else {
                System.out.println("Unsupported Locator Type : "+type);
            }

        }catch (Exception e ){

            System.out.println("Unable to locate element with locator: "+locator+" and type: "+ type );

        }

        return element;


    }


    public List<WebElement> getElementList(String locator , String type){
        List<WebElement> elementsList = new ArrayList <WebElement>();
        type = type.toLowerCase();

        if (type.equals("id")){
            elementsList = driver.findElements(By.id(locator));

        }
        else if (type.equals("xpath")){
            elementsList=driver.findElements(By.xpath(locator));

        }
        else if (type.equals("classname")){
            elementsList = driver.findElements(By.className(locator));
        }

        else if (type.equals("cssselector")){
            elementsList = driver.findElements(By.cssSelector(locator));
        }

        else if (type.equals("linktext")){
            elementsList = driver.findElements(By.linkText(locator));

        }

        else if (type.equals("name")){
            elementsList = driver.findElements(By.name(locator));

        }

        else if (type.equals("tagname")){
            elementsList = driver.findElements(By.tagName(locator));
        }



        else {
            System.out.println("Locator Type not supported");
        }

        if (elementsList.isEmpty()){
            System.out.println("unable to Locate elements with locator: "+locator+" type: " +type);
        }
        else {
            System.out.println("Elements located with locator: "+locator+" type: "+type);
        }


        return elementsList;
    }

    public boolean isElementPresent(String locater, String type){
        List<WebElement> elementList = getElementList(locater,type);
        if(elementList.size()>0){
            System.out.println("The element is present with locator: "+ locater);
            return true;

        }
        else {
            System.out.println("The element is not present");
            return false;
        }
    }



}


