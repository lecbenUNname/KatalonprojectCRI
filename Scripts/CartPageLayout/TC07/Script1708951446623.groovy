import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/CartLayout/input_All Categories_q'), GlobalVariable.CartTestingPrd)

WebUI.sendKeys(findTestObject('Object Repository/CartLayout/input_All Categories_q'), Keys.chord(Keys.ENTER))

WebUI.scrollToPosition(0, 350)

WebUI.click(findTestObject('Object Repository/Review/img_Rating high to low_hover-img'))

boolean check = WebUI.verifyElementClickable(findTestObject('Object Repository/CartLayout/AddToCartButtonInProductPage'),FailureHandling.OPTIONAL)

if (check)
{
	KeywordUtil.markFailed('')
}

    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

    WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

    WebUI.closeBrowser()
