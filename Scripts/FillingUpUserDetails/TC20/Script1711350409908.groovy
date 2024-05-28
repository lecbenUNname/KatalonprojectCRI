import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.security.SecureRandom as SecureRandom
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('FillingUpUserDetails/CommonFillingUpUserDetails/NavToRegisterPage'), [:], FailureHandling.STOP_ON_FAILURE)

String randomWord = generateRandomString(10)

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_name'), 
    randomWord)

//To Generate Random Email
String randomEmail = generateRandomEmail()

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_email'), 
    randomEmail)

WebUI.setEncryptedText(findTestObject('FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password'), 
    'rse3JpZZzkOX40xR4fcdlw==')

WebUI.setEncryptedText(findTestObject('FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password_confirmation'), 
    'rse3JpZZzkOX40xR4fcdlw==')

WebUI.click(findTestObject('FillingUpUserDetail/FillingUpUserDetails/Page_Register/span_I agree to terms  Policy'))

WebUI.scrollToElement(findTestObject('FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password_confirmation'), 0)

WebUI.click(findTestObject('FillingUpUserDetail/FillingUpUserDetails/Page_Register/button_Register'))

if (WebUI.waitForElementPresent(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_classicculture/span_A One-Time password has been sent to Y_567d3e'),0)) {
WebUI.verifyElementText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_classicculture/span_A One-Time password has been sent to Y_567d3e'), 
    'A One-Time password has been sent to Your Email')

KeywordUtil.markFailed('This Testcase is marked failed')}

WebUI.delay(3)

CustomKeywords.'com.helper.common.Common_Helper.writeOnExcel'(randomWord,randomEmail,'')

WebUI.closeBrowser()

String generateRandomString(int length) {
    def characters = 'zxcvbnmasdfghjklqwertyuiop'

    def random = new SecureRandom()

    return (0..length).collect({ 
            characters[random.nextInt(characters.length())]
        }).join()
}

String generateRandomEmail() {
    def domains = ['gmail', 'outlook', 'yahoo', 'icloud', 'zoho']

    def randomDomain = domains[new Random().nextInt(domains.size())]

    def randomName = 'Test' + new Random().nextInt(10000)

    return "$randomName@$randomDomain"
}