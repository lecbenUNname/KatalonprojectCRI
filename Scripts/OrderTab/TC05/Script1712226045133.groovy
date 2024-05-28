import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.maximizeWindow()

String URLTO = WebUI.getUrl()
if (URLTO.contains("crazystylezs") || URLTO.contains("myshopings"))
	 {
	WebUI.click(findTestObject('Object Repository/OrderTab/Page_Orders/AllowCookiesButton'))
}

WebUI.click(findTestObject('ChangePassword/Page_classicculture/AccountButton'))

WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Login/input_Create one_email'), GlobalVariable.UserName)

WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Login/input_Create one_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/OrderTab/Page_Login/button_Login'))

WebUI.click(findTestObject('ChangePassword/Page_classicculture/AccountButton'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Object Repository/OrderTab/Page_Account information/a_Orders'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Orders/td_20240320 0303'), 0)

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderTab/Page_Orders/td_20240320 0303'), 
    30)

highlightElement(element)

time1 = WebUI.getText(findTestObject('Object Repository/OrderTab/Page_Orders/td_20240320 0303'))

println(time1)

WebUI.click(findTestObject('Object Repository/OrderTab/Page_Orders/a_View'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Order detail 10000800/strong_0303 20032024'), 
    0)

WebElement element1 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderTab/Page_Order detail 10000800/strong_0303 20032024'), 
    30)

highlightElement(element1)

time2 = WebUI.getText(findTestObject('Object Repository/OrderTab/Page_Order detail 10000800/strong_0303 20032024'))

println(time2)

if ((time1.contains('AM') || time1.contains('PM')) && (time2.contains('AM') || time2.contains('PM'))) {
    System.out.println('Both time contain AM or PM.')
} else {
    System.out.println('The time does not contain AM or PM.')

    KeywordUtil.markFailed('This test case is intentionally marked as failed.')
}

WebUI.closeBrowser()

void highlightElement(WebElement element) {
    String originalStyle = element.getAttribute('style')

    JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)

    WebUI.takeScreenshot()

    WebUI.delay(1)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}

