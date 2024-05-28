import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

WebUI.scrollToPosition(0, 1200)

WebUI.mouseOver(findTestObject('Compare Functionality/Page_Crazystylezs (1)/div_Hot                                    _6fe5af'))

WebUI.click(findTestObject('Compare Functionality/Page_Crazystylezs/a_Sarees_action-btn hover-up js-add-to-comp_9a45bb'))

String toasterMessage = WebUI.getText(findTestObject('Object Repository/Compare Functionality/CompareHighlight/To compare list successfully'))

println(toasterMessage)

WebUI.click(findTestObject('Compare Functionality/CompareHighlight/Close the toaster'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Compare Functionality/Page_Crazystylezs (1)/div_Hot                                    _6fe5af'))

WebUI.click(findTestObject('Compare Functionality/Page_Crazystylezs/a_Sarees_action-btn hover-up js-add-to-comp_9a45bb'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Compare Functionality/CompareHighlight/Is already in compare list'), 
    0)

String toasterMessage2 = WebUI.getText(findTestObject('Object Repository/Compare Functionality/CompareHighlight/Is already in compare list'))

println(toasterMessage2)

if (!(toasterMessage2.equals(toasterMessage))) {
    KeywordUtil.markPassed('Toaster message text is correct: ' + toasterMessage)
} else {
    println('Toaster message text is incorrect: ' + toasterMessage)
}

WebUI.closeBrowser()