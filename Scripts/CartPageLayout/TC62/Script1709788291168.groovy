import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:])

WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

WebUI.mouseOver(findTestObject('CartLayout/SecondProduct'))

//WebUI.click(findTestObject('CartLayout/SecondProduct'))
//WebUI.click(findTestObject('Wishlist/Page_Electronics Accessories/div_Hot Computer Accessories Retro Typewrit_383be2'))
WebUI.click(findTestObject('CartLayout/EyeIcon2'))

WebUI.scrollToElement(findTestObject('CartLayout/AreaPrdScrl'), 1000)

WebUI.click(findTestObject('CartLayout/UpIcon'))

WebUI.click(findTestObject('CartLayout/AddToCartButtonInProductPage'))

WebUI.click(findTestObject('CartLayout/CloseBtn'))

WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

//WebUI.click(findTestObject('Wishlist/AlertClose'))
WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/CartLayout/Page_Crazystylezs/a_Cart'), 
    30)

highlightElement(element)

/// WebUI.click(findTestObject('Wishlist/AlertClose'))
WebUI.scrollToPosition(0, 50)

WebUI.waitForElementPresent(findTestObject('Object Repository/Wishlist/aa/tryCartText'), 3)

String i = WebUI.getText(findTestObject('Object Repository/Wishlist/aa/tryCartText'))

double j = Double.parseDouble(i)

println(j)

String qty = WebUI.getAttribute(findTestObject('CartLayout/QtyText'), 'value')

double qtyNo = Double.parseDouble(qty)

println(qtyNo)

if (j.equals(qtyNo)) {
    WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

    WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

    WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
} else {
    KeywordUtil.markFailed('Failed because count mismatch')
}

WebUI.closeBrowser()

void highlightElement(WebElement element) {
    String originalStyle = element.getAttribute('style')

    JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)

    WebUI.delay(1)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}

