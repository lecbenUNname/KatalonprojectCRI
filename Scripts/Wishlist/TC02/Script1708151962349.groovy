import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_Traditional Wear Lehanga CholiMaxi DressSarees'), 
    0)

List<WebElement> images = WebUI.findWebElements(findTestObject('Wishlist/AllimageMouseOver'), 30)

int count = images.size()

for (int i = 0; i < count; i++) {
    WebElement element = images.get(i)

    TestObject elementObject = new TestObject()

    elementObject.addProperty('xpath', ConditionType.EQUALS, ('(//div[@class=\'product-img product-img-zoom\']//a)[' + (i + 
        1)) + ']')

    //
    WebUI.scrollToElement(elementObject, 0)

    WebUI.mouseOver(elementObject)

    WebUI.verifyElementPresent(findTestObject('CartLayout/AddToCartIcon'), 0)
}
WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

WebUI.closeBrowser()
