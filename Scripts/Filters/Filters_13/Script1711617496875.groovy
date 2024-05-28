import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

CustomKeywords.'com.helper.common.CommonMethod.logIntoApplication'()

WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))

WebUI.click(findTestObject('Filters/Filter_Button'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Filters/lehangaCholiCheckbox'))

WebUI.click(findTestObject('Filters/filterButtonIcon'))

CustomKeywords.'com.helper.common.CommonMethod.highlightElement'(findTestObject('Object Repository/Filters/activeIconFilters'))
WebUI.delay(2)
WebUI.verifyElementPresent(findTestObject('Object Repository/Filters/activeIconFilters'), 0)
WebUI.closeBrowser()

