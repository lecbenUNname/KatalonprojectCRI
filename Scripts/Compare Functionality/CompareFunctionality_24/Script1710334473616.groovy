import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

WebUI.scrollToPosition(0, 1200)

WebUI.mouseOver(findTestObject('Compare Functionality/Page_Crazystylezs (1)/div_Hot                                    _6fe5af'))

WebUI.click(findTestObject('Compare Functionality/Page_Crazystylezs/a_Sarees_action-btn hover-up js-add-to-comp_9a45bb'))

WebUI.click(findTestObject('Compare Functionality/CompareHighlight/Close the toaster'))

WebUI.click(findTestObject('Compare Functionality/Page_Crazystylezs (1)/span_Compare'))

WebUI.doubleClick(findTestObject('Compare Functionality/CompareHighlight/clickOnProductCompare'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Compare Functionality/CompareHighlight/verifyAddToCartInProductPage'), 
    0)

WebUI.scrollToPosition(0, 500)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Compare Functionality/CompareHighlight/verifyAddToCartInProductPage'), 
    0)) {
    KeywordUtil.markPassed('Element present')
} else {
    KeywordUtil.markFailedAndStop('Element not present')
}

WebUI.closeBrowser()

