import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling

WebUI.callTestCase(findTestCase('Company/CommonTestcases'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Object Repository/Company/Company_FAQ'))

String a = WebUI.getText(findTestObject('Object Repository/Company/Company_FAQ'))

WebUI.click(findTestObject('Object Repository/Company/Company_FAQ'))

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Company/Company_Faqs'))

String b = WebUI.getText(findTestObject('Object Repository/Company/Company_Faqs'))

println(a + b)

if (a != b) {
    KeywordUtil.markFailed('')
}

WebUI.closeBrowser()

