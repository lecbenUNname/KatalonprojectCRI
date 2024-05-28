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

WebUI.callTestCase(findTestCase('Floating Headers/CommonTestcases'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Object Repository/Floating Headers/Page_Crazystylezs/a_Accessories'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Floating Headers/Page_Crazystylezs/a_Women Accessories'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Floating Headers/Page_Crazystylezs/a_Women Accessories'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Floating Headers/Page_Crazystylezs/ul_Footwear                                _c8b0e1'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Floating Headers/Page_Crazystylezs/ul_Footwear                                _c8b0e1'))

WebUI.click(findTestObject('Object Repository/Floating Headers/Page_Crazystylezs/a_Sports Accessories'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Floating Headers/Page_Sports Accessories/div_Filters   By Brands  ELEGANTE (11)   Sa_61255d'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Floating Headers/Page_Sports Accessories/div_Home                                   _d032c7'))

WebUI.closeBrowser()

