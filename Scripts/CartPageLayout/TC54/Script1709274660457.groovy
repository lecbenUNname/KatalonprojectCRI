import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

WebUI.mouseOver(findTestObject('Object Repository/Review/Page_Crazystylezs/div_Hot                                    _6fe5af'))

WebUI.mouseOver(findTestObject('CartLayout/EyeIcon'))

WebUI.click(findTestObject('CartLayout/EyeIcon'))

WebUI.scrollToElement(findTestObject('CartLayout/EyeAddToCart'), 1000)

WebUI.mouseOver(findTestObject('CartLayout/AddToCartEye'))
highlightElement(findTestObject('CartLayout/AddToCartEye'))

WebUI.click(findTestObject('CartLayout/CloseBtn'))
WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

//WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

WebUI.closeBrowser()
def	highlightElement(TestObject yourElement) {
	
		   WebElement element = WebUiBuiltInKeywords.findWebElement(yourElement, 30)
	
		   String originalStyle = element.getAttribute('style')
	
		   JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)
	
		   js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 3px solid red; ' + originalStyle) + '\');', element)
	
		   
		   js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 3px solid blue; ' + originalStyle) + '\');', element)
		   
		   WebUI.mouseOver(yourElement)
		   
		   WebUI.delay(1)
	
		   js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
	   }
