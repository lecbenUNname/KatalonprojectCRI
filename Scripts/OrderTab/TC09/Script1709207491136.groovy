import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
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

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Object Repository/OrderTab/Page_Orders/a_View_1'))

WebUI.scrollToPosition(0, 500)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Order detail 10000704/td_1'), 0)

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderTab/Page_Order detail 10000704/td_1'), 
    30)

highlightElement(element)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Order detail 10000704/td_Total_align-middle'), 
    0)

WebElement element1 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderTab/Page_Order detail 10000704/td_Total_align-middle'), 
    30)

highlightElement(element1)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Order detail 10000704/td_Testing Product'), 0)

WebElement element2 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderTab/Page_Order detail 10000704/td_Testing Product'), 
    30)

highlightElement(element2)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Order detail 10000704/td_Rs.400.00'), 0)

WebElement element3 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderTab/Page_Order detail 10000704/td_Rs.400.00'), 
    30)

highlightElement(element3)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Order detail 10000704/td_1'), 0)

WebElement element4 = WebUiBuiltInKeywords.findWebElement(findTestObject('OrderTab/Page_classicculture/td_2'), 30)

highlightElement(element4)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Order detail 10000704/td_Rs.400.00_1'), 0)

WebElement element5 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderTab/Page_Order detail 10000704/td_Rs.400.00_1'), 
    30)

highlightElement(element5)

WebUI.closeBrowser()

void highlightElement(WebElement element) {
    String originalStyle = element.getAttribute('style')

    JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)

    WebUI.delay(1)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}

