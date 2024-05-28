import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

WebUI.scrollToPosition(0, 1200)

WebUI.mouseOver(findTestObject('Compare Functionality/Page_Crazystylezs (1)/div_Hot                                    _6fe5af'))

WebUI.click(findTestObject('Compare Functionality/Page_Crazystylezs/a_Sarees_action-btn hover-up js-add-to-comp_9a45bb'))

WebUI.click(findTestObject('Compare Functionality/CompareHighlight/Close the toaster'), FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 50)

WebUI.click(findTestObject('Object Repository/Compare Functionality/Page_Crazystylezs (1)/a_Compare'))

String compareCount = WebUI.getText(findTestObject('Object Repository/Compare Functionality/CompareHighlight/CountIconCompare'))

WebUI.takeScreenshot()

if (compareCount != null) {
    compareCount = compareCount.trim()

    if (compareCount.equals('1')) {
        println('Compare count is correctly displayed as 1.')
    } else if (compareCount.equals('0')) {
        println('No items are currently in compare.')
    }
}

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Compare Functionality/Page_Compare (1)/a_Home'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Compare Functionality/Page_Crazystylezs (1)/a_Compare'))

WebUI.takeScreenshot()

// Verify if the product is still present in the compare list
if (WebUI.verifyElementPresent(findTestObject('Compare Functionality/CompareHighlight/Verfiy dress is presnt in compare'), 
    2, FailureHandling.CONTINUE_ON_FAILURE)) {
    println('Product is still present in the compare list after navigating back and refreshing the page.')
} else {
    KeywordUtil.markFailed('Product is not present in the compare list after navigating back and refreshing the page.')
}

WebUI.closeBrowser()

