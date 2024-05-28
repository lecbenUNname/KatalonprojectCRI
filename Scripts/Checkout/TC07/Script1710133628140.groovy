import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.security.SecureRandom
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

for (int i = 3; i <= 7; i++) {
    WebUI.setText(findTestObject('Object Repository/Checkout/FullName_Checkoutpag'), generateRandomName(i))
	
	CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Checkout/FullName_Checkoutpag'))
	
}


WebUI.back()

WebUI.scrollToPosition(0, 250)

WebUI.click(findTestObject('Object Repository/Checkout/First_Delete_Icon_Cart_Page'))

WebUI.click(findTestObject('Object Repository/Checkout/Toaster_CloseBtn'))

CustomKeywords.'com.helper.common.Common_Helper.logout'()

String generateRandomName(int length) {
    def characters = 'zxcvbnmasdfghjklqwertyuiop'

    def random = new SecureRandom()

    return (0..length).collect({ 
            characters[random.nextInt(characters.length())]
        }).join()
}

