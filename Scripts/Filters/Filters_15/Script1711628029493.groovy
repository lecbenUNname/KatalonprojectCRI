import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

CustomKeywords.'com.helper.common.CommonMethod.logIntoApplication'()

WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))

WebUI.click(findTestObject('Filters/Filter_Button'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Filters/activeIconFilters'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement colorFilterOption = DriverFactory.getWebDriver().findElement(By.xpath('//h5[@data-title="Color"]'))
WebElement sizeFilterOption  = DriverFactory.getWebDriver().findElement(By.xpath('//h5[@data-title="Size"]'))

if(colorFilterOption.isDisplayed() && sizeFilterOption.isDisplayed()) {
	
	println("Additional filter options for color and size are displayed.")
	
} else {
	
	println("Additional filter options for color and size are not displayed.")
	
}
driver.close()