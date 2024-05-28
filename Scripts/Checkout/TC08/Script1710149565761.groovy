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


WebUI.waitForElementVisible(findTestObject('Object Repository/Checkout/FullName_Checkoutpag'), 10)

String Get_URL_if_Checkout = trimRandomPart(WebUI.getUrl())

WebUI.setText(findTestObject('Object Repository/Checkout/FullName_Checkoutpag'), '          ')

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Checkout/FullName_Checkoutpag'))

WebUI.scrollToPosition(0, 450)

WebUI.click(findTestObject('Object Repository/Checkout/Checkout_button_CheckoutPage'))

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Checkout/FullName_Checkoutpag'))

WebUI.scrollToPosition(0, 450)

	String Get_URL_ifStill_Checkout = trimRandomPart(WebUI.getUrl())

	if(Get_URL_ifStill_Checkout != Get_URL_if_Checkout) {
		KeywordUtil.markFailed()
	}
	
WebUI.click(findTestObject('Object Repository/Checkout/BackToCart_checkoutPage'))

WebUI.scrollToPosition(0, 250)

WebUI.click(findTestObject('Object Repository/Checkout/First_Delete_Icon_Cart_Page'))

WebUI.click(findTestObject('Object Repository/Checkout/Toaster_CloseBtn'))

CustomKeywords.'com.helper.common.Common_Helper.logout'()


String trimRandomPart(String Get_URL_checkout) {
	int lastSlashIndex = Get_URL_checkout.lastIndexOf('/')

	String trimmedUrl = Get_URL_checkout.substring(0, lastSlashIndex + 1)

	return trimmedUrl
}
