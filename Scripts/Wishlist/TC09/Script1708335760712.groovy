import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_Traditional Wear Lehanga CholiMaxi DressSarees'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_Hot                                    _6fe5af'))

WebUI.click(findTestObject('Wishlist/WshlistBtnO'))

String ei = WebUI.getText(findTestObject('Wishlist/ImageText1'))

println(ei)

WebUI.mouseOver(findTestObject('Object Repository/Login/Page_Register/Page_Login/Page_Women Yellow Bandhani Printed Maxi Dress/productimage'))

WebUI.click(findTestObject('Object Repository/Login/Page_Register/Page_Login/Page_Women Yellow Bandhani Printed Maxi Dress/productimage'))

String eii = WebUI.getText(findTestObject('Wishlist/ImageText'))

println(eii)

//WebUI.click(findTestObject('Object Repository/Wishlist/Page_Women Yellow Bandhani Printed Maxi Dress/a_Buy Now_action-btn hover-up js-add-to-wis_004c45'))
WebUI.click(findTestObject('Wishlist/WshlistOnPRdPage'))

TestObject WishlistPart = findTestObject('Object Repository/Wishlist/WishlistPart')

WebUI.click(findTestObject('Wishlist/Page_Crazystylezs/a_Wishlist'))

WebUI.findWebElement(findTestObject('Wishlist/WishlistPart'), 0)

String ai = WebUI.getText(findTestObject('Wishlist/Ai'))

println(ai)

String ai1 = WebUI.getText(findTestObject('Wishlist/Ai1'))

println(ai1)

if (ei.equals(ai) && eii.equals(ai1)) {
    WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))
	WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

    
} 
else
	 {
	KeywordUtil.markFailed("failed")
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))
	WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))
	
    WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

    WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

    
}

WebUI.closeBrowser()