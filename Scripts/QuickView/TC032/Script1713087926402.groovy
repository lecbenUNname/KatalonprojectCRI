import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
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

CustomKeywords.'com.helper.common.Common_Helper.launchWebsite'()

CustomKeywords.'com.helper.common.Common_Helper.logIntoApplication'()

WebUI.setText(findTestObject('Object Repository/QuickView/input_All Categories_q'), GlobalVariable.QVimgSrch)

WebUI.sendKeys(findTestObject('Object Repository/QuickView/input_All Categories_q'), Keys.chord(Keys.ENTER))

WebUI.scrollToPosition(0, 400)

WebUI.mouseOver(findTestObject('Object Repository/QuickView/ProductMouseOver'))

WebUI.click(findTestObject('Object Repository/QuickView/QuickViewIcon'))

WebUI.scrollToElement(findTestObject('Object Repository/QuickView/QVColorSec'), 0)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/QuickView/QVAddToCartBtn'))

WebUI.click(findTestObject('Object Repository/QuickView/QVAddToCartBtn'))

boolean y = WebUI.verifyElementPresent(findTestObject('Object Repository/QuickView/QVsucessToast'), 1, FailureHandling.OPTIONAL)



if (y) {
	CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/QuickView/QVsucessToast'))
	
	
	WebUI.click(findTestObject('Object Repository/QuickView/QVtstCloseBtn'))
	
	WebUI.click(findTestObject('Object Repository/QuickView/Modalclosebtn'))
	
    WebUI.scrollToPosition(0, 10)

    //
    WebUI.click(findTestObject('Object Repository/QuickView/QVheaderCarticon'))

    WebUI.click(findTestObject('Object Repository/QuickView/QVrmvIconCartPage'))
} else {
    KeywordUtil.markFailed()
}

WebUI.closeBrowser()


