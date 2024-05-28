import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.security.SecureRandom

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.callTestCase(findTestCase('Company/CommonTestcases'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Company/Page_Crazystylezs/span_Contact us'))

WebUI.click(findTestObject('Object Repository/Company/Page_Crazystylezs/span_Contact us'))

WebUI.delay(2)



WebUI.scrollToPosition(0, 900)

String randomWord = generateRandomString(10)

WebUI.setText(findTestObject('Object Repository/Company/Page_Contact/input_name'), randomWord)

WebUI.mouseOver(findTestObject('Object Repository/Company/Page_Contact/button_Send message'))

WebUI.click(findTestObject('Object Repository/Company/Page_Contact/button_Send message'))

WebUI.scrollToPosition(0, 1200)


CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Company/Company_ToastersuccessfullyToaster'))

WebUI.closeBrowser()

String generateRandomString(int length) {
    def characters = 'Kumar@123@gmail.com()-_=+[]{}|;:\'",.<>/?'

    def random = new SecureRandom()

    return (0..length).collect({ 
            characters[random.nextInt(characters.length())]
        }).join()
}

