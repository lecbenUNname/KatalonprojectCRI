import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonLoginPage/Url_Launch'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/BrowserAllCategories/Page_Crazystylezs/i_Browse_fi-rs-angle-down'))

WebUI.verifyElementVisible(findTestObject('BrowserAllCategories/Page_Crazystylezs/div_Women                                  _84efbd'))

WebUI.click(findTestObject('BrowserAllCategories/Click_Dummy'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

try {
    WebUI.verifyElementNotPresent(findTestObject('BrowserAllCategories/Page_Crazystylezs/div_Women _84efbd'), 30)

    KeywordUtil.markFailed('Browse all categories" dropdown window is not closing clickin on outsite')
}
catch (Exception e) {
} 

WebUI.closeBrowser()

