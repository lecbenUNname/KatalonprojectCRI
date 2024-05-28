import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.security.SecureRandom

import com.kms.katalon.core.model.FailureHandling
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


WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password'), "               ")

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password_confirmation'),
	"               ")

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password'))

WebUI.click(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/label_I agree to terms  Policy'))

WebUI.click(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/button_Register'))

WebUI.waitForElementPresent(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_classicculture/h2_Please enter the One-Time password to ve_3546d2'),
	5)

WebUI.delay(3)

CustomKeywords.'com.helper.common.Common_Helper.writeOnExcel'(randomWord,randomEmail,'')

WebUI.closeBrowser()