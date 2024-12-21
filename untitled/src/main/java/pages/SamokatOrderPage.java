package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SamokatOrderPage {

    public static final By FIRST_ORDER_BUTTON = By.className("Header_Link__1TAG7");
    public static final By FIRST_NAME_FIELD = By.xpath(".//div[@class = 'Input_InputContainer__3NykH']/div[@class = 'Input_Input__1iN_Z' and text() = '* Имя']");
    public static final By SECOND_NAME_FIELD = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    public static final By ADDRESS_ORDER_FIELD = By.xpath(".//div[@class = 'Input_InputContainer__3NykH']/div[@class = 'Input_Input__1iN_Z' and text() = '* Адрес: куда привезти заказ']");
    public static final By SUBWAY_ORDER_FIELD = By.className("select-search__input");
    public static final By PHONE_NUMBER_FIELD = By.xpath(".//div[@class = 'Input_InputContainer__3NykH']/div[@class = 'Input_Input__1iN_Z' and text() = '* Телефон: на него позвонит курьер']");
    public static final By NEXT_BUTTON = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    // Локатор кнопки Заказ в хедере
    public By firstOrderButton = By.className("Header_Link__1TAG7");
    // Локатор кнопки Заказ под описанием самоката
    public By secondOrderButton = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    // Поле для ввода имени
    public By firstNameField = By.xpath(".//div[@class = 'Input_InputContainer__3NykH']/div[@class = 'Input_Input__1iN_Z' and text() = '* Имя']");
    // Поле для ввода Фамилии
    public By secondNameField = By.xpath(".//div[@class = 'Input_InputContainer__3NykH']/div[@class = 'Input_Input__1iN_Z' and text() = '* Фамилия']");
    // Поле для ввода Адреса
    public By addressField = By.xpath(".//div[@class = 'Input_InputContainer__3NykH']/div[@class = 'Input_Input__1iN_Z' and text() = '* Адрес: куда привезти заказ']");
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

    private WebDriver driver;

    public SamokatOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    // Нажатие на первую кнопку Заказ (в хедере)
    public void tapToFirstOrderButton() {
        driver.findElement(FIRST_ORDER_BUTTON).click();
    }

    // Заполнение блока "Для кого самокат"
    public void checkOrderList(String firstName, String secondName, String addressName, String subwayName, String phoneNumber) {
        driver.findElement(FIRST_NAME_FIELD).sendKeys(firstName);
        driver.findElement(SECOND_NAME_FIELD).sendKeys(secondName);
        driver.findElement(ADDRESS_ORDER_FIELD).sendKeys(addressName);
        driver.findElement(SUBWAY_ORDER_FIELD).click();
        driver.findElement(By.xpath(".//input[@class = 'select-search__input' and text() = '" + subwayName + "']")).click();
        driver.findElement(PHONE_NUMBER_FIELD).sendKeys(phoneNumber);
        driver.findElement(NEXT_BUTTON).click();
    }
}
