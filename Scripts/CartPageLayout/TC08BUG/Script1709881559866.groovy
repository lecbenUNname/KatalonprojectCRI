import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

WebUI.mouseOver(findTestObject('Object Repository/CartLayout/SecondProduct'))

WebUI.mouseOver(findTestObject('CartLayout/CartIcon2'))

WebUI.click(findTestObject('CartLayout/CartIcon2'))
highlightElement(findTestObject('CartLayout/CartIcon2'))
if(WebUI.verifyElementPresent(findTestObject('CartLayout/AlertBoxAddedCart'), 0))
{
	KeywordUtil.markFailed('When the user clicks the "Add" button on the product page, the product is immediately added to the cart without prompting for size and color selection. ')
	WebUI.mouseOver(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))
	
	WebUI.click(findTestObject('Object Repository/CartLayout/Page_Crazystylezs/a_Cart'))
	
	WebUI.mouseOver(findTestObject('Object Repository/CartLayout/Page_Shopping Cart/div_Product Unit Price Quantity Subtotal Re_834775'))
	
	WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))
	
	WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))
	
	WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
	
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
	
	WebUI.closeBrowser()
}
else
{
	WebUI.mouseOver(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))
	
	WebUI.click(findTestObject('Object Repository/CartLayout/Page_Crazystylezs/a_Cart'))
	
	WebUI.mouseOver(findTestObject('Object Repository/CartLayout/Page_Shopping Cart/div_Product Unit Price Quantity Subtotal Re_834775'))
	
	WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))
	
	WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))
	
	WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
	
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
	
	WebUI.closeBrowser()
}
def	highlightElement(TestObject yourElement) {
	
		   WebElement element = WebUiBuiltInKeywords.findWebElement(yourElement, 30)
	
		   String originalStyle = element.getAttribute('style')
	
		   JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)
	
		   js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 3px solid red; ' + originalStyle) + '\');', element)
	
		   WebUI.takeScreenshot()
		   js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 3px solid blue; ' + originalStyle) + '\');', element)
		   WebUI.delay(1)
	
		   js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
	   }
