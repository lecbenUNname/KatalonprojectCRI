import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

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

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/OrderTab/Page_Orders/a_View'))

WebUI.scrollToPosition(0, 300)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Order detail 10000656/h5_Order detail 10000656'), 
    0)

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderTab/Page_Order detail 10000656/h5_Order detail 10000656'), 
    30)

highlightElement(element)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Order detail 10000656/div_Order status Completed'), 
    0)

WebElement element1 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderTab/Page_Order detail 10000656/div_Order status Completed'), 
    30)

highlightElement(element1)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Order detail 10000656/div_Payment method  Online transfer'), 
    0)

WebElement element2 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderTab/Page_Order detail 10000656/div_Payment method  Online transfer'), 
    30)

highlightElement(element2)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Order detail 10000656/div_Payment status  Completed'), 
    0)

WebElement element3 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderTab/Page_Order detail 10000656/div_Payment status  Completed'), 
    30)

highlightElement(element3)

WebUI.closeBrowser()

void highlightElement(WebElement element) {
    String originalStyle = element.getAttribute('style')

    JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)

    WebUI.delay(1)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}

