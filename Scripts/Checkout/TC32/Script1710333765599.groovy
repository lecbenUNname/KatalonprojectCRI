import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.callTestCase(findTestCase('Checkout/searchForProduct'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 10)

WebUI.click(findTestObject('Object Repository/Checkout/Cart_Icon'))

WebUI.scrollToPosition(0, 250)

WebUI.click(findTestObject('Object Repository/Checkout/button_Proceed To Checkout'))

try {
WebUI.click(findTestObject('Object Repository/Checkout/Add_a_new_Address_CheckoutPage'))
}
catch(Exception E) {}

WebUI.clearText(findTestObject('Object Repository/Checkout/FullName_Checkoutpag'))

WebUI.clearText(findTestObject('Object Repository/Checkout/Email_CheckoutPage'))

WebUI.clearText(findTestObject('Object Repository/Checkout/address_phone_CheckoutPage'))

WebUI.clearText(findTestObject('Object Repository/Checkout/State_CheckoutPage'))

WebUI.clearText(findTestObject('Object Repository/Checkout/City_CheckoutPage'))

WebUI.clearText(findTestObject('Object Repository/Checkout/Address_CheckoutPage'))

WebUI.click(findTestObject('Object Repository/Checkout/Country_DropDown_CheckoutPage'))

List<WebElement> countrylist = WebUI.findWebElements(findTestObject('Object Repository/Checkout/CountryLST_CheckoutPage'), 30)

int productcount = countrylist.size()

println (productcount)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Checkout/Country_DropDown_CheckoutPage'), '', false)

String dropdownLocator = 'Object Repository/Checkout/Country_DropDown_CheckoutPage'

TestObject dropdown = findTestObject(dropdownLocator)
try {
for (int i = 0; i < productcount; i++) {
    WebUI.sendKeys(dropdown, Keys.chord(Keys.ARROW_DOWN))
}

for (int i = productcount; i >= 0; i--) {
    WebUI.sendKeys(dropdown, Keys.chord(Keys.ARROW_UP))
}}
catch(Exception e) {
	KeywordUtil.markFailed("Unable to scroll up and scroll down")
}

WebUI.closeBrowser()