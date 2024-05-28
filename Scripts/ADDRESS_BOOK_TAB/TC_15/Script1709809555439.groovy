
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('ADDRESS_BOOK_TAB/Common_Address_book/Steps_To_Address_book'), [('Address_Text_Expected') : 'Address book'
	, ('Address_Text_Actuall') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Account information/a_Address books'))

WebUI.click(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Address books/span_Add a new address'))


String display = "return window.getComputedStyle(arguments[0], ':after').getPropertyValue('content')"


List<WebElement> elements = [
	WebUiCommonHelper.findWebElement(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Mandatory_asterisk'), 10),
	WebUiCommonHelper.findWebElement(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/phone_asterisk'), 10),
	WebUiCommonHelper.findWebElement(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/country_asterisk'), 10),
	WebUiCommonHelper.findWebElement(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/state_asterisk'), 10),
	WebUiCommonHelper.findWebElement(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/city_asterisk'), 10),
	WebUiCommonHelper.findWebElement(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/address_asterisk'), 10)
]

for (WebElement element : elements) {
	String pseudoElementContent = ((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript(display, element) as String
	
	if (pseudoElementContent.contains('*')) {
		println(pseudoElementContent)
		KeywordUtil.markPassed("Pseudo-element content contains '*': $pseudoElementContent")
	} else {
		KeywordUtil.markFailed("Pseudo-element content does not contain '*': $pseudoElementContent")
	}
}









