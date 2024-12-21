package constants;

import org.openqa.selenium.By;

// Класс с локаторами
public class ConstantsClass {


    // URL самоката
    public static final String URL_SAMOKAT = "https://qa-scooter.praktikum-services.ru/";

    /// Для вопросов в подзаголовке
    // Локатор заголовка с вопросами (для скрола)
    public static final By SUB_HEADER = By.xpath(".//div[text() = 'Вопросы о важном']");
    // Локатор с блоком вопросов
    public static final By IS_VISIBLE_QUESTION = By.xpath(".//div[@class = 'Home_FAQ__3uVm4']");

    /// Заполнение блока "Для кого самокат"
    // Локатор кнопки Заказ в хедере
    public static final By FIRST_ORDER_BUTTON = By.className("Header_Link__1TAG7");
    // Локатор кнопки Заказ в хедере
    public static final By FIRST_NAME_FIELD = By.xpath(".//div[@class = 'Input_InputContainer__3NykH']/div[@class = 'Input_Input__1iN_Z' and text() = '* Имя']");
    // Поле для ввода Фамилии
    public static final By SECOND_NAME_FIELD = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    // Поле для ввода Адреса
    public static final By ADDRESS_ORDER_FIELD = By.xpath(".//div[@class = 'Input_InputContainer__3NykH']/div[@class = 'Input_Input__1iN_Z' and text() = '* Адрес: куда привезти заказ']");
    // Поле для ввода Станции метро
    public static final By SUBWAY_ORDER_FIELD = By.className("select-search__input");
    // Поле для ввода Телефона
    public static final By PHONE_NUMBER_FIELD = By.xpath(".//div[@class = 'Input_InputContainer__3NykH']/div[@class = 'Input_Input__1iN_Z' and text() = '* Телефон: на него позвонит курьер']");
    // Локтор кнопки Далее
    public static final By NEXT_BUTTON = By.className("Button_Button__ra12g Button_Middle__1CSJM");

    /// Заполнение блока "Про аренду"
    // Поле Даты привоза самоката
    public static final By DATE_ORDER_FIELD = By.className("Input_Input__1iN_Z Input_Responsible__1jDKN Input_Filled__1rDxs");
    // Поле срок аренды
    public static final By RENT_PERIOD = By.className("Dropdown-placeholder");
    // Поле для ввода комментария
    public static final By COMMENT_ORDER_FIELD = By.xpath(".//input[@class = 'Input_InputContainer__3NykH']/input[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN']");
    // Локатор кнопки Заказать
    public static final By ORDER_BUTTON = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Заказать']");

    /// Локатор кнопки всплывающего окна "Хотите оформить заказ" с названием Да
    public static final By APPROVAL_ORDER_BUTTON = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Да']");
}

