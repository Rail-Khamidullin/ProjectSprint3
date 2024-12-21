package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuestionPage {

    // Константа с URL самоката
    public static final String URL_SAMOKAT = "https://qa-scooter.praktikum-services.ru/";
    private WebDriver driver;
    // Локатор заголовка с вопросами (для скрола)
    private By subHeader = By.xpath(".//div[text() = 'Вопросы о важном']");
    // Локатор с блоком вопросов
    private By isVivsiableQuestion = By.xpath(".//div[@class = 'Home_FAQ__3uVm4']");

    public QuestionPage(WebDriver driver) {
        this.driver = driver;
    }

    // Скрол до подзаголовка с вопросами и ожиданием
    public void scrollQuestion() {
        WebElement element = driver.findElement(subHeader);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    // Ожидание отображения блока с вопросами
    public void waitForQuestionModule() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(isVivsiableQuestion));
    }

    // Выбор вопроса, ожидание и взятие ответа
    public String tapToQuestionAndReturnAnswer(int numberOfQuestion) {
        driver.findElement(By.id("accordion__heading-" + numberOfQuestion + "")).click();
        waitForQuestionModule();
        return driver.findElement(By.xpath(".//div[@id = 'accordion__panel-" + numberOfQuestion + "']//p")).getText();
    }
}
