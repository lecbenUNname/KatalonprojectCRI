import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))
WebUI.click(findTestObject('Filters/Filter_Button'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement priceFilter = driver.findElement(By.xpath("//div[@class='price_slider_amount']//span[2]"))
String initialPriceRange = priceFilter.getText()
println(initialPriceRange)

WebElement slider = driver.findElement(By.xpath("//div[@class='slider-range ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']//span[1]"))

Actions sliderAction = new Actions(driver)
sliderAction.clickAndHold(slider).moveByOffset(50, 0).release().perform()

String updatedPriceRange = priceFilter.getText();

println(updatedPriceRange)

if(!updatedPriceRange.equals(initialPriceRange)) {
	
	println("Updated price range is not equal to initial price range")}else {
	
	println("Updated price range is  equal to initial price range")
	
}

driver.quit()