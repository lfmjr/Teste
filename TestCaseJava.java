package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UntitledTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("http://automationpractice.com/index.php?");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='$27.00'])[2]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='$29.00'])[2]/following::span[3]")).click();
    driver.findElement(By.id("total_price_container")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='$27.00'])[6]/following::span[1]")).click();
    driver.findElement(By.id("email_create")).click();
    driver.findElement(By.id("email_create")).clear();
    driver.findElement(By.id("email_create")).sendKeys("arc@gmail.com");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email address'])[1]/following::div[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email address'])[1]/following::span[1]")).click();
    driver.findElement(By.id("id_gender1")).click();
    driver.findElement(By.id("customer_firstname")).click();
    driver.findElement(By.id("customer_firstname")).clear();
    driver.findElement(By.id("customer_firstname")).sendKeys("Arce");
    driver.findElement(By.id("customer_lastname")).clear();
    driver.findElement(By.id("customer_lastname")).sendKeys("Vegar");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("passwd")).click();
    driver.findElement(By.id("passwd")).clear();
    driver.findElement(By.id("passwd")).sendKeys("12345");
    driver.findElement(By.id("days")).click();
    new Select(driver.findElement(By.id("days"))).selectByVisibleText("regexp:12\\s+");
    driver.findElement(By.id("days")).click();
    driver.findElement(By.id("months")).click();
    new Select(driver.findElement(By.id("months"))).selectByVisibleText("regexp:November\\s");
    driver.findElement(By.id("months")).click();
    driver.findElement(By.id("years")).click();
    new Select(driver.findElement(By.id("years"))).selectByVisibleText("regexp:1998\\s+");
    driver.findElement(By.id("years")).click();
    driver.findElement(By.id("address1")).click();
    driver.findElement(By.id("address1")).clear();
    driver.findElement(By.id("address1")).sendKeys("Strett Zerc");
    driver.findElement(By.id("city")).click();
    driver.findElement(By.id("city")).clear();
    driver.findElement(By.id("city")).sendKeys("Ohayo");
    driver.findElement(By.id("id_state")).click();
    new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("id_state")).click();
    driver.findElement(By.id("postcode")).click();
    driver.findElement(By.id("postcode")).clear();
    driver.findElement(By.id("postcode")).sendKeys("00000");
    driver.findElement(By.id("phone_mobile")).click();
    driver.findElement(By.id("phone_mobile")).clear();
    driver.findElement(By.id("phone_mobile")).sendKeys("5599999999");
    driver.findElement(By.id("alias")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='DNI / NIF / NIE'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Add a new address'])[1]/following::h3[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Your delivery address'])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Your billing address'])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='If you would like to add a comment about your order, please write it in the field below.'])[1]/following::span[1]")).click();
    driver.findElement(By.id("delivery_option_116541_0")).click();
    driver.findElement(By.id("cgv")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(Read the Terms of Service)'])[1]/following::span[1]")).click();
    driver.findElement(By.id("total_price")).click();
    driver.findElement(By.linkText("Pay by check (order processing will be longer)")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Dollar'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Your check must include:'])[1]/preceding::p[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='$29.00'])[1]/preceding::h3[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sign out'])[1]/preceding::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='My account'])[2]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Invoice'])[1]/following::td[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Payment'])[1]/following::th[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Payment by check'])[1]/following::td[1]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
