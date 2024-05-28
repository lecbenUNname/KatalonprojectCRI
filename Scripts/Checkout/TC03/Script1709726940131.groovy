import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Checkout/searchForProduct'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 10)

WebUI.click(findTestObject('Object Repository/Checkout/Cart_Icon'))

WebUI.scrollToPosition(0, 250)

WebUI.click(findTestObject('Object Repository/Checkout/button_Proceed To Checkout'))

boolean x = WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/h5_Shipping information'), 0, FailureHandling.OPTIONAL)

if (x == true) {
    CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Checkout/h5_Shipping information'))

    WebUI.back()
}
else {
	KeywordUtil.markFailed()
	CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Checkout/button_Proceed To Checkout'))
}

WebUI.scrollToPosition(0, 250)

WebUI.mouseOver(findTestObject('Object Repository/Checkout/button_Proceed To Checkout'))

WebUI.click(findTestObject('Object Repository/Checkout/First_Delete_Icon_Cart_Page'))

WebUI.click(findTestObject('Object Repository/Checkout/Toaster_CloseBtn'))

CustomKeywords.'com.helper.common.Common_Helper.logout'()


