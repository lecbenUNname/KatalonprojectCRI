import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.security.SecureRandom

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.security.SecureRandom

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil

WebUI.callTestCase(findTestCase('FillingUpUserDetails/CommonFillingUpUserDetails/NavToRegisterPage'), [:], FailureHandling.STOP_ON_FAILURE)

String randomWord = generateRandomString(10)

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_name'), 
    randomWord)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_name'))


//To Generate Random Email
String randomEmail = generateRandomEmail()

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_email'), 
    randomEmail)

WebUI.setEncryptedText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password'), 
    'rse3JpZZzkOX40xR4fcdlw==')

WebUI.setEncryptedText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password_confirmation'), 
    'rse3JpZZzkOX40xR4fcdlw==')

WebUI.scrollToElement(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password_confirmation'),
	0)

WebUI.click(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/label_I agree to terms  Policy'))

WebUI.click(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/button_Register'))

boolean elementFound = WebUI.verifyElementPresent(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/Danger_Alert')
, 5, FailureHandling.OPTIONAL)

// Check if the element is found

if (elementFound != true) {
    // If element is found, verify its text
KeywordUtil.markFailed('')

}

WebUI.delay(3)

CustomKeywords.'com.helper.common.Common_Helper.writeOnExcel'(randomWord,randomEmail,'')

WebUI.closeBrowser()

String generateRandomString(int length) {
    def characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#%^&*()-_=+[]{}|;:\'",.<>/?'

    def random = new SecureRandom()

    return (0..length).collect({ 
            characters[random.nextInt(characters.length())]
        }).join()
}

String generateRandomEmail() {
    def domains = ['gmail', 'outlook', 'yahoo', 'icloud', 'zoho']

    def randomDomain = domains[new Random().nextInt(domains.size())]

    def randomName = 'Test' + new Random().nextInt(10000)
	
	def ran = randomName+"@"+randomDomain+".com"
	
    return ran
}