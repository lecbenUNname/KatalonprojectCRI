import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.security.SecureRandom as SecureRandom

WebUI.callTestCase(findTestCase('FillingUpUserDetails/CommonFillingUpUserDetails/NavToRegisterPage'), [:], FailureHandling.STOP_ON_FAILURE)

String randomWord = generateRandomString(10)

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_name'),
	randomWord)

//To Generate Random Email
String randomEmail = generateRandomEmail()

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_email'),
	randomEmail)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_email'))


WebUI.setEncryptedText(findTestObject('FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password'),
	'rse3JpZZzkOX40xR4fcdlw==')

WebUI.setEncryptedText(findTestObject('FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password_confirmation'),
	'rse3JpZZzkOX40xR4fcdlw==')

WebUI.click(findTestObject('FillingUpUserDetail/FillingUpUserDetails/Page_Register/span_I agree to terms  Policy'))

WebUI.scrollToElement(findTestObject('FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password_confirmation'), 0)

WebUI.click(findTestObject('FillingUpUserDetail/FillingUpUserDetails/Page_Register/button_Register'))

WebUI.delay(3)


////

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.click(findTestObject('Object Repository/FillingUpUserDetail/CommonFillingUpUserDetails/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

WebUI.click(findTestObject('Object Repository/FillingUpUserDetail/CommonFillingUpUserDetails/Page_Login/a_Create one'))

WebUI.scrollToPosition(0, 310)


String randomWord1 = generateRandomString(10)

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_name'),
	randomWord1)

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_email'),
	randomEmail)

WebUI.setEncryptedText(findTestObject('FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password'),
	'rse3JpZZzkOX40xR4fcdlw==')

WebUI.setEncryptedText(findTestObject('FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password_confirmation'),
	'rse3JpZZzkOX40xR4fcdlw==')

WebUI.click(findTestObject('FillingUpUserDetail/FillingUpUserDetails/Page_Register/span_I agree to terms  Policy'))

WebUI.scrollToElement(findTestObject('FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password_confirmation'), 0)

WebUI.click(findTestObject('FillingUpUserDetail/FillingUpUserDetails/Page_Register/button_Register'))

WebUI.verifyElementPresent(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/Danger_Alert'),0)

WebUI.delay(3)

WebUI.closeBrowser()

CustomKeywords.'com.helper.common.Common_Helper.writeOnExcel'(randomWord,randomEmail,'')

CustomKeywords.'com.helper.common.Common_Helper.writeOnExcel'(randomWord1,randomEmail,'')

String generateRandomString(int length) {
	def characters = 'asdfghjklzxcvbnmqwertyuiop'

	def random = new SecureRandom()

	return (0..length).collect({
			characters[random.nextInt(characters.length())]
		}).join()
}

String generateRandomEmail() {
	
	def domains = ['gmail', 'outlook', 'yahoo', 'icloud', 'zoho']

	def randomDomain = domains[new Random().nextInt(domains.size())]

	def randomName ='Test'+ new Random().nextInt(10000)
	
	def rand = randomDomain+"@"+randomName+".com"

	return rand
}