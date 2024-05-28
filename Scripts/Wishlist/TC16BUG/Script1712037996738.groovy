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

WebUI.click(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/a_Sarees_action-btn hover-up js-add-to-wish_cea609'))

WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/img_Sarees_hover-img'))

WebUI.click(findTestObject('Object Repository/Login/Page_Register/Page_Login/Page_Women Yellow Bandhani Printed Maxi Dress/productimage'))

WebUI.click(findTestObject('Object Repository/Wishlist/WishlistProductButton'))

WebUI.mouseOver(findTestObject('Wishlist/Page_Crazystylezs/a_Wishlist'))

WebUI.click(findTestObject('Wishlist/Page_Crazystylezs/a_Wishlist'))

List<WebElement> remove = WebUI.findWebElements(findTestObject('Wishlist/RemoveButton'), 30)

String i = remove.size()

println(i)
highlightElement(findTestObject('Object Repository/Wishlist/WishlistCountDes'))
String header = WebUI.getText(findTestObject('Wishlist/HeadingText'))

println(header)

String prefix = 'There are '

String suffix = ' products in this list'

// yellow dress
// Check if alertProductName is not null before performing operations on it
String productCount = header.replace(prefix, '').replace(suffix, '').trim()

println(productCount)

if (productCount.equals(i)) {
    WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))

    WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))

    String header1 = WebUI.getText(findTestObject('Wishlist/HeadingText'))

    println(header1)

    String prefix1 = 'There are '

    String suffix1 = ' products in this list'

    String productCount1 = header.replace(prefix, '').replace(suffix, '').trim()

    println(productCount1)

    if (productCount1.equals(i))
		 {
        KeywordUtil.markFailed('The count of the product is not matched')

        WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

        WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

        WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
    }
}
 else 
	 {
    WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))

    WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))

    WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

    WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

    WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
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
WebUI.closeBrowser()