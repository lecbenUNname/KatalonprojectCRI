import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriverException as WebDriverException
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
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

WebUI.callTestCase(findTestCase('CommonLoginPage/Url_Launch'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('ProductPageLayout/Page_Testing Product/ProductPageLayout/headerproduct'))

WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Crazystylezs/a_Women'))

WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Crazystylezs/a_Traditional Wear'))

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Crazystylezs/a_Lehanga Choli'))

WebUI.scrollToPosition(0, 400)

WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Lehanga Choli/a_Embroidered Semi-Stitched Lehenga Choli W_69179c'))

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Lehanga Choli/a_Embroidered Semi-Stitched Lehenga Choli W_69179c'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Embroidered Semi-Stitched Lehenga Chol_20dbcb/i_Embroidered Semi-Stitched Lehenga Choli W_a6a127'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Embroidered Semi-Stitched Lehenga Chol_20dbcb/i_Embroidered Semi-Stitched Lehenga Choli W_a6a127'))

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Embroidered Semi-Stitched Lehenga Chol_20dbcb/div_All Categories                         _72f775'))

WebUI.delay(4)

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/ProductPageLayout/Unwantedlensicon'), 
    30)

highlightElement(element)

WebUI.closeBrowser()

try {
    WebUI.verifyElementPresent(findTestObject('ProductPageLayout/Page_Testing Product/ProductPageLayout/lensicon'), 0)

    KeywordUtil.markFailed(' unwanted lensicon present .')
}
catch (WebDriverException e) {
} 

WebUI.closeBrowser()

void highlightElement(WebElement element) {
    String originalStyle = element.getAttribute('style')

    JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)

    WebUI.takeScreenshot()

    WebUI.delay(1)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}

