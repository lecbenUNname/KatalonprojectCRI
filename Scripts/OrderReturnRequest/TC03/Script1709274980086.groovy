import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonLoginPage/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('CommonTestCases/mouseoveruserimage'))

WebUI.click(findTestObject('Object Repository/BrowserAllCategories/OrderReturnReques/Page_Crazystylezs/a_My Account'))

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('BrowserAllCategories/OrderReturnReques/Page_Account information/a_Order return requests'), FailureHandling.STOP_ON_FAILURE)

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('OrderReturnRequest/OrderReturnReques/Page_Order Return Requests/div_Order Return Requests ID number Order I_07d1d5'), 
    30)

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

