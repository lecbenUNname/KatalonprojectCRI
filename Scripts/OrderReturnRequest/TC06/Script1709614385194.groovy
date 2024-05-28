import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
WebUI.callTestCase(findTestCase('CommonLoginPage/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Object Repository/CommonTestCases/mouseoveruserimage'))

WebUI.mouseOver(findTestObject('BrowserAllCategories/OrderReturnReques/Page_Account information/a_My Account'))

WebUI.click(findTestObject('Object Repository/OverView/Account_dropdown'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Object Repository/BrowserAllCategories/OrderReturnReques/Page_Account information/a_Orders'))

WebUI.click(findTestObject('Object Repository/BrowserAllCategories/OrderReturnReques/Page_Orders/a_View'))

WebUI.scrollToPosition(0, 300)
WebUI.delay(3)

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/BrowserAllCategories/OrderReturnReques/Time_And_Date'), 30)

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

String elementText = WebUI.getText(findTestObject('Object Repository/BrowserAllCategories/OrderReturnReques/Time_And_Date'))

// Remove numbers, "/", and ":"
String cleanText = elementText.replaceAll("[0-9/:]", "")

// Check if the cleaned text contains "AM" or "PM"
if (cleanText.contains("AM") || cleanText.contains("PM")) {
	println("The text contains 'AM' or 'PM'.")
}
else {
	KeywordUtil.markFailed("Am and Pm not present.")
}


