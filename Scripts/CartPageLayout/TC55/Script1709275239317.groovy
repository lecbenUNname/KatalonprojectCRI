import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('CartLayout/SecondProduct'))

//WebUI.mouseOver(findTestObject('CartLayout/EyeIconn'))
WebUI.click(findTestObject('CartLayout/EyeIconn'))

WebUI.scrollToElement(findTestObject('CartLayout/EyeAddToCart'), 1000)

productName = WebUI.getText(findTestObject('CartLayout/Img1PrdName'))

WebUI.click(findTestObject('CartLayout/AddToCartEye'))

WebUI.click(findTestObject('CartLayout/CloseBtn'))

alertProductName = WebUI.getText(findTestObject('CartLayout/AlertBoxAddedCart'))

// Extract the desired text from 'alertProductName'
String prefix = 'Added product '

String suffix = ' to cart successfully!'

// yellow dress
// Check if alertProductName is not null before performing operations on it
Alertproductname = alertProductName.replace(prefix, '').replace(suffix, '').trim()

// Perform the comparison
if (Alertproductname.contains(productName)) {
    println('The Alertproductname contains the productName.')

    WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

    WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

    WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

    WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

    WebUI.closeBrowser()
} else {
    println('The Alertproductname does not contain the productName.')

    KeywordUtil.markFailed('Inappropriate alert message.')

    WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

    WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

    WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

    WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

    WebUI.closeBrowser()
}

