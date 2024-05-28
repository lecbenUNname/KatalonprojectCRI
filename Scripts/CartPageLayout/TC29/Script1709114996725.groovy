import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

WebUI.mouseOver(findTestObject('CartLayout/SecondProduct'))
WebUI.click(findTestObject('CartLayout/SecondProduct'))
//WebUI.mouseOver(findTestObject('CartLayout/CartIcon/CartIconSecondPrdInHP'))
//WebUI.click(findTestObject('CartLayout/CartIcon/CartIconSecondPrdInHP'))
//WebUI.click(findTestObject('CartLayout/CartIcon/CartIconSecondPrdInHP'))
String i=WebUI.getText(findTestObject('CartLayout/HeadingPrdPage'))
println(i)

WebUI.click(findTestObject('CartLayout/AddToCartButtonInProductPage'))

WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

String j = WebUI.getText(findTestObject('CartLayout/CartPrdName'))

println(j)
if(i.equals(j))
{
//WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
}
else
{
	KeywordUtil.markFailed("FAiled because title mismatch")
	WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))
	
	WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))
	
	WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
	
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
}
WebUI.closeBrowser()

