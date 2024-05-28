import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import internal.GlobalVariable as Keys
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'com.helper.common.Common_Helper.launchWebsite'()

WebUI.scrollToPosition(0, GlobalVariable.HomePageScrollToPosition)

WebUI.takeScreenshot()

WebUI.mouseOver(findTestObject('Object Repository/QuickView/ProductMouseOver'))

WebUI.click(findTestObject('Object Repository/QuickView/QuickViewIcon'))

WebUI.click(findTestObject('Object Repository/QuickView/QuickViewActiveProductImage'))

WebUI.mouseOver(findTestObject('Object Repository/QuickView/MouseOverOnZoomImage'))

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/QuickView/MouseOverOnZoomImage'))



 



int x = numAfterOf(findTestObject('Object Repository/QuickView/ImgOfImgS'))
////
for (int i = 1; i < x; i++) {
	int k = numBeforeOf(findTestObject('Object Repository/QuickView/ImgOfImgS'))

	println(i + k)

	if (i == k) {
		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ARROW_RIGHT))
		
		
	} else {
		KeywordUtil.markFailed('')
	}
}

for (int i = 0; i < x; i++) {
	int k = numBeforeOf(findTestObject('Object Repository/QuickView/ImgOfImgS'))


	if (i < k) {
		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ARROW_LEFT))
	} else {
		KeywordUtil.markFailed('')
	}
}

WebUI.click(findTestObject('Object Repository/QuickView/CloseBtnQuickViewZoomImg'))

WebUI.closeBrowser()

def	numAfterOf(TestObject yourElement) {
	
	String fullText = WebUI.getText(yourElement);
	
	// Extracting the number after "of"
	String numberString = fullText.substring((fullText.indexOf("of ") + 3))
	
	// Converting the extracted string to an integer
	int number = Integer.parseInt(numberString)
	
	// Printing the number
	return number
			}
			
			
def	numBeforeOf(TestObject yourElement) {
	
	String EleText = WebUI.getText(yourElement)
	String numberString = EleText.substring(0, EleText.indexOf(" of"))
	int number = Integer.parseInt(numberString)
	
	return(number)
	
			}