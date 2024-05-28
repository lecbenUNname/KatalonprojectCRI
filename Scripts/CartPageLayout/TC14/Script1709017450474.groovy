import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

WebUI.mouseOver(findTestObject('CartLayout/SecondProduct'))

WebUI.click(findTestObject('CartLayout/SecondProduct'))

WebUI.scrollToPosition(0, 1000)

WebUI.click(findTestObject('CartLayout/AddToCartButtonInProductPage'))

WebUI.verifyElementPresent(findTestObject('CartLayout/AlertBoxAddedCart'), 0)

String i = WebUI.getText(findTestObject('Wishlist/alertaddedsuccessfully'))

println(i)

productName = WebUI.getText(findTestObject('CartLayout/Headinggcart'))

println(productName)

// Extract the desired text from 'alertProductName'
String prefix = 'Added product '

String suffix = ' to cart successfully!'

// yellow dress
// Check if alertProductName is not null before performing operations on it
Alertproductname = i.replace(prefix, '').replace(suffix, '').trim()

println(Alertproductname)

// Perform the comparison
if (WebUI.verifyElementPresent(findTestObject('CartLayout/AlertBoxAddedCart'), 0)) {
    if (i.contains(productName)) {
        WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

        WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

        WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

        WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

        WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
    }
} else {
    KeywordUtil.markFailed('Incorrect alert')

    WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

    WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

    WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
}

WebUI.closeBrowser()

