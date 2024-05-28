import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.security.SecureRandom

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('FillingUpUserDetails/CommonFillingUpUserDetails/NavToRegisterPage'), [:], FailureHandling.STOP_ON_FAILURE)

String randomWord = generateRandomString(10)

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_name'), randomWord)

// Generate Random Email
String randomEmail = generateRandomEmail()

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_email'), randomEmail)

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password'), 'YourPassword')
WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password_confirmation'), 'YourPassword')

WebUI.click(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/span_I agree to terms  Policy'))

WebUI.scrollToElement(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password_confirmation'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/button_Register'))

boolean check =WebUI.verifyElementPresent(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/Danger_Alert'), 3, FailureHandling.OPTIONAL)

if (check != true) {
	KeywordUtil.markFailed('Element is displayed')
}

WebUI.closeBrowser()

String generateRandomString(int length) {
	def characters = 'QAZWSDCEFVRGBTHNYJMUKilopasdfghjkzxcvbn'
	def random = new SecureRandom()
	return (0..length).collect({
		characters[random.nextInt(characters.length())]
	}).join()
}

String generateRandomEmail() {
	def domains = ['gmail', 'outlook', 'yahoo', 'icloud', 'zoho']
	def randomDomain = domains[new Random().nextInt(domains.size())]
	def randomName = 'Test' + new Random().nextInt(10000) +'@'+randomDomain+'.com'
	return randomName
}
