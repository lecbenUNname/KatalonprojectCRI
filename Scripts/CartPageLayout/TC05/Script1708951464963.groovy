import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

WebUI.mouseOver(findTestObject('CartLayout/SecondProduct'))

WebUI.mouseOver(findTestObject('CartLayout/CartIcon/CartIconSecondPrdInHP'))

WebUI.click(findTestObject('CartLayout/CartIcon/CartIconSecondPrdInHP'))

productName = WebUI.getText(findTestObject('CartLayout/NameOfTheProduct'))

alertProductName = WebUI.getText(findTestObject('CartLayout/AlertBoxAddedCart'))

// Extract the desired text from 'alertProductName'
String prefix = 'Added product '

String suffix = ' to cart successfully!'

// Check if alertProductName is not null before performing operations on it
Alertproductname = alertProductName.replace(prefix, '').replace(suffix, '').trim()

// Perform the comparison
if (Alertproductname.contains(productName)) {
    println('The Alertproductname contains the productName.')

    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

    WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
} else {
    KeywordUtil.markFailed('The Alertproductname does not contain the productName.')

    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

    WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
}

WebUI.closeBrowser()

