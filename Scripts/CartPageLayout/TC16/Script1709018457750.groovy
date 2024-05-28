import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Review/input_All Categories_q'), GlobalVariable.CartTestingPrd2)

WebUI.sendKeys(findTestObject('Object Repository/Review/input_All Categories_q'), Keys.chord(Keys.ENTER))

WebUI.scrollToPosition(0, 350)

WebUI.click(findTestObject('Object Repository/Review/img_Rating high to low_hover-img'))

WebUI.scrollToPosition(0, 800)

WebUI.click(findTestObject('CartLayout/Page_Testing Product/span'))

WebUI.click(findTestObject('Object Repository/CartLayout/Page_Testing Product/button_Add to cart'))


WebUI.verifyElementPresent(findTestObject('CartLayout/AlertBoxAddedCart'), 0)
String i = WebUI.getText(findTestObject('Wishlist/alertaddedsuccessfully'))

println(i)

productName = WebUI.getText(findTestObject('CartLayout/Headinggcart'))

println(productName)

// Extract the desired text from 'alertProductName'
String prefix = 'Added product '

String suffix = ' to cart successfully!'

// yellow dress
// Check if alertProductName is not null before performing operations on it
Alertproductname = i.replace(prefix, '').replace(suffix, '').trim()
println(Alertproductname)
// Perform the comparison
if(WebUI.verifyElementPresent(findTestObject('CartLayout/AlertBoxAddedCart'), 0))
{
if (i.contains(productName)) {
	WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))
	
			WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))
	
			WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))
	
			WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
	
			WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
   

}
}
 else {
	KeywordUtil.markFailed('Incorrect alert')

	WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

	WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

	WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

	WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

	WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
}

WebUI.closeBrowser()

