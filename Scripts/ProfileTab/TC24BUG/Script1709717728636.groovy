import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('ProfileTab/Profile Tab common'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 250)

String PhoneFieldBefore = ''

WebUI.setText(findTestObject('Object Repository/Checkout/Checkout_button_CheckoutPage'), '@$%&')

String PhoneFieldAfter = WebUI.getText(findTestObject('Object Repository/Checkout/Checkout_button_CheckoutPage'))
		
if (PhoneFieldBefore.equals(PhoneFieldAfter)) {
    KeywordUtil.markPassed('Phone field validation is correct. Test passed.')
} else {
    KeywordUtil.markFailed('Phone field validation is incorrect. Test failed.')
}

WebUI.closeBrowser()



