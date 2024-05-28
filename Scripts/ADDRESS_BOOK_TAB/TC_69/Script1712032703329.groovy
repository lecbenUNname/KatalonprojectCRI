import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('ADDRESS_BOOK_TAB/Common_Address_book/Steps_To_Address_book'), [('Address_Text_Expected') : 'Address book'
		, ('Address_Text_Actuall') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Account information/a_Address books'))


for (int i = 1; i<= 11; i++) {	

WebUI.click(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Address books/span_Add a new address'))

WebUI.setText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/input_Full Name_name'),
	'Rick Willson')

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

WebUI.click(findTestObject('ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Default_Address_locator'))

WebUI.click(findTestObject('ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/button_Add a new address'))

}

WebUI.scrollToPosition(0, 1400)
WebUI.takeScreenshot()
WebUI.verifyElementPresent(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Address books/pagination_locator'), 3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToPosition(0, 100)

List<WebElement> removelist = WebUI.findWebElements(findTestObject('ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Remove_Address'),
	5)

int removecount = removelist.size()

println(removecount)

for (int i = 1; i <= removelist.size(); i++) {
	WebUI.click(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Remove_Address'))

	WebUI.click(findTestObject('ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Confirm_Delete'))
}

WebUI.closeBrowser()

