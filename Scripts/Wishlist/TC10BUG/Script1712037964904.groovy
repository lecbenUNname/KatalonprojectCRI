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

WebUI.mouseOver(findTestObject('Wishlist/Page_Crazystylezs/div_Hot                                    _6fe5af_1'))

WebUI.click(findTestObject('Wishlist/Page_Crazystylezs/a_Sarees_action-btn hover-up js-add-to-wish_cea609'))

String ac=WebUI.getText(findTestObject('Wishlist/alertaddedsuccessfully'))
highlightElement(findTestObject('Wishlist/alertaddedsuccessfully'))
println(ac)

	
 if(ac.contains("wishlist"))
 {
	 WebUI.click(findTestObject('Wishlist/Page_Crazystylezs/a_Wishlist'))
	 
	 WebUI.click(findTestObject('Object Repository/Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))
	 
	 WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))
	 
	 WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Account information/a_Sign out'))
	 
	 WebUI.click(findTestObject('Object Repository/Wishlist/Page_Account information/a_Sign out'))
	 

 }
 else
 {
	 KeywordUtil.markFailed("Failed because wrong alert")
	 WebUI.click(findTestObject('Wishlist/Page_Crazystylezs/a_Wishlist'))
	 
	 WebUI.click(findTestObject('Object Repository/Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))
	 
	 WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))
	 
	 WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Account information/a_Sign out'))
	 
	 WebUI.click(findTestObject('Object Repository/Wishlist/Page_Account information/a_Sign out'))
	 
	
 }
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


