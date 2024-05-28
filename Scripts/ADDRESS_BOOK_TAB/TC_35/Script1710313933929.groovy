import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('ADDRESS_BOOK_TAB/Common_Address_book/Steps_To_Address_book'), [('Address_Text_Expected') : 'Address book'
        , ('Address_Text_Actuall') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Account information/a_Address books'))

WebUI.click(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Address books/span_Add a new address'))

WebUI.setText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/input_Full Name_name'), 
    'Rick Willson')

WebUI.setText(findTestObject('ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Email_Locator'), 'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Phone_Locator'), 
    '9876545465')

WebUI.sendKeys(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Create Address/Country_Locator'), 
    Keys.chord(Country_keyword, Keys.ENTER))

WebElement dropdown = DriverFactory.getWebDriver().findElement(By.xpath('//select[@name=\'country\']'))

JavascriptExecutor jsExecutor = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

String selectedCountryText = jsExecutor.executeScript('return arguments[0].selectedOptions[0].innerText;', dropdown).toString()

println('Selected country text: ' + selectedCountryText)

if (selectedCountryText.contains(Country_keyword)) {
	
	KeywordUtil.markPassed('This Testcase is marked pass')
	}
	 else {
	
	KeywordUtil.markFailed('This Testcase is marked failed')
	}
	

WebUI.closeBrowser()

