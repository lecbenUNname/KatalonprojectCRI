import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/input_All Categories_q'), GlobalVariable.WLsrchProd)

WebUI.sendKeys(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/input_All Categories_q'), Keys.chord(Keys.ENTER))

WebUI.scrollToPosition(0, 320)

WebUI.mouseOver(findTestObject('Wishlist/ImagePath'))

WebUI.click(findTestObject('Object Repository/Wishlist/Page_Retro Typewriter Keyboard, 7KEYS Elect_cd9c1b/i_Buy Now_fi-rs-heart'))

WebUI.click(findTestObject('Object Repository/Wishlist/Page_Retro Typewriter Keyboard, 7KEYS Elect_cd9c1b/a_Wishlist'))

WebUI.scrollToPosition(0, 320)

try {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Wishlist/Page_Wishlist/th_Price'), 0)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Wishlist/Page_Wishlist/th_Stock Status'), 0)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Wishlist/Page_Wishlist/th_Action'), 0)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Wishlist/Page_Wishlist/th_Remove'), 0)

    WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))
}
catch (Exception e) {
    KeywordUtil.markFailed('FAiled because ')
} 

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

WebUI.mouseOver(findTestObject('Login/Page_Account information/a_Sign out'))

WebUI.click(findTestObject('Login/Page_Account information/a_Sign out'))

WebUI.closeBrowser()

