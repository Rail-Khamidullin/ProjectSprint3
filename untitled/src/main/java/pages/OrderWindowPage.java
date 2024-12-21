package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.ConstantsClass.APPROVAL_ORDER_BUTTON;

public class OrderWindowPage {

    private WebDriver driver;

    public OrderWindowPage(WebDriver driver) {
        this.driver = driver;
    }

    // Нажатие на кнопку Да в окне оформление заказа
    public void tapToFirstOrderButton() {
        driver.findElement(APPROVAL_ORDER_BUTTON).click();
    }
}
