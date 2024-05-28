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

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Object Repository/BrowserAllCategories/OrderReturnReques/Page_Crazystylezs/a_My Account'))

WebUI.click(findTestObject('OverView/Account_dropdown'))

WebUI.scrollToPosition(0, 500)

WebUI.verifyElementText(findTestObject('BrowserAllCategories/OrderReturnReques/Page_Account information/a_Order return requests'), 
    'Order return requests')

WebUI.mouseOver(findTestObject('BrowserAllCategories/OrderReturnReques/Page_Account information/a_Order return requests'))

WebUI.click(findTestObject('BrowserAllCategories/OrderReturnReques/Page_Account information/a_Order return requests'))

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderReturnRequest/Page_Order Return Requests (2)/Order_Return_Request'),10)
highlightElement(element)
WebUI.takeScreenshot()
WebUI.delay(3)
WebUI.closeBrowser()

void highlightElement(WebElement element) {
	String originalStyle = element.getAttribute('style')

	JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

	js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)

	WebUI.delay(1)

	js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}


