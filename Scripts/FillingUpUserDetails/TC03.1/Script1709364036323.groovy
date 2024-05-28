import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.setText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_name'), 
    'cK')

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_name'))

WebUI.takeScreenshot()

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

WebUI.waitForElementPresent(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_classicculture/h2_Please enter the One-Time password to ve_3546d2'), 
    5)

String OTP_page = 'Please enter the One-Time password to verify your account'

String OTP_page_Actual = WebUI.getText(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_classicculture/h2_Please enter the One-Time password to ve_3546d2'))

WebUI.takeScreenshot()

if (OTP_page_Actual == OTP_page) {
    KeywordUtil.markFailed('This Testcase is marked failed')
}

CustomKeywords.'com.helper.common.Common_Helper.writeOnExcel'('', randomEmail, '')

WebUI.closeBrowser()

String generateRandomEmail() {
    def domains = ['gmail', 'outlook', 'yahoo', 'icloud', 'zoho']

    def randomDomain = domains[new Random().nextInt(domains.size())]

    def randomName = 'Test' + new Random().nextInt(10000)

    def re = ((randomName + '@') + randomDomain) + '.com'

    return re
}

