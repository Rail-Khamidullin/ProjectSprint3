package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderWindowPage {

    private WebDriver driver;
    /// Локатор кнопки всплывающего окна "Хотите оформить заказ" с названием Да
    private static final By APPROVAL_ORDER_BUTTON = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Да']");

    public OrderWindowPage(WebDriver driver) {
        this.driver = driver;
    }

    // Нажатие на кнопку Да в окне оформление заказа
    public void tapToFinishOrderButton() {
        driver.findElement(APPROVAL_ORDER_BUTTON).click();
    }
}
