import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('ProfileTab/Profile Tab common'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_Profile/input_email'))

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/Profiletab/Email_id'),
	30)

highlightElement(element)


void highlightElement(WebElement element) {
	String originalStyle = element.getAttribute('style')

	JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

	js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)

	WebUI.delay(2)

	js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

WebUI.navigateToUrl('https://crazystylezs.com/customer/edit-account')

WebUI.closeBrowser()