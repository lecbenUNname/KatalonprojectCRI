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

WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/img_Sarees_hover-img'))

WebUI.click(findTestObject('Object Repository/Login/Page_Register/Page_Login/Page_Women Yellow Bandhani Printed Maxi Dress/productimage'))

WebUI.click(findTestObject('Object Repository/Wishlist/WishlistProductButton'))

WebUI.mouseOver(findTestObject('Wishlist/Page_Crazystylezs/a_Wishlist'))

WebUI.click(findTestObject('Wishlist/Page_Crazystylezs/a_Wishlist'))



List<WebElement> remove = WebUI.findWebElements(findTestObject('Wishlist/RemoveButton'), 30)

String i = remove.size()

println(i)

String header=WebUI.getText(findTestObject('Wishlist/HeadingText'))
println(header)
String prefix = 'There are '

String suffix = ' products in this list'

// yellow dress
// Check if alertProductName is not null before performing operations on it
String productCount = header.replace(prefix, '').replace(suffix, '').trim()
println(productCount)
if(productCount.equals(i))
{
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))
	
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))
	
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))
	
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
	
	WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
	
}
else
{
	KeywordUtil.markFailed("The count of the product is not matched")
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))
	
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))
	
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))
	
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
	
	WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
	
}


WebUI.closeBrowser()

