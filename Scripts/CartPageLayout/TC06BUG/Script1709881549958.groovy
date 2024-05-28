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
//highlightElement(findTestObject('CartLayout/AlertBoxAddedCart'))
WebUI.click(findTestObject('CartLayout/CartIcon2'))
//highlightElement(findTestObject('CartLayout/AlertBoxAddedCart'))
WebUI.click(findTestObject('CartLayout/CartIcon2'))
highlightElement(findTestObject('CartLayout/AlertBoxAddedCart'))
actualAlert = 'This product already exists.'

alertText = WebUI.getText(findTestObject('CartLayout/AlertBoxAddedCart'))


if (alertText.contains(actualAlert)) {
	println('The Alertproductname contains the productName.')
	WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))
	
	WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

	
	
	
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))
	
	WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
	
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
	
	WebUI.closeBrowser()
	
}
else {
	
	KeywordUtil.markFailed("Alert message is inappropriate")
	WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))
	
	WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))
	
	
	
	WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))
	
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

