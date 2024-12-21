package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pages.ConstantsClass.IS_VISIABLE_QUESTION;
import static pages.ConstantsClass.SUB_HEADER;

public class QuestionPage {

    private WebDriver driver;

    public QuestionPage(WebDriver driver) {
        this.driver = driver;
    }

    // Скрол до подзаголовка с вопросами и ожиданием
    public void scrollQuestion() {
        WebElement element = driver.findElement(SUB_HEADER);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    // Ожидание отображения блока с вопросами
    public void waitForQuestionModule() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(IS_VISIABLE_QUESTION));
    }

    // Выбор вопроса, ожидание и взятие ответа
    public String tapToQuestionAndReturnAnswer(int numberOfQuestion) {
        driver.findElement(By.id("accordion__heading-" + numberOfQuestion + "")).click();
        waitForQuestionModule();
        return driver.findElement(By.xpath(".//div[@id = 'accordion__panel-" + numberOfQuestion + "']//p")).getText();
    }
}
