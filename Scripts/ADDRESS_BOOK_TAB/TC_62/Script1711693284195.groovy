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

WebUI.setText(findTestObject('ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Email_Locator'), 'rickwillson@gmail.com')

WebUI.setText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Phone_Locator'),
	'9876543210')

WebUI.selectOptionByValue(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/select_Select country. Afghanistan land Isl_8c3c38'),
	'IN', true)

WebUI.setText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/input_State_state'),
	'Tamilnadu')

WebUI.setText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/input_City_city'),
	'Textcity')

WebUI.setText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/input_Address_address'),
	'13/2 (old no) 15')
boolean x = WebUI.verifyElementPresent(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/zip_code_locator'),
	1, FailureHandling.OPTIONAL)
if (x != false) {
	WebUI.setText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/zip_code_locator'),
		'636007')
}

WebUI.click(findTestObject('ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/button_Add a new address'))

WebUI.takeScreenshot()

Sucess_message = WebUI.getAttribute(findTestObject('ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Address_Created_sucess'),
'class')

println(Sucess_message)

WebUI.verifyElementPresent(findTestObject('ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Remove_Address'),0)

WebUI.click(findTestObject('ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Remove_Address'))
	
WebUI.verifyElementPresent(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Address books/Confirm_popup_locator'),0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Address books/Cancel_btn_locator'),0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Address books/Confirm_popup_text_locator'),0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Confirm_Delete'),0)

WebUI.click(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Address books/Cancel_btn_locator'))

WebUI.closeBrowser()
	