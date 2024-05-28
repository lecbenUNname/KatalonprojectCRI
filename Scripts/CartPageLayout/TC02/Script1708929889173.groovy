import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.apache.poi.ss.usermodel.ConditionType
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(100, 1200)

List<WebElement> images = WebUI.findWebElements(findTestObject('Wishlist/AllimageMouseOver'), 30)

int count = images.size()

println(count)

for (int i = 1; i <= count; i++) 
	 {
	    //WebElement element = elements.get(i)     
	TestObject elementObject = new TestObject()    
elementObject.addProperty('xpath', ConditionType.EQUALS, ('(//div[@class=\'product-img product-img-zoom\']//a)[' + i) + 
        ']')
	WebUI.mouseOver(elementObject)  
	WebUI.verifyElementPresent(findTestObject('CartLayout/AddToCartIcon'), 0)
	 WebUI.delay(3)
	  }
//	  for (int i = 1; i <= count; i++) {
//		  //WebElement element = elements.get(i)
//		  TestObject elementObject = new TestObject();
//		  elementObject.addProperty('xpath', ConditionType.EQUALS, ('(//div[@class=\'product-img product-img-zoom\']//a)[' + i + ']'));
//		  WebUI.mouseOver(elementObject);
//		  WebUI.verifyElementPresent(findTestObject('CartLayout/AddToCartIcon'), 0);
//		  WebUI.delay(3);
//	  }

WebUI.verifyElementPresent(findTestObject('CartLayout/AddToCartIcon'), 0)

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
WebUI.closeBrowser()

