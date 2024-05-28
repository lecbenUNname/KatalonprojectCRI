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

WebUI.mouseOver(findTestObject('Object Repository/Floating Headers/Page_Crazystylezs/a_Product'))

WebUI.callTestCase(findTestCase('Floating Headers/CommonTestcases'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Floating Headers/Page_Crazystylezs/a_Men Western Wear'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Floating Headers/Page_Crazystylezs/a_Men Western Wear'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Floating Headers/Page_Crazystylezs/ul_Mens Bottom                             _91c98b'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Floating Headers/Page_Crazystylezs/a_Mens Bottom'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Floating Headers/Page_Crazystylezs/ul_Men Jeans                               _3933d2'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Floating Headers/Page_Crazystylezs/ul_Men Jeans                               _3933d2'))

WebUI.click(findTestObject('Object Repository/Floating Headers/Page_Crazystylezs/a_Men Jeans'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Floating Headers/Page_Men Jeans/div_Home                                   _881a0b'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Floating Headers/Page_Men Jeans/div_Home                                   _881a0b'))

WebUI.closeBrowser()

