package ru.yandex.subHeaderQuestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AboutRentPage;
import pages.OrderWindowPage;
import pages.SamokatOrderPage;
import java.util.concurrent.TimeUnit;
import static constants.ConstantsClass.URL_SAMOKAT;

@RunWith(Parameterized.class)
public class TestSamokatOrder {

    private WebDriver driver;

    /// Заполнение блока "Для кого самокат"
    // Имя
    private String firstName;
    // Фамилия
    private String secondName;
    // Адрес
    private String addressName;
    // Номер станции метро
    private String subwayName;
    // Номер телефона
    private String phoneNumber;

    /// Заполнение блока "Про аренду"
    // Кол-во дней для аренды
    private String quantityDays;
    // Цвета самоката
    private String color;
    // Текст коммента
    private String comment;

    public TestSamokatOrder(String firstName, String secondName, String addressName, String subwayName, String phoneNumber, String quantityDays, String color, String comment) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.addressName = addressName;
        this.subwayName = subwayName;
        this.phoneNumber = phoneNumber;
        this.quantityDays = quantityDays;
        this.color = color;
        this.comment = comment;
    }

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Parameterized.Parameters
    public static Object[][] getAnswer() {
        return new Object[][]{
                {"Иван", "Иванов", "г.Мюнхен, ул. Лейпцига Штрассе, 1", "1", "89979989999", "сутки", "black", "Первый тест"},
                {"Олег", "Олегин", "г.Дрезден, ул. Лейпцига Штрассе, 2", "2", "89979901010", "двое суток", "grey", "Второй тест"}
        };
    }

    @Test
    public void orderTest() {

        // Создаём драйвер для браузера Chrome
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(URL_SAMOKAT);

        SamokatOrderPage samokatOrderPage = new SamokatOrderPage(driver);
        samokatOrderPage.tapToFirstOrderButton();
        samokatOrderPage.checkOrderList(firstName, secondName, addressName, subwayName, phoneNumber);

        AboutRentPage aboutRentPage = new AboutRentPage(driver);
        aboutRentPage.checkOrderList(quantityDays, color, comment);
        aboutRentPage.tapToOrderButton();

        OrderWindowPage orderWindowPage = new OrderWindowPage(driver);
        orderWindowPage.tapToFinishOrderButton();
    }

    @After
    public void tearDown() {
        // Закрой браузер
        this.driver.quit();
    }
}
