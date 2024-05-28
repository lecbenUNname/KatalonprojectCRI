import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

CustomKeywords.'com.helper.common.CommonMethod.logIntoApplication'()

WebUI.scrollToPosition(0, 1200)

WebUI.mouseOver(findTestObject('Compare Functionality/Page_Crazystylezs (1)/div_Hot                                    _6fe5af'))

WebUI.click(findTestObject('Compare Functionality/Page_Crazystylezs/a_Sarees_action-btn hover-up js-add-to-comp_9a45bb'))

WebUI.click(findTestObject('Compare Functionality/CompareHighlight/Close the toaster'))

WebUI.click(findTestObject('Compare Functionality/Page_Crazystylezs (1)/span_Compare'))

WebUI.click(findTestObject('Compare Functionality/CompareHighlight/Add to cart'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Compare Functionality/CompareHighlight/To compare list successfully'), 
    0, FailureHandling.STOP_ON_FAILURE)) {
    String successToaster = WebUI.getText(findTestObject('Object Repository/Compare Functionality/CompareHighlight/To compare list successfully'))

    println(successToaster)

    if (successToaster.contains('Added product Women Yellow Bandhani Printed Maxi Dress to cart successfully!')) {
        KeywordUtil.markPassed('Toaster message text is correct: ' + successToaster)
    } else {
        println('Toaster message text is incorrect: ' + successToaster)
    }
}

WebUI.closeBrowser()

