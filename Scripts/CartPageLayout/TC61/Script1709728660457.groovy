import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

//WebUI.mouseOver(findTestObject('Object Repository/Review/Page_Crazystylezs/div_Hot                                    _6fe5af'))
//WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)
//WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

WebUI.mouseOver(findTestObject('CartLayout/SecondProduct'))

WebUI.click(findTestObject('CartLayout/SecondProduct'))

WebUI.scrollToPosition(0, 1000)

WebUI.click(findTestObject('CartLayout/AddToCartButtonInProductPage'))

//WebUI.mouseOver(findTestObject('CartLayout/SecondProduct'))
//
////WebUI.click(findTestObject('CartLayout/SecondProduct'))
//
////WebUI.click(findTestObject('CartLayout/PrdEye'))
////
////WebUI.scrollToElement(findTestObject('CartLayout/AreaPrdScrl'), 1000)
////
////WebUI.click(findTestObject('CartLayout/UpIcon'))
//
//WebUI.click(findTestObject('CartLayout/AddToCartButtonInProductPage'))
//
////WebUI.click(findTestObject('CartLayout/CloseBtn'))

WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

WebUI.click(findTestObject('CartLayout/UpIcon'))

updatecart=WebUI.getText(findTestObject('CartLayout/AlertBoxAddedCart'))

actual='Update cart successfully!'

if(updatecart.contains(actual))
{
	WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))
	//WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))
	
        WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

        WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

        WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
	
	
	
}
else
{
	KeywordUtil.markFailed("Wrong Alert")
	WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))
	
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))
	
	WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
	
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
	
	
}
WebUI.closeBrowser()

