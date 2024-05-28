import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

WebUI.mouseOver(findTestObject('CartLayout/SecondProduct'))

//WebUI.click(findTestObject('CartLayout/SecondProduct'))

WebUI.mouseOver(findTestObject('CartLayout/EyeIcon2'))

WebUI.click(findTestObject('CartLayout/EyeIcon2'))

WebUI.scrollToElement(findTestObject('CartLayout/EyeAddToCart'), 1000)

String i = WebUI.getAttribute(findTestObject('CartLayout/QtyText'), 'value')

println(i)

String inputString = WebUI.getText(findTestObject('CartLayout/Availabltyy'))

String numberString = inputString.replaceAll('[^0-9]', '')

// Parse the extracted number string to an integer
int j = Integer.parseInt(numberString)

println(j)

int count

for (int k = 1; k < 5; k++) {
    WebUI.click(findTestObject('CartLayout/UpIcon'))

    count++
}

println(count)

String element3 = WebUI.getAttribute(findTestObject('CartLayout/QtyText'), 'value')

println(element3)

int count1

for (int l = 1; l < 5; l++) {
    WebUI.click(findTestObject('Object Repository/CartLayout/DownIcon'))

    count1--
}

println(count1)

String element4 = WebUI.getAttribute(findTestObject('CartLayout/QtyText'), 'value')

println(element4)

//WebUI.click(findTestObject('CartLayout/TestingUpArrow'))
//WebUI.click(findTestObject('Object Repository/CartLayout/DownIcon'))
if (i == element4) {
    if (j == element3) {
        WebUI.click(findTestObject('CartLayout/CloseBtn'))

        WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

        WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

        WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
    }
} else {
    WebUI.click(findTestObject('CartLayout/CloseBtn'))

    KeywordUtil.markFailed('Failed because count mismatch')

    WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

    WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
}

WebUI.closeBrowser()

