package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AboutRentPage {

    private WebDriver driver;
    /// Заполнение блока "Про аренду"
    // Поле Даты привоза самоката
    private static final By DATE_ORDER_FIELD = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    // Поле срок аренды
    private static final By RENT_PERIOD = By.xpath(".//div[text() = '* Срок аренды']");
    // Поле для ввода комментария
    private static final By COMMENT_ORDER_FIELD = By.xpath(".//input[@class = 'Input_InputContainer__3NykH']/input[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN']");
    // Локатор кнопки Заказать
    private static final By ORDER_BUTTON = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Заказать']");

    public AboutRentPage(WebDriver driver) {
        this.driver = driver;
    }

    // Установка даты
    public void putCurrentDate() {
        Date current = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.YYYY");
        String date = formatter.format(current);
        driver.findElement(DATE_ORDER_FIELD).sendKeys(date);
    }

    // Заполнение блока "Про аренду"
    public void checkOrderList(String quantityDays, String color, String comment) {
        putCurrentDate();
        driver.findElement(RENT_PERIOD).click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(RENT_PERIOD));
        driver.findElement(By.xpath(".//div[@class = 'Dropdown-placeholder' and text() = '" + quantityDays + "']")).click();
        driver.findElement(By.id(""+ color +"")).click();
        driver.findElement(COMMENT_ORDER_FIELD).sendKeys(comment);
    }

    // Нажатие на кнопку Заказ
    public void tapToOrderButton() {
        driver.findElement(ORDER_BUTTON).click();
    }
}
