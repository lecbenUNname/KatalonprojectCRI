import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Login/input_Create one_email'), GlobalVariable.UserName2)

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Login/input_Create one_password'), GlobalVariable.Password2)

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Login/button_Login'))

WebUI.click(findTestObject('ChangePassword/Page_classicculture/AccountButton'))

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Account information/a_Change password'))

WebUI.scrollToPosition(0, 300)

WebUI.verifyElementPresent(findTestObject('Object Repository/ChangePassword/Page_Change Password/label_Current password'), 
    0)

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/ChangePassword/Page_Change Password/label_Current password'), 
    30)

highlightElement(element)

WebUI.verifyElementPresent(findTestObject('Object Repository/ChangePassword/Page_Change Password/label_New password'), 0)

WebElement element1 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/ChangePassword/Page_Change Password/label_New password'), 
    30)

highlightElement(element1)

WebUI.verifyElementPresent(findTestObject('Object Repository/ChangePassword/Page_Change Password/label_Password confirmation'), 
    0)

WebElement element2 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/ChangePassword/Page_Change Password/label_Password confirmation'), 
    30)

highlightElement(element2)

WebUI.closeBrowser()

void highlightElement(WebElement element) {
    String originalStyle = element.getAttribute('style')

    JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)

    WebUI.delay(1)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}

