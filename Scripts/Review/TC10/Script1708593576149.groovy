import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/a_Electronics Accessories'))

WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Electronics Accessories/div_Hot Computer Accessories Retro Typewrit_383be2'))

WebUI.scrollToPosition(0, 300)

WebUI.mouseOver(findTestObject('Object Repository/Review/RetroTypeWriterImageLink'))

WebUI.click(findTestObject('Object Repository/Review/RetroTypeWriterImageLink'))

WebUI.scrollToPosition(0, 1200)

WebUI.click(findTestObject('Object Repository/Review/Page_Women Yellow Bandhani Printed Maxi Dress/a_Reviews (0)'))

WebUI.scrollToPosition(0, 1400)

WebUI.click(findTestObject('Review/Page_Women Yellow Bandhani Printed Maxi Dress/textarea_Quality_comment'))

WebUI.setText(findTestObject('Object Repository/Review/Page_Retro Typewriter Keyboard, 7KEYS Elect_cd9c1b/textarea_Quality_comment'), 
    'Test\n')

WebUI.sendKeys(findTestObject('Review/Upload/upload'), 'C:\\Users\\Lavanya\\Downloads\\pexels-burst-373912.jpg')
String txt=WebUI.getText(findTestObject('Review/UploadImagemoreKbAlert'), FailureHandling.STOP_ON_FAILURE)
String actualText="greater than 2048 kilobytes."
if(txt.contains(actualText))
{
	WebUI.verifyElementPresent(findTestObject('Review/UploadImagemoreKbAlert'), 0)

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

}
else
{
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))
	
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
	
	WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
	KeywordUtil.markFailed("Incorrect toaster message")
}


WebUI.closeBrowser()
