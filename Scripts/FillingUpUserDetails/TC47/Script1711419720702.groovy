import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.security.SecureRandom as SecureRandom
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('FillingUpUserDetails/CommonFillingUpUserDetails/NavToRegisterPage'), [:], FailureHandling.STOP_ON_FAILURE)

String randomWord = generateRandomString(10)

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_name'), 
    randomWord)

//To Generate Random Email
String randomEmail = generateRandomEmail()

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_email'), 
    randomEmail)

String ranPassword = generateRandomString1(10)

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password'), 
    ranPassword)

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password_confirmation'), 
    ranPassword)

WebUI.click(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/label_I agree to terms  Policy'))

WebUI.click(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/button_Register'))

WebUI.delay(4)

CustomKeywords.'com.helper.common.Common_Helper.writeOnExcel'(randomWord,randomEmail,ranPassword)



WebUI.closeBrowser()

String generateRandomString(int length) {
    def characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz'

    def random = new SecureRandom()

    return (0..length).collect({ 
            characters[random.nextInt(characters.length())]
        }).join()
}

String generateRandomEmail() {
    def domains = ['gmail', 'outlook', 'yahoo', 'icloud', 'zoho']

    def randomDomain = domains[new Random().nextInt(domains.size())]

    def randomName = 'Test' + new Random().nextInt(10000)

	def ranemail = randomName+"   "+"@"+randomDomain +".com"
    return ranemail
}

String generateRandomString1(int length) {
    def characters1 = '1234567890'

    def random1 = new SecureRandom()

    return (0..length).collect({ 
            characters1[random1.nextInt(characters1.length())]
        }).join()
}

