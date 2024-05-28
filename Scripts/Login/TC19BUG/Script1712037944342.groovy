import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Url)

String URLTO = WebUI.getUrl()

if (URLTO.contains('crazystylezs') || URLTO.contains('myshopings')) {
    WebUI.click(findTestObject('Object Repository/commonlogin/Page_Crazystylezs/Page_Crazystylezs/button_Allow cookies'))
}

WebUI.mouseOver(findTestObject('Object Repository/Login/Page_Crazystylezs/span_Account'))

boolean x = WebUI.verifyElementPresent(findTestObject('Object Repository/Login/AcntDrpDwnLoginButton'), 1, FailureHandling.OPTIONAL)

if (x != true) {
    KeywordUtil.markFailed()
} else {
    WebUI.click(findTestObject('Object Repository/Login/AcntDrpDwnLoginButton'))
}

WebUI.click(findTestObject('Object Repository/Login/Page_Login/input_Create one_email'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Login/input_Create one_email'), GlobalVariable.UserName)

String i = WebUI.getAttribute(findTestObject('Object Repository/Login/Page_Login/input_Create one_email'), 'value')

println(i)

WebUI.scrollToElement(findTestObject('Object Repository/Login/Page_Login/h1_Login'), 0)

WebUI.click(findTestObject('Object Repository/Login/Page_Login/input_Create one_password'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Login/input_Create one_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Login/Page_Login/label_Remember me'))

highlightElement(findTestObject('Object Repository/Login/LoginContainer'))

//findTestObject('Object Repository/Login/LoginContainer')
WebUI.click(findTestObject('Object Repository/Login/Page_Login/button_Login'))

WebUI.mouseOver(findTestObject('Object Repository/Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Object Repository/Login/Page_Account information/a_Sign out'))

WebUI.click(findTestObject('Object Repository/Login/Page_Account information/a_Sign out'))

WebUI.mouseOver(findTestObject('Object Repository/Login/Page_Crazystylezs/a_Account'))

WebUI.click(findTestObject('Object Repository/Login/Page_Crazystylezs/a_Login'))

String j = WebUI.getAttribute(findTestObject('Object Repository/Login/Page_Login/input_Create one_email'), 'value')

println(j)

if (i.equals(j)) {
    KeywordUtil.markPassed('Passed because the login and email are passed')
} else {
    KeywordUtil.markFailed('Passed because the login and email are not passed')
}

highlightElement(findTestObject('Object Repository/Login/LoginContainer'))

WebUI.closeBrowser()

def highlightElement(TestObject yourElement) {
    WebElement element = WebUiBuiltInKeywords.findWebElement(yourElement, 30)

    String originalStyle = element.getAttribute('style')

    JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 3px solid red; ' + originalStyle) + '\');', element)

    WebUI.takeScreenshot()

    js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 3px solid blue; ' + originalStyle) + '\');', element)

    WebUI.delay(1)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}

