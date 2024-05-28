import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

WebUI.scrollToPosition(0, 1200)

WebUI.mouseOver(findTestObject('Compare Functionality/Page_Crazystylezs (1)/div_Hot                                    _6fe5af'))

WebUI.click(findTestObject('Compare Functionality/Page_Crazystylezs/a_Sarees_action-btn hover-up js-add-to-comp_9a45bb'))

WebUI.click(findTestObject('Compare Functionality/CompareHighlight/Close the toaster'))

WebUI.click(findTestObject('Compare Functionality/Page_Crazystylezs (1)/span_Compare'))

WebUI.scrollToPosition(0, 500)

String categoryOfFirstProduct = WebUI.getText(findTestObject('Compare Functionality/CompareHighlight/ProductTextCompare'))

WebUI.delay(2)

WebUI.click(findTestObject('Compare Functionality/CompareHighlight/electronicsAccessories'))

WebUI.scrollToPosition(0, 500)

WebUI.mouseOver(findTestObject('Compare Functionality/CompareHighlight/retroTypewriter'))

WebUI.click(findTestObject('Object Repository/Compare Functionality/CompareHighlight/CommonClickOnCompareIcon'))

WebUI.click(findTestObject('Compare Functionality/CompareHighlight/Close the toaster'))

WebUI.click(findTestObject('Compare Functionality/Page_Crazystylezs (1)/span_Compare'))

WebUI.scrollToPosition(0, 500)

String categoryOfSecondProduct = WebUI.getText(findTestObject('Compare Functionality/CompareHighlight/retroTypewriter2'))

WebUI.takeScreenshot()

if (categoryOfFirstProduct.equals(categoryOfSecondProduct)) {
    KeywordUtil.markPassed('Both products belong to the same category.')
} else {
    KeywordUtil.markFailed('Products belong to different categories.')

    WebUI.closeBrowser()
}

