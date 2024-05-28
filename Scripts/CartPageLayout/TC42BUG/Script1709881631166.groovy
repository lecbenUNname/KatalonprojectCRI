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

String inputString = WebUI.getText(findTestObject('CartLayout/Availabltyy'))

String numberString = inputString.replaceAll('[^0-9]', '')

// Parse the extracted number string to an integer
int extractedNumber = Integer.parseInt(numberString)

println(extractedNumber)

int incrNo = extractedNumber + 1

String inputAvl = incrNo

WebUI.scrollToElement(findTestObject('CartLayout/Scrl'), 0)

WebUI.click(findTestObject('CartLayout/AvailabilitySetText'))


WebUI.clearText(findTestObject('CartLayout/AvailabilitySetText'))

WebUI.click(findTestObject('CartLayout/AvailabilitySetText'))


WebUI.sendKeys(findTestObject('CartLayout/AvailabilitySetText'), inputAvl)



//WebUI.setText(findTestObject('CartLayout/AvailabilitySetText'), incrNo)
WebUI.click(findTestObject('CartLayout/AddToCartButtonInProductPage'))


boolean l = WebUI.verifyElementPresent(findTestObject('Object Repository/CartLayout/Alert_ProductAlreadyExist'),1, FailureHandling.OPTIONAL)

if(l) {
String  i=WebUI.getText(findTestObject('Object Repository/CartLayout/Alert_ProductAlreadyExist'))
if(i.contains('sufficient quantity'))
	  {
		  println(i)
		  
}
else {
	KeywordUtil.markFailed('There is no warning message.')
} }
else {
	KeywordUtil.markFailed('There is no warning message.')
	

}


WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))
WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

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
