import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI 

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

List<WebElement> images = WebUI.findWebElements(findTestObject('Wishlist/AllimageMouseOver'), 30)

int count = images.size()

for (int i = 1; i <=count; i++) 
	{
   // WebElement element = images.get(i)

    TestObject elementObject = new TestObject()

   elementObject.addProperty('xpath', ConditionType.EQUALS, ('(//div[@class=\'product-img product-img-zoom\']//a)[' + i) 
         + ']')
  
    WebUI.scrollToElement(elementObject, 0)

    WebUI.mouseOver(elementObject)
	
	elementObject.addProperty('xpath', ConditionType.EQUALS, ('(//a[@aria-label=\'Add To Cart\'])['  + 
        i) + ']')

    WebUI.mouseOver(elementObject)
}

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

WebUI.closeBrowser()

