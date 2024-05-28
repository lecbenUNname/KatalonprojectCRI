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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://crazystylezs.com/')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

WebUI.mouseOver(findTestObject('Object Repository/Review/Page_Crazystylezs/div_Hot                                    _6fe5af'))

WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/div_Hot                                    _6fe5af'))

WebUI.scrollToPosition(0, 1000)

WebUI.click(findTestObject('CartLayout/AddToCartButtonInProductPage'))

WebUI.waitForElementVisible(findTestObject('CartLayout/Alert_ProductAlreadyExist'), 10)

String dangerMessage = WebUI.getText(findTestObject('CartLayout/Alert_ProductAlreadyExist'))

WebUI.verifyMatch(dangerMessage, 'Please login first!', true)

WebUI.closeBrowser()

