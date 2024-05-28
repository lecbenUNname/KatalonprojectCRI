import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonLoginPage/Url_Launch'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Searchbar/SearchBar/Page_Crazystylezs/input_All Categories_q'), 'women')

List<WebElement> SearchProduct = WebUI.findWebElements(findTestObject('Object Repository/Searchbar/SearchProduct'),
	0)
 
int SP = SearchProduct.size()
 
for (int i = 1; i <= SP; i++) {
	TestObject elementObject = new TestObject()
 
	elementObject.addProperty('xpath', ConditionType.EQUALS, ('(//div[@class=\'panel__content \']//div//div//div//a[@class=\'product__title\'])[' +
		i) + ']')
 
	WebUI.scrollToElement(elementObject, 0)
 
	boolean isDisplayed = WebUI.verifyElementVisible(findTestObject('Object Repository/Searchbar/SearchBar/LoadMoreBtn'),
		FailureHandling.OPTIONAL)
 
	if (isDisplayed) {
		WebUI.click(findTestObject('Object Repository/Searchbar/SearchBar/LoadMoreBtn'))
  
		break
	}
}
 
WebUI.closeBrowser()





