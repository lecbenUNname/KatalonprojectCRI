import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

CustomKeywords.'com.helper.common.CommonMethod.logIntoApplication'()

WebUI.scrollToPosition(0, 1200)

WebUI.mouseOver(findTestObject('Compare Functionality/Page_Crazystylezs (1)/div_Hot                                    _6fe5af'))

WebUI.click(findTestObject('Compare Functionality/Page_Crazystylezs/a_Sarees_action-btn hover-up js-add-to-comp_9a45bb'))

WebUI.click(findTestObject('Compare Functionality/CompareHighlight/Close the toaster'))

WebUI.click(findTestObject('Compare Functionality/Page_Crazystylezs (1)/span_Compare'))

WebUI.click(findTestObject('Compare Functionality/CompareHighlight/Add to cart'))

WebUI.click(findTestObject('Compare Functionality/CompareHighlight/Close the toaster'))

WebUI.click(findTestObject('Compare Functionality/CompareHighlight/cartIconForCompare'))

WebUI.verifyElementPresent(findTestObject('Compare Functionality/CompareHighlight/Checkout'), 0)

if (WebUI.verifyElementPresent(findTestObject('Compare Functionality/CompareHighlight/Checkout'), 0)) {
    KeywordUtil.markPassed('Element present')
} else {
    KeywordUtil.markFailed('Element not present')
}

WebUI.closeBrowser()

