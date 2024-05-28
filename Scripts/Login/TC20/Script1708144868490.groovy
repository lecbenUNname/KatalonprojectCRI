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


String logInUrl = WebUI.getUrl()

WebUI.click(findTestObject('Object Repository/Login/Page_Login/input_Create one_email'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Login/input_Create one_email'), GlobalVariable.UserName)

String i = WebUI.getAttribute(findTestObject('Object Repository/Login/Page_Login/input_Create one_email'), 'value')

println(i)

WebUI.scrollToElement(findTestObject('Object Repository/Login/Page_Login/h1_Login'), 0)

WebUI.click(findTestObject('Object Repository/Login/Page_Login/input_Create one_password'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Login/input_Create one_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Login/Page_Login/label_Remember me'))


//findTestObject('Object Repository/Login/LoginContainer')
WebUI.click(findTestObject('Object Repository/Login/Page_Login/button_Login'))

String NotlogInUrl = WebUI.getUrl()

if(logInUrl == NotlogInUrl)
{
	KeywordUtil.markFailed()
}

WebUI.closeBrowser()