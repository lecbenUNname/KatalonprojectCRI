import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()
CustomKeywords.'com.helper.common.CommonMethod.logIntoApplication'()

WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))
WebUI.click(findTestObject('Filters/Filter_Button'))
WebUI.scrollToPosition(0, 300)

WebDriver driver = DriverFactory.getWebDriver()

// Specify a more specific xpath to uniquely identify the slider
WebElement slider = driver.findElement(By.xpath('//div[@class=\'slider-range ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content\']'))

// Ensure that the slider element is visible and interactable
if (slider.isDisplayed() && slider.isEnabled()) {
    int desiredPrice = 10
    int minPrice = 0
    int maxPrice = 100
    double percentage = (((desiredPrice as double) - minPrice) / (maxPrice - minPrice)) * 100
	println(percentage)
    Actions actions = new Actions(driver)
    actions.dragAndDropBy(slider, (percentage as int), 0).perform()
} else {
    println("Slider is not visible or enabled")
}
WebUI.closeBrowser()