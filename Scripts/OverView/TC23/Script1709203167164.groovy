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

WebUI.mouseOver(findTestObject('Object Repository/OverView/Page_Crazystylezs/a_My Account'))

WebUI.click(findTestObject('Object Repository/OverView/Page_Crazystylezs/a_My Account'))

WebUI.click(findTestObject('Object Repository/OverView/Page_Account information/a_Overview'))

WebUI.scrollToPosition(0, 300)

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('CommonTestCases/mouseoveruserimage'), 30)

highlightElement(element)

WebUI.delay(3)

WebUI.closeBrowser()

void highlightElement(WebElement element) {
    String originalStyle = element.getAttribute('style')

    JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)
WebUI.takeScreenshot()
    WebUI.delay(1)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}

