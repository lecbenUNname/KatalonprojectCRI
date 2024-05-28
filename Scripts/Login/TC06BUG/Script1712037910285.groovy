import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Url)

String URLTO = WebUI.getUrl()
if (URLTO.contains("crazystylezs") || URLTO.contains("myshopings")) {
	WebUI.click(findTestObject('Object Repository/commonlogin/Page_Crazystylezs/Page_Crazystylezs/button_Allow cookies'))
}



WebUI.mouseOver(findTestObject('Object Repository/Login/Page_Crazystylezs/span_Account'))

boolean x = WebUI.verifyElementPresent(findTestObject('Object Repository/Login/AcntDrpDwnLoginButton'), 1, FailureHandling.OPTIONAL)

if(x!= true)
{
	KeywordUtil.markFailed()
}
else {
	WebUI.click(findTestObject('Object Repository/Login/AcntDrpDwnLoginButton'))
}


WebUI.scrollToElement(findTestObject('Login/Page_Register/Page_Login/input_Create one_password'), 0)

highlightElement(findTestObject('Object Repository/Login/LoginButton'))
String loginbtnn = WebUI.getCSSValue(findTestObject('Login/Page_Login/button_Login'), 'background-color')

println(loginbtnn)

WebUI.scrollToElement(findTestObject('Login/Header'), 0)

String BrowseCategories = WebUI.getCSSValue(findTestObject('Login/BrowseCategoriesColor'), 'background-color')

println(BrowseCategories)

try
{
	WebUI.verifyMatch(loginbtnn, BrowseCategories, false)


}
catch(Exception e)
{
	KeywordUtil.markFailed("Colour Mismatch")
	
}

WebUI.closeBrowser()



def	highlightElement(TestObject yourElement) {
	
		   WebElement element = WebUiBuiltInKeywords.findWebElement(yourElement, 30)
	
		   String originalStyle = element.getAttribute('style')
	
		   JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)
	
		   js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 3px solid red; ' + originalStyle) + '\');', element)
	
		   WebUI.takeScreenshot()
		   js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 3px solid blue; ' + originalStyle) + '\');', element)
		   WebUI.delay(1)
	
		   js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
	   }

