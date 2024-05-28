import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable


WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_Traditional Wear Lehanga CholiMaxi DressSarees'), 
    0)

List<WebElement> images = WebUI.findWebElements(findTestObject('Wishlist/AllimageMouseOver'), 30)

int count = images.size()

println(count)

for (int i = 0; i < count; i++) {
    WebElement element = images.get(i)

    TestObject elementObject = new TestObject()

    elementObject.addProperty('xpath', ConditionType.EQUALS, ('(//div[@class=\'product-img product-img-zoom\']//a)[' + (i + 
        1)) + ']')

    //
    WebUI.scrollToElement(elementObject, 0)

    WebUI.mouseOver(elementObject)

    WebUI.verifyElementPresent(findTestObject('CartLayout/AddToCartIcon'), 0)

    ///
    TestObject elementObject1 = new TestObject()

    elementObject1.addProperty('xpath', ConditionType.EQUALS, ('(//a[@aria-label=\'Add To Wishlist\'])[' + (i + 1)) + ']')

    WebUI.click(elementObject1)

    WebUI.click(findTestObject('Wishlist/AlertClose'))

    WebUI.waitForElementNotVisible(findTestObject('Wishlist/AlertClose'), 2)

    println(elementObject)
}

WebUI.click(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/a_Electronics Accessories'))

//
WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Electronics Accessories/div_Hot Computer Accessories Retro Typewrit_383be2'))

//
WebUI.click(findTestObject('Object Repository/Wishlist/WS1'))

//
WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Electronics Accessories/div_Hot Computer Accessories BAGSMART Elect_fd2e4b'))

//
WebUI.click(findTestObject('Object Repository/Wishlist/WS2'))

WebUI.mouseOver(findTestObject('Wishlist/ThirdPrdInElect'))

WebUI.click(findTestObject('Wishlist/WS3'))

String text = WebUI.getText(findTestObject('Wishlist/wshlstcount'))

// Convert the text to an integer
int j = Integer.parseInt(text.trim())

println(j)

if (j >= 10) {
    WebUI.click(findTestObject('Wishlist/Page_Women Olive Poly-Silk Volume Control E_4657fb/a_Wishlist'))

    WebUI.scrollToPosition(0, 1800)

    WebUI.verifyElementPresent(findTestObject('Wishlist/navipagination'), 0)

//    for (i = 0; i <= count; i++) {
//        WebUI.click(findTestObject('Wishlist/RemoveINCart'))
//    }
} else {
    KeywordUtil.markFailed('FAiled because pagination is not there')

//    for (i = 0; i <= count; i++) {
//        WebUI.click(findTestObject('Wishlist/RemoveButton'))
//    }
	
}
List<WebElement> removeCart = WebUI.findWebElements(findTestObject('Object Repository/Wishlist/toCountInCartPage'),30)

int count1 = removeCart.size()

println(count1)

for (int k = 0; k < count1; k++) {
	WebUI.mouseOver (findTestObject('Wishlist/RemoveINCart'))
	WebUI.click(findTestObject('Wishlist/RemoveINCart'))
}
WebUI.delay(3)
WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

WebUI.closeBrowser()

