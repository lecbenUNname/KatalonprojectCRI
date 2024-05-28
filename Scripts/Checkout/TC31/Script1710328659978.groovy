import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.security.SecureRandom as SecureRandom
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Checkout/searchForProduct'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 10)

WebUI.click(findTestObject('Object Repository/Checkout/Cart_Icon'))

WebUI.scrollToPosition(0, 250)

WebUI.click(findTestObject('Object Repository/Checkout/button_Proceed To Checkout'))

try {
	WebUI.click(findTestObject('Object Repository/Checkout/Add_a_new_Address_CheckoutPage'))
	}
	catch(Exception E) {
		
	}
	
WebUI.clearText(findTestObject('Object Repository/Checkout/FullName_Checkoutpag'))

WebUI.clearText(findTestObject('Object Repository/Checkout/Email_CheckoutPage'))

WebUI.clearText(findTestObject('Object Repository/Checkout/address_phone_CheckoutPage'))

WebUI.clearText(findTestObject('Object Repository/Checkout/State_CheckoutPage'))

WebUI.clearText(findTestObject('Object Repository/Checkout/City_CheckoutPage'))

WebUI.clearText(findTestObject('Object Repository/Checkout/Address_CheckoutPage'))

WebUI.click(findTestObject('Object Repository/Checkout/Country_DropDown_CheckoutPage'))

// Assuming you have already defined and initialized the list 'countrylist'
List<String> textContents = []

List<WebElement> countrylist = WebUI.findWebElements(findTestObject('Object Repository/Checkout/CountryLST_CheckoutPage'), 30)

// Iterate over the list and print each WebElement
for (WebElement element : countrylist) {
	
	String Str = element.getText()
	
	textContents.add(Str)
}

println(textContents.size())
println(textContents[3] )

WebUI.closeBrowser()
