import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Review/input_All Categories_q'), 'test 01')

WebUI.sendKeys(findTestObject('Object Repository/Review/input_All Categories_q'), Keys.chord(Keys.ENTER))

WebUI.scrollToPosition(0, 350)

WebUI.click(findTestObject('Object Repository/Review/img_Rating high to low_hover-img'))
// goes to product image


//WebUI.click(findTestObject('Object Repository/Review/Page_Testing Product/a_Reviews (11)'))
//
//WebUI.scrollToPosition(0, 1600)


WebUI.scrollToPosition(0, 1200)

WebUI.click(findTestObject('Object Repository/Review/Page_Testing Product/a_Reviews (11)'))




WebUI.scrollToPosition(0, 1400)

WebUI.mouseOver(findTestObject('Review/ImageTabInReview'))

WebUI.click(findTestObject('Review/FirstImageInReview'))

WebUI.scrollToElement(findTestObject('Review/CloseButtonInReviewImage'), 0)

WebUI.click(findTestObject('Review/CloseButtonInReviewImage'))

//WebUI.click(findTestObject('Review/FifthImage'))

//WebUI.click(findTestObject('Review/CloseButtonInReviewImage'))
try
{

WebUI.verifyElementPresent(findTestObject('Review/ViewMore'), 0)
}
catch(Exception e)
{
	KeywordUtil.markFailed("View more option is not there")
}
WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

WebUI.closeBrowser()

