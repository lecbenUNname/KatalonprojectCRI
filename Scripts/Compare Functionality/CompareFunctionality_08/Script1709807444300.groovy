import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

WebUI.scrollToPosition(0, 1200)

WebUI.mouseOver(findTestObject('Compare Functionality/Page_Crazystylezs (1)/div_Hot                                    _6fe5af'))

WebUI.click(findTestObject('Compare Functionality/Page_Crazystylezs/a_Sarees_action-btn hover-up js-add-to-comp_9a45bb'))

WebUI.click(findTestObject('Compare Functionality/CompareHighlight/Close the toaster'), FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 50)

WebUI.click(findTestObject('Object Repository/Compare Functionality/Page_Crazystylezs (1)/a_Compare'))

// Verify the compare count in the compare icon
TestObject compareCountObject = findTestObject('Object Repository/Compare Functionality/CompareHighlight/CountIconCompare')

if (WebUI.verifyElementPresent(compareCountObject, 10)) {
    String compareCount = WebUI.getText(compareCountObject)

    println(compareCount)

    if ((compareCount != null) && compareCount.trim().equals('1')) {
        println('Compare count is correctly displayed as 1.')
    } else {
        println('Failed to verify the compare count.')
    }
}

WebUI.click(findTestObject('Object Repository/Compare Functionality/Page_Compare (1)/span_Remove'))

WebUI.click(findTestObject('Compare Functionality/CompareHighlight/Close the toaster'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Compare Functionality/Page_Compare (1)/a_Home'))

WebUI.closeBrowser()

