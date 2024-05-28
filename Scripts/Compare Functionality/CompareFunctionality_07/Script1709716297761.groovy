import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
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

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

WebUI.scrollToPosition(0, 1200)

WebUI.doubleClick(findTestObject('Compare Functionality/Page_Crazystylezs (1)/div_Hot                                    _6fe5af'))

WebUI.mouseOver(findTestObject('Object Repository/Compare Functionality/Page_Women Yellow Bandhani Printed Maxi Dress/i_Buy Now_fi-rs-shuffle'))

WebElement pseudoEle = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Compare Functionality/Page_Crazystylezs (1)/Tooltip_Compare'), 
    10)

JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

String display = 'return window.getComputedStyle(arguments[0], \':after\').getPropertyValue(\'content\')'

String pseudoElementContent = ((js.executeScript(display, pseudoEle)) as String)

WebUI.takeScreenshot()

if (pseudoElementContent.contains('Add To Compare')) {
    println('The parent element has ::after pseudo-element. Content: ' + display)

    KeywordUtil.markPassed('This Testcase is marked pass')
} else {
    System.out.println('The parent element does not have ::after pseudo-element.')

    KeywordUtil.markFailed('This Testcase is marked failed')

    WebUI.closeBrowser()
}

