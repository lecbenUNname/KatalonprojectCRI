import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling

WebUI.callTestCase(findTestCase('CommonLoginPage/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Searchbar/Page_Crazystylezs/a_Product'))
WebUI.scrollToPosition(0, 1000)

WebUI.mouseOver(findTestObject('OrderReturnRequest/Page_Order Return Requests (2)/Page_Products/a_White Floral Georgette Maternity Maxi Dress'))

WebUI.click(findTestObject('OrderReturnRequest/Page_Order Return Requests (2)/Page_Products/a_White Floral Georgette Maternity Maxi Dress'))

WebUI.scrollToPosition(0, 600)

WebUI.setText(findTestObject('Object Repository/OrderReturnRequest/Page_Order Return Requests (2)/Page_White Floral Georgette Maternity Maxi Dress/input_Availability_qty'),
	'90')

WebUI.click(findTestObject('Object Repository/OrderReturnRequest/Page_Order Return Requests (2)/Page_White Floral Georgette Maternity Maxi Dress/button_Add to cart'))

WebUI.takeScreenshot()

boolean x = WebUI.verifyElementPresent(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Alertmessage'),1, FailureHandling.OPTIONAL)

if (!x) {
	KeywordUtil.markFailed('Product quantity limitation toaster message did not show correctly')
}

WebUI.scrollToElement(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/a_Cart'),0)

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/a_Cart'))

//WebUI.scrollToElement(findTestObject('Object Repository/ProductPageLayout/rmvbtnCartPage'),0)

WebUI.click(findTestObject('Object Repository/ProductPageLayout/rmvbtnCartPage'))

//WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Blue Floral Printed Maxi Dress/span_Account'))
//
//WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Shopping Cart/a_Sign out'))
//
//WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Shopping Cart/a_Sign out'))

WebUI.closeBrowser()
