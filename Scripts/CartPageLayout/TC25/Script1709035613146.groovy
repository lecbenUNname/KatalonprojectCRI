import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

WebUI.mouseOver(findTestObject('CartLayout/SecondProduct'))

WebUI.click(findTestObject('CartLayout/SecondProduct'))

WebUI.click(findTestObject('CartLayout/AddToCartButtonInProductPage'))

WebUI.scrollToPosition(0, 1800)

WebUI.click(findTestObject('Object Repository/CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/TestProduct2'))

WebUI.scrollToPosition(0, 800)

//WebUI.click(findTestObject('Object Repository/CartLayout/Page_Testing Product/span'))

WebUI.click(findTestObject('Object Repository/CartLayout/Page_Testing Product/button_Add to cart'))

WebUI.scrollToElement(findTestObject('CartLayout/Page_Crazystylezs/div_All Categories                         _72f775'), 
    0)

WebUI.mouseOver(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

WebElement element1 = WebUiBuiltInKeywords.findWebElement(findTestObject('CartLayout/CountOfProductInCart'), 30)

highlightElement(element1)

String element2 = WebUI.getText(findTestObject('CartLayout/CountOfProductInCart'))

println(element2)

//int intValue = Integer.parseInt(element2)
List<WebElement> icon2 = WebUI.findWebElements(findTestObject('Object Repository/Wishlist/RemoveButton'), 30)

int count2 = icon2.size()

println(count2)

// Convert intValue and count2 to strings before using contains()
if (String.valueOf(element2).contains(String.valueOf(count2))) {
    WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

    String element3 = WebUI.getText(findTestObject('CartLayout/CountOfProductInCart'))

    println(element3)

    //int intValue1 = Integer.parseInt(element3)
    List<WebElement> icon3 = WebUI.findWebElements(findTestObject('Object Repository/Wishlist/RemoveButton'), 30)

    int count3 = icon3.size()

    println(count3)

    // Convert intValue1 and count3 to strings before using contains()
    if (String.valueOf(element3).contains(String.valueOf(count3))) {
        WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))
    }
} else {
    KeywordUtil.markFailed('Failed because of count mismatch')
}

//WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

WebUI.closeBrowser()

void highlightElement(WebElement element) {
    String originalStyle = element.getAttribute('style')

    JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)

    WebUI.delay(1)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}

