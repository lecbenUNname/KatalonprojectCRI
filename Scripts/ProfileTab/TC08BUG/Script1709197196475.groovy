import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.callTestCase(findTestCase('ProfileTab/Profile Tab common'), [:], FailureHandling.STOP_ON_FAILURE)


WebUI.setText(findTestObject('Object Repository/Profiletab/Page_Profile/input_name'), 'kannan                         babu')

WebUI.scrollToPosition(0, 250)

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Profiletab/SuccessALert'), 0)) {
    KeywordUtil.markFailed('Name field should not accepts blank space in between the name field')
}
WebUI.takeScreenshot()

WebUI.closeBrowser()

