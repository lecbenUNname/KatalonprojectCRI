import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/a_Electronics Accessories'))

WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Electronics Accessories/div_Hot Computer Accessories Retro Typewrit_383be2'))

WebUI.click(findTestObject('Object Repository/Wishlist/WS1'))

WebUI.mouseOver(findTestObject('Wishlist/Header1'))

WebUI.click(findTestObject('Wishlist/Page_Electronics Accessories/a_Wishlist'))

String text=WebUI.getText(findTestObject('Wishlist/Header1'))
println(text)
if(text.contains("Wishlist"))
{

WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
}

else
{
	KeywordUtil.markFailed("FAiled because breadscrum is not clear")
	
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))
	
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))
	
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
	
	WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
	
}

WebUI.closeBrowser()

