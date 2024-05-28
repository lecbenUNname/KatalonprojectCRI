import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
WebUI.callTestCase(findTestCase('Company/CommonTestcases'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Company/Page_Crazystylezs/span_Contact us'))

WebUI.click(findTestObject('Object Repository/Company/Page_Crazystylezs/span_Contact us'))

WebUI.delay(2)

findTestObject('Object Repository/Company/Company_About us breadcrums')

WebUI.scrollToPosition(0, 900)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Company/Company_name'))

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Company/Company_Email'))

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Company/Company_content'))

String a = WebUI.getAttribute(findTestObject('Object Repository/Company/Company_name'), 'Placeholder')

String b = WebUI.getAttribute(findTestObject('Object Repository/Company/Company_Email'), 'Placeholder')

String c = WebUI.getAttribute(findTestObject('Object Repository/Company/Company_content'), 'Placeholder')

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Company/Page_Contact/button_Send message'))

WebUI.click(findTestObject('Object Repository/Company/Page_Contact/button_Send message'))

WebUI.scrollToPosition(0, 1200)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Company/Company_ToastersuccessfullyToaster'))


if (a.contains('*')&&(b.contains('*'))&&c.contains('*'))
{
	
}
else
	KeywordUtil.markFailed("mandtory field not have the star")

WebUI.closeBrowser()

