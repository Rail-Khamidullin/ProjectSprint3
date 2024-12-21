package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static constants.ConstantsClass.*;

public class AboutRentPage {


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
        driver.findElement(COMMENT_ORDER_FIELD).sendKeys(comment);
        driver.findElement(ORDER_BUTTON).click();
    }
}
