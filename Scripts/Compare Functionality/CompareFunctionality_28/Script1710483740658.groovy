import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

String toasterMessage = WebUI.getText(findTestObject('Object Repository/Compare Functionality/CompareHighlight/To compare list successfully'))

println(toasterMessage)

String successMessage = 'Added product Women Yellow Bandhani Printed Maxi Dress to cart successfully!'

WebUI.takeScreenshot()

if (!toasterMessage.equals(successMessage)) {
    KeywordUtil.markFailed('Toaster message indicates success: ' + toasterMessage)
} else {
    KeywordUtil.markPassed('Toaster message does not indicate success: ' + toasterMessage)
}

WebUI.closeBrowser()