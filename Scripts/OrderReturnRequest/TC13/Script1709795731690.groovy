import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CommonLoginPage/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('CommonTestCases/mouseoveruserimage'))

WebUI.mouseOver(findTestObject('Object Repository/BrowserAllCategories/OrderReturnReques/Page_classicculture/a_My Account'))

WebUI.click(findTestObject('Object Repository/BrowserAllCategories/OrderReturnReques/Page_classicculture/a_My Account'))

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('Object Repository/BrowserAllCategories/OrderReturnReques/Page_Account information/a_Order return requests'))

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('Object Repository/BrowserAllCategories/OrderReturnReques/Page_Order Return Requests/a_View'))

WebUI.scrollToPosition(0, 500)

WebUI.takeScreenshot()

WebElement labelElement = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/BrowserAllCategories/OrderReturnReques/Page_Account information/a_Order return requests'), 
    10)

String labelColor = labelElement.getCssValue('background-color')

if (labelColor == 'rgba(224, 0, 0, 1)') {
    KeywordUtil.markPassed('order return requests bacground color red  as Pass.')
} else {
    KeywordUtil.markFailed('order return requests nothing to bacground color as failed.')
}

WebUI.closeBrowser()

