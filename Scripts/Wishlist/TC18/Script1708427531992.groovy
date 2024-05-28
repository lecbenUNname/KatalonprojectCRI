import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_Traditional Wear Lehanga CholiMaxi DressSarees'))

WebUI.mouseOver(findTestObject('Wishlist/Page_Crazystylezs/div_Hot                                    _6fe5af_1'))

WebUI.click(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/a_Sarees_action-btn hover-up js-add-to-wish_cea609'))

WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_All Categories                         _72f775'))

WebUI.click(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/a_Wishlist'))

String currentUrl = WebUI.getUrl()

println(currentUrl)

WebUI.click(findTestObject('Object Repository/Wishlist/Page_Wishlist/a_Women Yellow Bandhani Printed Maxi Dress'))

String currentUrl1 = WebUI.getUrl()

println(currentUrl1)

String title=WebUI.getText(findTestObject('Wishlist/TitleOfPrd'))
println(title)

WebUI.scrollToElement(findTestObject('Wishlist/Header1'), 0)

WebUI.click(findTestObject('Login/Page_Crazystylezs (1)/a_Wishlist'))
if(currentUrl.contains("wishlist")) 
	{
if(currentUrl1.contains(title))
{

WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

WebUI.mouseOver(findTestObject('Login/Page_Account information/a_Sign out'))

WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
}
	}
	else
	{
		KeywordUtil.markFailed("Incorrect Url")
		WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))
		
		WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))
		
		WebUI.mouseOver(findTestObject('Login/Page_Account information/a_Sign out'))
		
		WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
	}
WebUI.closeBrowser()

