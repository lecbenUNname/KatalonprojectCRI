import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

WebUI.mouseOver(findTestObject('CartLayout/SecondProduct'))

WebUI.click(findTestObject('CartLayout/SecondProduct'))
//
//WebUI.mouseOver(findTestObject('CartLayout/ElectronicAccessories'))
//
//WebUI.click(findTestObject('CartLayout/ElectronicAccessories'))
//
//WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Electronics Accessories/div_Hot Computer Accessories Retro Typewrit_383be2'))
//
//WebUI.click(findTestObject('Wishlist/Page_Electronics Accessories/div_Hot Computer Accessories Retro Typewrit_383be2'))
//
WebUI.click(findTestObject('CartLayout/AddToCartButtonInProductPage'))

WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

WebUI.verifyElementPresent(findTestObject('CartLayout/AlertBoxAddedCart'), 0)
String rm=WebUI.getText(findTestObject('CartLayout/AlertBoxAddedCart'))

println(rm)
String expText="Removed item from cart successfully!"
if(rm.equals(expText))
{
WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
}
else
{
	KeywordUtil.markFailed("Failed because of wrong statement")
	WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))
	
	WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
	
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
}
WebUI.closeBrowser()

