import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_Traditional Wear Lehanga CholiMaxi DressSarees'), 
    0)

WebUI.mouseOver(findTestObject('Wishlist/Page_Crazystylezs/div_Hot                                    _6fe5af_1'))

WebUI.click(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/a_Sarees_action-btn hover-up js-add-to-wish_cea609'))


WebUI.mouseOver(findTestObject('Wishlist/Page_Crazystylezs/a_Wishlist'))
WebUI.click(findTestObject('Wishlist/Page_Women Olive Poly-Silk Volume Control E_4657fb/a_Wishlist'))

String i=WebUI.getText(findTestObject('Wishlist/wshlstcount'))
List<WebElement> remove = WebUI.findWebElements(findTestObject('Wishlist/RemoveButton'), 30)

String j = remove.size()
println(j)

println(i)

if(i.equals(j))
{
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))
	
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
	
	WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
	
}
else
{
	KeywordUtil.markFailed("Failed because count of the wishlist is not visible")
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))
	
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))
	
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
	
	WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
	
}
//WebUI.click(findTestObject('Wishlist/Page_Women Olive Poly-Silk Volume Control E_4657fb/a_Wishlist'))


WebUI.closeBrowser()

