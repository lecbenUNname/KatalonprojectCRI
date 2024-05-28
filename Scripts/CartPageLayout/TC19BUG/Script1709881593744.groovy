import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/CartLayout/input_All Categories_q'), GlobalVariable.CartTestingPrd)

WebUI.sendKeys(findTestObject('Object Repository/CartLayout/input_All Categories_q'), Keys.chord(Keys.ENTER))

WebUI.scrollToPosition(0, 350)

WebUI.click(findTestObject('Object Repository/Review/img_Rating high to low_hover-img'))

//


WebUI.scrollToPosition(0, 600)

fetchedText = WebUI.getText(findTestObject('CartLayout/TextAvailability'))

highlightElement(findTestObject('CartLayout/TextAvailability'))

text = 'Out Of Stock'

if (fetchedText.contains(text)) 
	{
	WebUI.verifyElementNotClickable(findTestObject('CartLayout/AddToCartButtonInProductPage'))
    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

    WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

    WebUI.closeBrowser()
} 
else 
	{
		KeywordUtil.markFailed('The "Add" button is enabled when the particular product is "out of stock". Here, the case is tested by entering in the product page')
		
	
    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

    WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

    
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

