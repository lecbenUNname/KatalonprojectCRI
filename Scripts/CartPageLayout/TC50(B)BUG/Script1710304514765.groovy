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

WebUI.mouseOver(findTestObject('CartLayout/SecondProduct'))

WebUI.click(findTestObject('CartLayout/SecondProduct'))

WebUI.click(findTestObject('CartLayout/AddToCartButtonInProductPage'))

WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))
highlightElement(findTestObject('Object Repository/CartLayout/objhighlightincartpage'))

try {
	
	WebUI.verifyElementPresent(findTestObject('CartLayout/SizeLabel'), 0)
	 }
 catch (Exception E) 
 {
		
KeywordUtil.markFailed('Case Failed')
}
WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

	 WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

	 WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

	 WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

	 WebUI.closeBrowser()
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