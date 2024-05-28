import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_Traditional Wear Lehanga CholiMaxi DressSarees'), 
    0)

WebUI.mouseOver(findTestObject('CartLayout/SecondProduct'))

WebUI.click(findTestObject('CartLayout/SecondProduct'))

WebUI.scrollToPosition(100, 1000)

WebUI.click(findTestObject('CartLayout/AddToCartButtonInProductPage'))

WebUI.mouseOver(findTestObject('CartLayout/Page_Crazystylezs/div_All Categories                         _72f775'))

WebUI.mouseOver(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

WebUI.click(findTestObject('CartLayout/CartIconInHomePage'))

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('CartLayout/CountOfProductInCart'), 30)

highlightElement(element)
List<WebElement> prd = WebUI.findWebElements(findTestObject('Object Repository/CartLayout/CountOfProductInCart'), 30)

String i = prd.size()

println(i)
String element1 = WebUI.getText(findTestObject('CartLayout/CountOfProductInCart'))
println(element1)
String prefix = "There are "
String suffix = " products in your cart"
 
// yellow dress
 
// Check if alertProductName is not null before performing operations on it
	num = element1.replace(prefix, "").replace(suffix, "").trim()
	println(num)
 
 
//int intval=Integer.parseInt(element1)

//println(intval)

//List<WebElement> icon = WebUI.findWebElements(findTestObject('Object Repository/Wishlist/RemoveButton'), 30)
//
//int count = icon.size()
//
//println(count)

if (i.contains(num)) {
    WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

    WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
} else {
    KeywordUtil.markFailed('FAiled because of count missmatch')

    WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

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

