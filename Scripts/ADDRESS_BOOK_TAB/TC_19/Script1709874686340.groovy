import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.callTestCase(findTestCase('ADDRESS_BOOK_TAB/Common_Address_book/Steps_To_Address_book'), [('Address_Text_Expected') : 'Address book'
	, ('Address_Text_Actuall') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Account information/a_Address books'))

WebUI.click(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Address books/span_Add a new address'))

WebUI.setText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/input_Full Name_name'),
'Rick Willson')

WebUI.setText(findTestObject('ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Email_Locator'), 'test@gmai@l.com')

WebUI.setText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Phone_Locator'),
	'9876543210')

WebUI.selectOptionByValue(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/select_Select country. Afghanistan land Isl_8c3c38'),
'IN', true)

WebUI.setText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/input_State_state'),
'Tamilnadu')

WebUI.setText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/input_City_city'),
'chennai')

WebUI.setText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/input_Address_address'),
'Test')

boolean x = WebUI.verifyElementPresent(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/zip_code_locator'),
	1, FailureHandling.OPTIONAL)
if (x != false) {
	WebUI.setText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/zip_code_locator'),
		'636007')
}


WebUI.click(findTestObject('ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/button_Add a new address'))

String Validation_msg = WebUI.getAttribute(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Email_Locator'), 'validationMessage')

println(Validation_msg)

if (Validation_msg.contains("A part following '@' should not contain the symbol '@'.")) {

KeywordUtil.markPassed('This Testcase is marked pass')
}
 else {
List<WebElement> removelist = WebUI.findWebElements(findTestObject('ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Remove_Address'),
	0)

int removecount = removelist.size()

println(removecount)

for (int i = 1; i <= removelist.size(); i++) {
	WebUI.click(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Remove_Address'))

	WebUI.click(findTestObject('ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Confirm_Delete'))
}

KeywordUtil.markFailed('This Testcase is marked failed')
}

WebUI.closeBrowser()
