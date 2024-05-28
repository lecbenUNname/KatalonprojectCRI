import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.security.SecureRandom as SecureRandom
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.callTestCase(findTestCase('Company/CommonTestcases'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Company/Page_Crazystylezs/span_Contact us'))

WebUI.click(findTestObject('Object Repository/Company/Page_Crazystylezs/span_Contact us'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 900)

String randomWord = generateRandomString(10)

WebUI.setText(findTestObject('Object Repository/Company/Page_Contact/input_name'), 'Lo@123gmail')

WebUI.mouseOver(findTestObject('Object Repository/Company/Page_Contact/button_Send message'))

WebUI.click(findTestObject('Object Repository/Company/Page_Contact/button_Send message'))

boolean a = WebUI.verifyElementPresent(findTestObject('Object Repository/Company/Field_Toatser'), 0, FailureHandling.OPTIONAL)

if (a == true) {
    KeywordUtil.markFailed('')
}

WebUI.waitForElementPresent(findTestObject('Object Repository/Company/Page_Contact/div_Name is requiredContent is required'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Company/Page_Contact/div_Name is requiredContent is required'))

WebUI.closeBrowser()

String generateRandomString(int length) {
    def characters = '@()-_=+[]{}|;:\'",.<>/?'

    def random = new SecureRandom()

    return (0..length).collect({ 
            characters[random.nextInt(characters.length())]
        }).join()
}

