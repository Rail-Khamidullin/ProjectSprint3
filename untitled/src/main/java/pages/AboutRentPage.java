package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutRentPage {
    public static final By DATE_ORDER_FIELD = By.className("Input_Input__1iN_Z Input_Responsible__1jDKN Input_Filled__1rDxs");
    public static final By RENT_PERIOD = By.className("Dropdown-placeholder");
    public static final By COMMEN_ORDER_FIELD = By.xpath(".//input[@class = 'Input_InputContainer__3NykH']/input[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN']");
    public static final By ORDER_BUTTON = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Заказать']");
    public By dateOrderField = By.className("Input_Input__1iN_Z Input_Responsible__1jDKN Input_Filled__1rDxs");

    private WebDriver driver;

    public AboutRentPage(WebDriver driver) {
        this.driver = driver;
    }

    // Заполнение блока "Про аренду"
    public void checkOrderList(String date, String quantityDays, String color, String comment) {
        driver.findElement(DATE_ORDER_FIELD).sendKeys(date);
        driver.findElement(RENT_PERIOD).click();
        driver.findElement(By.xpath(".//div[@class = 'Dropdown-placeholder' and text() = '" + quantityDays + "']")).click();
        driver.findElement(By.id(""+ color +"")).click();
        driver.findElement(COMMEN_ORDER_FIELD).sendKeys(comment);
        driver.findElement(ORDER_BUTTON).click();
    }
}
