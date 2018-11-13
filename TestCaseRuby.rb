require "json"
require "selenium-webdriver"
require "rspec"
include RSpec::Expectations

describe "UntitledTestCase" do

  before(:each) do
    @driver = Selenium::WebDriver.for :firefox
    @base_url = "https://www.katalon.com/"
    @accept_next_alert = true
    @driver.manage.timeouts.implicit_wait = 30
    @verification_errors = []
  end
  
  after(:each) do
    @driver.quit
    @verification_errors.should == []
  end
  
  it "test_untitled_test_case" do
    @driver.get "http://automationpractice.com/index.php?"
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='$27.00'])[2]/following::span[1]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='$29.00'])[2]/following::span[3]").click
    @driver.find_element(:id, "total_price_container").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='$27.00'])[6]/following::span[1]").click
    @driver.find_element(:id, "email_create").click
    @driver.find_element(:id, "email_create").clear
    @driver.find_element(:id, "email_create").send_keys "ace@gmail.com"
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Email address'])[1]/following::div[1]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Email address'])[1]/following::span[1]").click
    @driver.find_element(:id, "id_gender1").click
    @driver.find_element(:id, "customer_firstname").click
    @driver.find_element(:id, "customer_firstname").clear
    @driver.find_element(:id, "customer_firstname").send_keys "Arce"
    @driver.find_element(:id, "customer_lastname").clear
    @driver.find_element(:id, "customer_lastname").send_keys "Vegar"
    @driver.find_element(:id, "email").click
    @driver.find_element(:id, "passwd").click
    @driver.find_element(:id, "passwd").clear
    @driver.find_element(:id, "passwd").send_keys "12345"
    @driver.find_element(:id, "days").click
    Selenium::WebDriver::Support::Select.new(@driver.find_element(:id, "days")).select_by(:text, "regexp:12\\s+")
    @driver.find_element(:id, "days").click
    @driver.find_element(:id, "months").click
    Selenium::WebDriver::Support::Select.new(@driver.find_element(:id, "months")).select_by(:text, "regexp:November\\s")
    @driver.find_element(:id, "months").click
    @driver.find_element(:id, "years").click
    Selenium::WebDriver::Support::Select.new(@driver.find_element(:id, "years")).select_by(:text, "regexp:1998\\s+")
    @driver.find_element(:id, "years").click
    @driver.find_element(:id, "address1").click
    @driver.find_element(:id, "address1").clear
    @driver.find_element(:id, "address1").send_keys "Strett Zerc"
    @driver.find_element(:id, "city").click
    @driver.find_element(:id, "city").clear
    @driver.find_element(:id, "city").send_keys "Ohayo"
    @driver.find_element(:id, "id_state").click
    Selenium::WebDriver::Support::Select.new(@driver.find_element(:id, "id_state")).select_by(:text, "Iowa")
    @driver.find_element(:id, "id_state").click
    @driver.find_element(:id, "postcode").click
    @driver.find_element(:id, "postcode").clear
    @driver.find_element(:id, "postcode").send_keys "00000"
    @driver.find_element(:id, "phone_mobile").click
    @driver.find_element(:id, "phone_mobile").clear
    @driver.find_element(:id, "phone_mobile").send_keys "5599999999"
    @driver.find_element(:id, "alias").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='DNI / NIF / NIE'])[1]/following::span[1]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Add a new address'])[1]/following::h3[1]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Your delivery address'])[1]/following::li[1]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Your billing address'])[1]/following::li[1]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='If you would like to add a comment about your order, please write it in the field below.'])[1]/following::span[1]").click
    @driver.find_element(:id, "delivery_option_116541_0").click
    @driver.find_element(:id, "cgv").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='(Read the Terms of Service)'])[1]/following::span[1]").click
    @driver.find_element(:id, "total_price").click
    @driver.find_element(:link, "Pay by check (order processing will be longer)").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Dollar'])[1]/following::span[1]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Your check must include:'])[1]/preceding::p[1]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='$29.00'])[1]/preceding::h3[1]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Sign out'])[1]/preceding::span[1]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='My account'])[2]/following::span[1]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Invoice'])[1]/following::td[1]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Payment'])[1]/following::th[1]").click
    @driver.find_element(:xpath, "(.//*[normalize-space(text()) and normalize-space(.)='Payment by check'])[1]/following::td[1]").click
  end
  
  def element_present?(how, what)
    ${receiver}.find_element(how, what)
    true
  rescue Selenium::WebDriver::Error::NoSuchElementError
    false
  end
  
  def alert_present?()
    ${receiver}.switch_to.alert
    true
  rescue Selenium::WebDriver::Error::NoAlertPresentError
    false
  end
  
  def verify(&blk)
    yield
  rescue ExpectationNotMetError => ex
    @verification_errors << ex
  end
  
  def close_alert_and_get_its_text(how, what)
    alert = ${receiver}.switch_to().alert()
    alert_text = alert.text
    if (@accept_next_alert) then
      alert.accept()
    else
      alert.dismiss()
    end
    alert_text
  ensure
    @accept_next_alert = true
  end
end
