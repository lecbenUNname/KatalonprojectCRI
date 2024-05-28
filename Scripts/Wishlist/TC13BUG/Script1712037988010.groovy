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

WebUI.scrollToElement(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_Traditional Wear Lehanga CholiMaxi DressSarees'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_Hot                                    _6fe5af'))


WebUI.click(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_Hot                                    _6fe5af'))


WebUI.scrollToPosition(0, 1000)

WebUI.mouseOver(findTestObject('Wishlist/Page_Women Yellow Bandhani Printed Maxi Dress/i_Buy Now_fi-rs-heart'))
highlightElement(findTestObject('Wishlist/Page_Women Yellow Bandhani Printed Maxi Dress/i_Buy Now_fi-rs-heart'))
try {
    WebUI.verifyElementPresent(findTestObject('Wishlist/TooltipOfWshlistInProdctPage'), 0)
}
catch (Exception e) {
    KeywordUtil.markFailed('This test case is intentionally marked as failed.')
} 

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

WebUI.mouseOver(findTestObject('Wishlist/Page_Account information/a_Sign out'))

WebUI.click(findTestObject('Wishlist/Page_Account information/a_Sign out'))
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
WebUI.closeBrowser()

