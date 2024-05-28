import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()
CustomKeywords.'com.helper.common.CommonMethod.logIntoApplication'()

WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))
WebUI.click(findTestObject('Filters/Filter_Button'))
WebUI.scrollToPosition(0, 300)

WebDriver driver = DriverFactory.getWebDriver()
WebElement priceFilter = driver.findElement(By.xpath('//div[@class=\'price_slider_amount\']//span[2]'))
WebElement slider = driver.findElement(By.xpath('//div[@class=\'slider-range ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content\']//span[1]'))
Actions sliderAction = new Actions(driver)
sliderAction.clickAndHold(slider).moveByOffset(20, 0).release().perform()
WebUI.click(findTestObject('Filters/filterButtonIcon'))

WebElement nextButton = driver.findElement(By.xpath('//a[@class=\'next page-link\']'))
while (nextButton != null) {
    WebUI.delay(3)
    WebUI.scrollToPosition(0, 2000)
    WebUI.delay(2)
    nextButton.click()
   
	WebElement product = driver.findElement(By.xpath("//div[@class='product-img-action-wrap']"))
	assert product.isDisplayed() : "Product is not displayed on page ${driver.findElement(By.xpath('//div[@class="product-img-action-wrap"]')).getText()}"
    try {
        nextButton = driver.findElement(By.xpath('//a[@class=\'next page-link\']'))
    } catch (Exception e) {
       
        break
    }
}
