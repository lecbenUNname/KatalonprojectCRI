import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.security.SecureRandom

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.callTestCase(findTestCase('FillingUpUserDetails/CommonFillingUpUserDetails/NavToRegisterPage'), [:], FailureHandling.STOP_ON_FAILURE)

String generateRandomString(int length) {
	def characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
	def random = new SecureRandom()
	
	return (0..<length).collect { characters[random.nextInt(characters.length())] }.join()
}

String randomWord = generateRandomString(10)


WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_name'), randomWord)

//To Generate Random Email
String generateRandomEmail() {
	def domains = ['gmail', 'outlook', 'yahoo', 'icloud', 'zoho']
	def randomDomain = domains[new Random().nextInt(domains.size())]
	def randomName = "Test" + new Random().nextInt(10000)
	return "${randomName}@${randomDomain}.com"
}

String randomEmail = generateRandomEmail()

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_email'), randomEmail)

String generateRandomString1(int length) {
	def characters1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#%^&*()1`234567890"
	def random1 = new SecureRandom()
	
	return (0..<length).collect { characters1[random1.nextInt(characters1.length())] }.join()
}

String ranPassword = generateRandomString(10)

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password'), ranPassword)

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password_confirmation'),
	ranPassword)

///
boolean value = WebUI.waitForElementPresent(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/EyeIcon'), 10)

if (value) {
	WebUI.click(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/EyeIcon'))
	WebUI.delay(3)
	WebUI.click(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/EyeIcon'))
		}
	
else {

	WebUI.takeScreenshot()
	
	KeywordUtil.markFailed("This Testcase is marked failed")
}

WebUI.delay(3)

CustomKeywords.'com.helper.common.Common_Helper.writeOnExcel'(randomWord,randomEmail,ranPassword)

WebUI.closeBrowser()