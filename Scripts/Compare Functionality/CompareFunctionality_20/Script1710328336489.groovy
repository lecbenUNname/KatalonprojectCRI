import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

WebUI.scrollToPosition(0, 1200)

WebUI.mouseOver(findTestObject('Compare Functionality/Page_Crazystylezs (1)/div_Hot                                    _6fe5af'))

WebUI.click(findTestObject('Compare Functionality/Page_Crazystylezs/a_Sarees_action-btn hover-up js-add-to-comp_9a45bb'))

WebUI.click(findTestObject('Compare Functionality/CompareHighlight/Close the toaster'))

WebUI.click(findTestObject('Compare Functionality/Page_Crazystylezs (1)/span_Compare'))

WebUI.click(findTestObject('Compare Functionality/Page_Compare (1)/a_Remove'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Compare Functionality/CompareHighlight/To compare list successfully'), 
    0, FailureHandling.STOP_ON_FAILURE)) {
    String removeToaster = WebUI.getText(findTestObject('Object Repository/Compare Functionality/CompareHighlight/To compare list successfully'))

    println(removeToaster)

    if (!removeToaster.equals('Removed product Women Yellow Bandhani Printed Maxi Dress from compare list successfully!')) {
        KeywordUtil.markPassed('Remove toaster message text is correct: ' + removeToaster)
    } else {
        KeywordUtil.markFailed('Toaster message text is incorrect: ' + removeToaster)
    }
}

WebUI.closeBrowser()

