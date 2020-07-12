package com.mainacad;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Lab
{
    private static final By FIRST_NAME_BUTTON = By.id("firstName");
    private static final By LAST_NAME_BUTTON = By.id("lastName");
    private static final By USER_EMAIL_FIELD = By.id("userEmail");
    private static final By CHECKBOX_GANDER_MALE = By.xpath("//*[@id='gender-radio-1']/..");
    private static final By MOBILE_NUMBER_FIELD = By.id("userNumber");
    private static final By TAP_ON_CALENDAR = By.id("dateOfBirthInput");
    private static final By SELECT_CALENDAR = By.cssSelector(".react-datepicker__tab-loop");
    private static final By SELECT_MONTH = By.cssSelector(".react-datepicker__month-select");
    private static final By SELECT_OCTOBER_MONTH = By.cssSelector("[value='9']");
    private static final By SELECT_YEAR = By.cssSelector(".react-datepicker__year-select");
    private static final By SELECT_1984_YEAR = By.cssSelector("[value='1984']");
    private static final By SELECT_DAY_18 = By.cssSelector(".react-datepicker__week:nth-child(3) .react-datepicker__day:nth-child(5)");

    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        //Создаём вебдрайвер
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        //Заполняем поле firstNameField
        WebElement firstNameField = driver.findElement(FIRST_NAME_BUTTON);
        firstNameField.sendKeys("Test");

        //Заполняем поле lastName
        WebElement lastNameField = driver.findElement(LAST_NAME_BUTTON);
        lastNameField.sendKeys("TestTestovich");

        //Заполняем поле Email
        WebElement emailField = driver.findElement(USER_EMAIL_FIELD);
        emailField.sendKeys("Testtestovich@gmail.com");

        //Выбираем Checkbox
        WebElement selectCheckboxMale = driver.findElement(CHECKBOX_GANDER_MALE);
        selectCheckboxMale.click();

        //Заполняем поле Mobile
        WebElement mobileField = driver.findElement(MOBILE_NUMBER_FIELD);
        mobileField.sendKeys("1234567890");

        //Открываем календарь
        WebElement tapOnCalendar = driver.findElement(TAP_ON_CALENDAR);
        tapOnCalendar.click();
        //Выбираем месяц
        WebElement selectCalendar = driver.findElement(SELECT_CALENDAR);
        selectCalendar.findElement(SELECT_MONTH).click();
        WebElement dropDownListOfMonths = driver.findElement(SELECT_MONTH);
        dropDownListOfMonths.findElement(SELECT_OCTOBER_MONTH).click();
        //Выбираем год
        selectCalendar.findElement(SELECT_YEAR).click();
        WebElement dropDownListOfYear = driver.findElement(SELECT_YEAR);
        dropDownListOfYear.findElement(SELECT_1984_YEAR).click();
        //Выбираем день
        WebElement selectDay = driver.findElement(SELECT_DAY_18);
        selectDay.click();











    }
}
