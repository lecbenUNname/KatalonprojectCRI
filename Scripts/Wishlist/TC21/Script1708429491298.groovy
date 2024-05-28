import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_Traditional Wear Lehanga CholiMaxi DressSarees'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_Hot                                    _6fe5af_1'))
String urll=WebUI.getUrl()
println(urll)
WebUI.click(findTestObject('Wishlist/Page_Crazystylezs/div_Hot                                    _6fe5af_1'))

String url=WebUI.getUrl()
println(url)

DriverFactory.getWebDriver().navigate().back()
String url1=WebUI.getUrl()
println(url1)
if(urll.equals(url1))
{
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))
	
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
	
	WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
}
else
{
	KeywordUtil.markFailed("Failed because wrong navigation")
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))
	
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
	
	WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
}

WebUI.closeBrowser()

