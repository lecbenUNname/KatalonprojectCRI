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

WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

WebUI.mouseOver(findTestObject('CartLayout/SecondProduct'))

WebUI.click(findTestObject('CartLayout/SecondProduct'))

//WebUI.click(findTestObject('CartLayout/AddToCartButtonInProductPage'))
//String i = WebUI.getText(findTestObject('CartLayout/StrikePrd'))
//println(i)
WebUI.click(findTestObject('CartLayout/AddToCartButtonInProductPage'))

WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

WebUI.click(findTestObject('CartLayout/UpIcon'))

double productPriceCartPage = convertToNumber(WebUI.getText(findTestObject('Object Repository/CartLayout/CartIcon/RetPrice')))

//findTestObject('Object Repository/CartLayout/CartIcon/RetPrice')
//text> double > qty
//div[@class='detail-qty border radius m-auto']
String qty = WebUI.getAttribute(findTestObject('CartLayout/QtyText'), 'value')

double qtyNo = Double.parseDouble(qty)

println(qtyNo)

productPriceCartPage *= qtyNo

println(productPriceCartPage)
double expprice=convertToNumber(WebUI.getText(findTestObject('Object Repository/CartLayout/CartIcon/price')))

println(expprice)

if(productPriceCartPage.equals(expprice))
{
	//WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('CartLayout/PriceOfObject'), 30)
		//highlightElement(element)
WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

	WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))
	
	WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
	
	WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

}
else
{
KeywordUtil.markFailed('Failed because promotion text is not present')

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('CartLayout/PriceOfObject'), 30)

highlightElement(element)

WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
}

WebUI.closeBrowser() 

// Remove non-numeric characters except for one dot
// Ensure there's only one dot in the string
// Convert to double

void highlightElement(WebElement element) {
    String originalStyle = element.getAttribute('style')

    JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)

    WebUI.delay(1)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}

def convertToNumber(String txt) {
    String txtOnlyNumbers = txt.replaceAll('[^0-9.]', '')

    txtOnlyNumbers = txtOnlyNumbers.replaceFirst('\\.', '')

    double txtNo = Double.parseDouble(txtOnlyNumbers)

    return txtNo
}

