import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.CommonUtils;

/**
 * Created by duongnapham on 2/12/15.
 */
public class InsureAutomobile {

    private final Logger logger = Logger.getLogger(InsureAutomobile.class);
    private CommonUtils commonUtils = new CommonUtils();
    private WebDriver driver;

    @Test
    public void openBrowserWithUrl(){
        try{
            driver = commonUtils.openChromeBrowser("http://sampleapp.tricentis.com/101/");
            System.out.println("Clicking on Automobile link .........");
            WebElement searchIconElement = driver.findElement(By.cssSelector("#nav_automobile"));
            searchIconElement.click();
            
            //Enter Vehicle Data
            System.out.println("Enter vehicle make .........");
            WebElement searchInputElement = driver.findElement(By.cssSelector("#make"));
            searchInputElement.sendKeys("Ford");
            System.out.println("Enter engine performance .........");
            searchInputElement = driver.findElement(By.cssSelector("#engineperformance"));
            searchInputElement.sendKeys("125");
            System.out.println("Enter Date Of Manufacture .........");
            searchInputElement = driver.findElement(By.cssSelector("#dateofmanufacture"));
            searchInputElement.sendKeys("10/10/2020");
            System.out.println("Enter number of seats .........");
            searchInputElement = driver.findElement(By.cssSelector("#numberofseats"));
            searchInputElement.sendKeys("4");
            System.out.println("Enter Fuel type .........");
            searchInputElement = driver.findElement(By.cssSelector("#fuel"));
            searchInputElement.sendKeys("Petrol");
            System.out.println("Enter list price .........");
            searchInputElement = driver.findElement(By.cssSelector("#listprice"));
            searchInputElement.sendKeys("12000");
            System.out.println("Enter license plate .........");
            searchInputElement = driver.findElement(By.cssSelector("#licenseplatenumber"));
            searchInputElement.sendKeys("AE01 ERD");
            System.out.println("Enter annual mileage .........");
            searchInputElement = driver.findElement(By.cssSelector("#annualmileage"));
            searchInputElement.sendKeys("30000");
            System.out.println("Click enter.........");
            searchIconElement = driver.findElement(By.cssSelector("#nextenterinsurantdata"));
            searchIconElement.click();
            
            //Enter Insurant Data
            System.out.println("Enter firstname .........");
            searchInputElement = driver.findElement(By.cssSelector("#firstname"));
            searchInputElement.sendKeys("Maurice");
            System.out.println("Enter lastname .........");
            searchInputElement = driver.findElement(By.cssSelector("#lastname"));
            searchInputElement.sendKeys("Blondel");
            System.out.println("Enter DOB .........");
            searchInputElement = driver.findElement(By.cssSelector("#birthdate"));
            searchInputElement.sendKeys("10/10/1975");
            System.out.println("Enter gender .........");
            searchInputElement = driver.findElement(By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span"));
            searchInputElement.click();
            System.out.println("Enter street .........");
            searchInputElement = driver.findElement(By.cssSelector("#streetaddress"));
            searchInputElement.sendKeys("144 Coldharbour Lane");
            System.out.println("Enter country .........");
            searchInputElement = driver.findElement(By.cssSelector("#country"));
            searchInputElement.sendKeys("United Kindgom");
            System.out.println("Enter zipcode .........");
            searchInputElement = driver.findElement(By.cssSelector("#zipcode"));
            searchInputElement.sendKeys("90210");
            System.out.println("Enter city .........");
            searchInputElement = driver.findElement(By.cssSelector("#city"));
            searchInputElement.sendKeys("London");
            System.out.println("Enter occupation .........");
            searchInputElement = driver.findElement(By.cssSelector("#occupation"));
            searchInputElement.sendKeys("Employee");           
            System.out.println("Enter hobby .........");
            searchInputElement = driver.findElement(By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span"));
            searchInputElement.click();
            System.out.println("Click enter.........");
            searchIconElement = driver.findElement(By.cssSelector("#nextenterproductdata"));
            searchIconElement.click();
            
            //Enter Product Data
            System.out.println("Enter start date .........");
            searchInputElement = driver.findElement(By.cssSelector("#startdate"));
            searchInputElement.sendKeys("12/10/2023");
            System.out.println("Enter insurance sum .........");
            searchInputElement = driver.findElement(By.cssSelector("#insurancesum"));
            searchInputElement.sendKeys("3,000,000.00");
            System.out.println("Enter Merit rating .........");
            searchInputElement = driver.findElement(By.cssSelector("#meritrating"));
            searchInputElement.sendKeys("SuperBonus");
            System.out.println("Enter Damage Insurance .........");
            searchInputElement = driver.findElement(By.cssSelector("#damageinsurance"));
            searchInputElement.sendKeys("Full Coverage");
            System.out.println("Enter optional products .........");
            searchInputElement = driver.findElement(By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span"));
            searchInputElement.click();
            System.out.println("Enter courtesy car .........");
            searchInputElement = driver.findElement(By.cssSelector("#courtesycar"));
            searchInputElement.sendKeys("No");
            searchIconElement = driver.findElement(By.cssSelector("#nextselectpriceoption"));
            searchIconElement.click();
            
            //Enter Product Data
            searchInputElement = driver.findElement(By.cssSelector("#selectsilver_price"));
            String actualPrice = searchInputElement.getText();
            System.out.println("Silver Insurance cost = $" + actualPrice);
            Assert.assertEquals("99.00", actualPrice);
            System.out.println("Select Silver Insurance .........");
            searchInputElement = driver.findElement(By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(1) > span"));
            searchInputElement.click();
            searchIconElement = driver.findElement(By.cssSelector("#nextsendquote"));
            searchIconElement.click();
            
            //Enter Send Quote Data
            System.out.println("Enter email .........");
            searchInputElement = driver.findElement(By.cssSelector("#email"));
            searchInputElement.sendKeys("maurice@home.net");
            System.out.println("Enter phone number .........");
            searchInputElement = driver.findElement(By.cssSelector("#phone"));
            searchInputElement.sendKeys("01912283789");
            System.out.println("Enter username .........");
            searchInputElement = driver.findElement(By.cssSelector("#username"));
            searchInputElement.sendKeys("Maurice");
            System.out.println("Enter passowrd .........");
            searchInputElement = driver.findElement(By.cssSelector("#password"));
            searchInputElement.sendKeys("P@ssw0rd1234");
            Thread.sleep(1000);
            System.out.println("Re-enter passowrd .........");
            searchInputElement = driver.findElement(By.cssSelector("#confirmpassword"));
            //searchInputElement.sendKeys(Keys.TAB);
            searchInputElement.sendKeys("P@ssw0rd1234");
            System.out.println("Send .........");
            searchIconElement = driver.findElement(By.cssSelector("#sendemail"));
            searchIconElement.click();
            System.out.println("Press OK .........");
            searchIconElement = driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button"));
            searchIconElement.click();
                       
            //Closing browser
            System.out.println("Closing browser now .........");
            logger.info("Quit ....");
            driver.quit();
        }
        catch (Exception e){
            logger.error("testURLs: " + e.getMessage());
        }
    }

}
