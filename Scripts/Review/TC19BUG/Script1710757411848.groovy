import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

WebUI.mouseOver(findTestObject('Object Repository/Review/Page_Crazystylezs/div_Hot                                    _6fe5af'))

WebUI.click(findTestObject('Object Repository/Review/Page_Crazystylezs/div_Hot                                    _6fe5af'))

WebUI.scrollToPosition(0, 1000)

WebUI.click(findTestObject('Review/Reviewbtnn'))



def expectedText = ['Poor','bad', 'Good' , 'Excellent','Wow']

for (int i = 0; i < 5 ;i++) {
	WebUI.scrollToPosition(0, 1200)
	
	
	TestObject elementObject = new TestObject()
	
	
	elementObject.addProperty("xpath", ConditionType.EQUALS, "//div[@class='rate']/label[" + (i + 1) + "]")
	
	 WebUI.mouseOver(elementObject)
	 
	 def actualkelementText = WebUI.getAttribute(elementObject, 'title')
	 
	 if (expectedText[i] != actualkelementText) {
		 KeywordUtil.markFailed('')
	 }
	 
	 println(expectedText[i]+actualkelementText)
	 
	 WebUI.delay(3)
		
	}
	

WebUI.closeBrowser()

def highlightElement(TestObject yourElement) {
    WebElement element = WebUiBuiltInKeywords.findWebElement(yourElement, 30)

    String originalStyle = element.getAttribute('style')

    JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 3px solid red; ' + originalStyle) + '\');', element)

    WebUI.takeScreenshot()

    js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 3px solid blue; ' + originalStyle) + '\');', element)

    WebUI.delay(1)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}

