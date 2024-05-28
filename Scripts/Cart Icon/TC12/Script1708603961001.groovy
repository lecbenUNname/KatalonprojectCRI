import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Cart Icon/Common Test cases'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Cart Icon/Page_Crazystylezs/li_Product                                 _c208e7'))

WebUI.scrollToPosition(0, 600)

WebUI.mouseOver(findTestObject('Object Repository/Cart Icon/Cart_img'))

WebUI.click(findTestObject('Object Repository/Cart Icon/Cart_add'))

WebUI.scrollToPosition(0, 50)

WebUI.click(findTestObject('Object Repository/Cart Icon/Cart_Toastercloser'))

WebUI.mouseOver(findTestObject('Object Repository/Cart Icon/Cart_icon'))

WebUI.delay(3)
WebUI.mouseOver(findTestObject('Object Repository/Cart Icon/Cart_View'))

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/Cart Icon/Cart_View'),
	0)

highlightElement(element)

WebUI.click(findTestObject('Object Repository/Cart Icon/Cart_Viewcartbutton'))

WebUI.scrollToPosition(0,200)

WebUI.mouseOver(findTestObject('Object Repository/Cart Icon/Cart_viewcarttable'))

WebElement element1 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/Cart Icon/Cart_viewcarttable'),
	0)

highlightElement(element1)

WebUI.closeBrowser()

void highlightElement(WebElement element) {
	String originalStyle = element.getAttribute('style')

	JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

	js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)

	WebUI.delay(2)

	js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}
