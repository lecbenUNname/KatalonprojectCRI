import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('ProfileTab/Profile Tab common'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Profiletab/Page_Profile/input_name'), '@')

WebUI.scrollToPosition(0, 250)

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Profiletab/SuccessALert'), 0)) {
    KeywordUtil.markFailed('name field accepts single character')
}

WebUI.takeScreenshot()

WebUI.closeBrowser()

