import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonLoginPage/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('CommonTestCases/mouseoveruserimage'))

WebUI.mouseOver(findTestObject('Object Repository/BrowserAllCategories/OrderReturnReques/Page_Account information/a_My Account'))

WebUI.click(findTestObject('Object Repository/OverView/Account_dropdown'))

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('Object Repository/BrowserAllCategories/OrderReturnReques/Page_Account information/Page_Account information/a_Order return requests (1)'))

WebUI.delay(2)

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderReturnRequest/Page_Order Return Requests (2)/Order_id'), 30)

highlightElement(element)

WebUI.closeBrowser()

void highlightElement(WebElement element) {
	String originalStyle = element.getAttribute('style')

	JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

	js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)
WebUI.takeScreenshot()
	WebUI.delay(1)

	js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}

WebUI.closeBrowser()

