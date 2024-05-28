import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.security.SecureRandom as SecureRandom
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

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
    randomEmail)

WebUI.click(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/label_I agree to terms  Policy'))

WebUI.scrollToElement(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password_confirmation'), 
    0)

WebUI.click(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/button_Register'))

try {
	
    WebUI.verifyElementPresent(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/Danger_Alert'),0)
	
	CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/Danger_Alert'))
}
catch (Exception E) {
    KeywordUtil.markFailed()
	WebUI.takeScreenshot()
} 

WebUI.delay(3)

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

    def randomName = ((('Test' + new Random().nextInt(10000)) + '@') + randomDomain) + '.com'

    return randomName
}

String generateRandomString1(int length) {
    def characters1 = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#%^&*()1`234567890'

    def random1 = new SecureRandom()

    return (0..length).collect({ 
            characters1[random1.nextInt(characters1.length())]
        }).join()
}

