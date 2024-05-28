import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('ADDRESS_BOOK_TAB/Common_Address_book/Steps_To_Address_book'), [('Address_Text_Expected') : 'Address book', ('Address_Text_Actuall') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Account information/a_Address books'))

WebUI.click(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Address books/span_Add a new address'))

String name = WebUI.getText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/fullname_text_locator'))
WebUI.verifyMatch(name, 'Full Name:', false, FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/fullname_text_locator'))

WebUI.scrollToPosition(0, 400)

String email = WebUI.getText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/email_text_locator'))
WebUI.verifyMatch(email, 'Email:', false, FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/email_text_locator'))

String phone = WebUI.getText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/phone_text_locator'))
WebUI.verifyMatch(phone, 'Phone:', false, FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/phone_text_locator'))

String country = WebUI.getText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Country_text_locator'))
WebUI.verifyMatch(country, 'Country:', false,FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Country_text_locator'))

String state = WebUI.getText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/state_text_locator'))
WebUI.verifyMatch(state, 'State:', false,FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/state_text_locator'))

WebUI.scrollToPosition(0, 550)

String city = WebUI.getText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/city_text_locator'))
WebUI.verifyMatch(city, 'City:', false, FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/city_text_locator'))

String address = WebUI.getText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/address_text_locator'))
WebUI.verifyMatch(address, 'Address:', false, FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/address_text_locator'))


WebUI.closeBrowser() 
