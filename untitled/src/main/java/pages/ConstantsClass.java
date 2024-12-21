package pages;

import org.openqa.selenium.By;

public class ConstantsClass {

    // Константа с URL самоката
    public static final String URL_SAMOKAT = "https://qa-scooter.praktikum-services.ru/";
    // Локатор заголовка с вопросами (для скрола)
    public static final By SUB_HEADER = By.xpath(".//div[text() = 'Вопросы о важном']");
    // Локатор с блоком вопросов
    public static final By IS_VISIABLE_QUESTION = By.xpath(".//div[@class = 'Home_FAQ__3uVm4']");
}

