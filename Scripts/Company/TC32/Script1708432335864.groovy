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


WebUI.callTestCase(findTestCase('Company/CommonTestcases'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Company/Page_Crazystylezs/span_Contact us'))

WebUI.click(findTestObject('Object Repository/Company/Page_Crazystylezs/span_Contact us'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 900)

String randomWord = generateRandomString(10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Company/Page_Contact/input_name'), 0)

WebUI.setText(findTestObject('Object Repository/Company/Page_Contact/input_name'), randomWord)

WebUI.click(findTestObject('Object Repository/Company/Page_Contact/button_Send message'))

WebUI.scrollToPosition(0, 1200)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Company/Company_ToastersuccessfullyToaster'))

WebUI.closeBrowser()

String generateRandomString(int length) {
    def characters = 'asdfghjklsdfghjkldfghjkl;ertyhujikl;1234567890@gddggdvvgdfvgdvgvgdvdvdgvdghgvcdbhvdv()-_=+[]{}|;:\'",.<>/?'

    def random = new SecureRandom()

    return (0..length).collect({ 
            characters[random.nextInt(characters.length())]
        }).join()
}

