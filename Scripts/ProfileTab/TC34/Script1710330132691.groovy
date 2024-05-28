import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('ProfileTab/Profile Tab common'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Profiletab/Page_Account information/a_Profile'), 0)

WebUI.scrollToPosition(0, 150)

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Account information/a_Profile'))

WebUI.setText(findTestObject('Object Repository/Profiletab/Page_Profile/input_name'), 'raja')

WebUI.scrollToPosition(0, 250)

WebUI.setText(findTestObject('Object Repository/Profiletab/Page_Profile/input_phone'), '7896544123')

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_Profile/strong_rajarajakannapparprasanthkumarvarman'))

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/Profiletab/Page_Profile/strong_rajarajakannapparprasanthkumarvarman'),
	30)

highlightElement(element)

WebUI.closeBrowser()

void highlightElement(WebElement element) {
	String originalStyle = element.getAttribute('style')

	JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

	js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)

	WebUI.delay(3)

	js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}
