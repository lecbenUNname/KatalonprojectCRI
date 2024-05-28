import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.callTestCase(findTestCase('Checkout/searchForProduct'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 10)

WebUI.click(findTestObject('Object Repository/Checkout/Cart_Icon'))

WebUI.scrollToPosition(0, 250)

WebUI.click(findTestObject('Object Repository/Checkout/button_Proceed To Checkout'))

try {
	WebUI.click(findTestObject('Object Repository/Checkout/Add_a_new_Address_CheckoutPage'))
}
catch (Exception e) {
}

Object[][] objectsAndAttributes = [
	[findTestObject('Object Repository/Checkout/Address_CheckoutPage'), 'placeholder'],
	[findTestObject('Object Repository/Checkout/FullName_Checkoutpag'), 'placeholder'],
	[findTestObject('Object Repository/Checkout/State_CheckoutPage'), 'placeholder'],
	[findTestObject('Object Repository/Checkout/SelectCountry_CheckoutPage'), 'value'],
	[findTestObject('Object Repository/Checkout/address_phone_CheckoutPage'), 'id'],
	[findTestObject('Object Repository/Checkout/Email_CheckoutPage'),'placeholder'],
	[findTestObject('Object Repository/Checkout/City_CheckoutPage'),'placeholder']
	]

boolean anyEmpty = areAttributesEmpty(objectsAndAttributes)

if (anyEmpty==true) {
	
	WebUI.takeScreenshot()
	
	KeywordUtil.markFailed("One or more attribute values are empty.")
}

WebUI.navigateToUrl(GlobalVariable.Url)
CustomKeywords.'com.helper.common.Common_Helper.logout'()


public static boolean areAttributesEmpty(Object[][] objectsAndAttributes) {
	boolean anyEmpty = false
	
	for (Object[] objectAndAttribute : objectsAndAttributes) {
		TestObject testObject = objectAndAttribute[0] as TestObject
		String attribute = objectAndAttribute[1] as String
		
		String attributeValue = WebUI.getAttribute(testObject, attribute)
		boolean isEmpty = attributeValue.isEmpty()
		
		if (isEmpty) {
			anyEmpty = true
			WebUI.comment("Attribute '" + attribute + "' for Test Object '" + testObject.getObjectId() + "' is empty.")
		}
	}
	
	return anyEmpty
}


