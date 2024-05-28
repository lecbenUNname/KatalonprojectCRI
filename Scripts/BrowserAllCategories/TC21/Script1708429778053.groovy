import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CommonLoginPage/Url_Launch'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/BrowserAllCategories/Page_Crazystylezs/a_Browse All Categories'))

WebUI.click(findTestObject('ProductPageLayout/Page_Testing Product/ProductPageLayout/headerproduct'))

/*
 * List<WebElement> thumbnaillist = WebUI.findWebElements(findTestObject(''),
 * 30)
 * 
 * int productcount = thumbnaillist.size()
 * 
 * WebUI.verifyElementPresent(findTestObject('Object
 * Repository/BrowserAllCategories/Page_Women/div_Request-URI Too Long'), 0)
 * 
 */

for (int i = 0; i <= 17; i++) {
    WebUI.scrollToPosition(0, 2250)

    WebUI.click(findTestObject('Object Repository/ProductPageLayout/Rightarrowbutton'))

	
	boolean check = WebUI.waitForElementPresent(findTestObject('Object Repository/OverView/Alertmessage'), 1, FailureHandling.CONTINUE_ON_FAILURE);
	if (check) {
		KeywordUtil.markFailed();
		break;
	}
}

WebUI.closeBrowser()



