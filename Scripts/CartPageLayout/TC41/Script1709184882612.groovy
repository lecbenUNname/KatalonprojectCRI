import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

WebUI.mouseOver(findTestObject('CartLayout/SecondProduct'))

WebUI.click(findTestObject('CartLayout/SecondProduct'))
WebUI.click(findTestObject('CartLayout/UpIcon'))

WebUI.click(findTestObject('CartLayout/UpIcon'))
String qtyy = WebUI.getAttribute(findTestObject('CartLayout/QtyText'), 'value')

double qtyyNo = Double.parseDouble(qtyy)

println(qtyyNo)

WebUI.click(findTestObject('CartLayout/AddToCartButtonInProductPage'))

WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))
String qty = WebUI.getAttribute(findTestObject('CartLayout/QtyText'), 'value')

double qtyNo = Double.parseDouble(qty)

println(qtyNo)
if(qtyyNo.equals(qtyNo))
{

//WebUI.click(findTestObject('CartLayout/UpIcon'))

//WebUI.click(findTestObject('CartLayout/UpIcon'))

//WebUI.click(findTestObject('CartLayout/FirstHeadingInCart'))

//WebUI.scrollToPosition(0, 500)

//WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('CartLayout/QuantityIconInProductPage'), 30)

//highlightElement(element)

//WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

WebUI.verifyElementPresent(findTestObject('CartLayout/AlertBoxAddedCart'), 0)

WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
}
else
{
	KeywordUtil.markFailed("Failed because the changes oin the product page is not reflected in the cart page")
	WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))
	
	WebUI.verifyElementPresent(findTestObject('CartLayout/AlertBoxAddedCart'), 0)
	
	WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))
	
	WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
	
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
}

WebUI.closeBrowser()

void highlightElement(WebElement element) {
    String originalStyle = element.getAttribute('style')

    JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)

    WebUI.delay(1)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}

