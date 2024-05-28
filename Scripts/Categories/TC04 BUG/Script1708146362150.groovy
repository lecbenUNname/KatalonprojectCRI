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
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Categories/CommonTestcases'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Categories/Categories_Men'))


String a = WebUI.getText(findTestObject('Object Repository/Categories/Categories_Men'))

WebUI.click(findTestObject('Object Repository/Categories/Categories_Men'))

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Categories/Categories_breadcrums'))

String b = WebUI.getText(findTestObject('Object Repository/Categories/Page_Crazystylezs/Breadcrums'))
findTestObject('Object Repository/Categories/Categories_Men')
println(a + b)

if (a !== b) {
    KeywordUtil.markFailed('')
}

WebUI.waitForElementPresent(findTestObject('Object Repository/Categories/Page_Mens/div_Home                                   _9f83f0'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Categories/Page_Mens/div_Mens'))

WebUI.closeBrowser()
