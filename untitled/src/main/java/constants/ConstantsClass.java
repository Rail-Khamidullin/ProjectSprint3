package constants;

import org.openqa.selenium.By;

// Класс с константами для тестов
public class ConstantsClass {


    // URL самоката
    public static final String URL_SAMOKAT = "https://qa-scooter.praktikum-services.ru/";

    /// ДЛЯ ПОДЗАГОЛОВКА
    // Локатор заголовка с вопросами (для скрола)
    public static final By SUB_HEADER = By.xpath(".//div[text() = 'Вопросы о важном']");
    // Локатор с блоком вопросов
    public static final By IS_VISIABLE_QUESTION = By.xpath(".//div[@class = 'Home_FAQ__3uVm4']");

    /// ДЛЯ ЗАКАЗА САМОКАТА

    // Локатор кнопкк Заказ в хедере
    public By firstOrderButton = By.className("Header_Link__1TAG7");
    // Локатор кнопки Заказ под описанием самоката
    public By secondOrderButton = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    // Поле для ввода имени
    public By firstNameField = By.xpath(".//div[@class = 'Input_InputContainer__3NykH']/div[@class = 'Input_Input__1iN_Z' and text() = '* Имя']");
    // Поле для ввода Фамилии
    public By secondNameField = By.xpath(".//div[@class = 'Input_InputContainer__3NykH']/div[@class = 'Input_Input__1iN_Z' and text() = '* Фамилия']");
    // Поле для ввода Адреса
    public By adressField = By.xpath(".//div[@class = 'Input_InputContainer__3NykH']/div[@class = 'Input_Input__1iN_Z' and text() = '* Адрес: куда привезти заказ']");
    // Поле для ввода Станции метро
    public By subwayField = By.className("select-search__input");
    // Название станции
    public String subwayName;
    public By subwayNameField = By.xpath(".//input[@class = 'select-search__input' and text() = '" + subwayName + "']");
    // Поле для ввода Телефона
    public By phoneField = By.xpath(".//div[@class = 'Input_InputContainer__3NykH']/div[@class = 'Input_Input__1iN_Z' and text() = '* Телефон: на него позвонит курьер']");
    // Локтор кнопки Далее
    public By nextButton = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    // Поле Даты привоза самоката
    public By dateOrderField = By.className("Input_Input__1iN_Z Input_Responsible__1jDKN Input_Filled__1rDxs");
    // Поле срок аренды
    public By rentPeriod = By.className("Dropdown-placeholder");
    // Кол-во дней для аренды
    public String quantityDays;
    // Плейсхолдер с выбором дней аренды
    public By dayRentPeriod = By.xpath(".//div[@class = 'Dropdown-placeholder' and text() = '" + quantityDays + "']");
    // Цвета самоката
    public By color;
    // Выбор цвета самоката
    public By samokatColor = By.id(""+ color +"");
    // Поле для ввода комментария
    public By commentField = By.xpath(".//input[@class = 'Input_InputContainer__3NykH']/input[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN']");
    // Локатор кнопки Заказать
    public By orderButton = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Заказать']");
    // Локатор кнопки всплывающего окна "Хотите оформить заказ" с названием Да
    public By approvalOrderButton = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Да']");
}

