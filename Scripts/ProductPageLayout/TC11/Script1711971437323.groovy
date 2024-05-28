import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
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
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('ProductPageLayout/Common_PPL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('ProductPageLayout/Testing_product'))

WebUI.click(findTestObject('ProductPageLayout/Testing_product'))

WebUI.scrollToPosition(0, 400)

WebUI.takeScreenshot()

List<WebElement> thumbnaillist = WebUI.findWebElements(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/CommonThumbnail_productpage'), 
    30)

int productcount = thumbnaillist.size()

println(productcount)

for (int i = 0; i <= productcount; i++) {
    WebUI.click(findTestObject('ProductPageLayout/Rightarrowbutton'))

    WebUI.delay(3)
}

try {
    WebUI.verifyElementVisible(findTestObject('Object Repository/ProductPageLayout/SecondProductImage_productpage'))
}
catch (Exception E) {
    KeywordUtil.markFailed('last thumbnailimage not shown')
} 

WebUI.closeBrowser()

