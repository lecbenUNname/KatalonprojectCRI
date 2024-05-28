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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Login/button_Allow cookies'))

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_classicculture/img_svgInject rounded-circle'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_classicculture/a_Login'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profiletab/Page_Login/p_Dont have an account Create one'),
	0)

WebUI.setText(findTestObject('Object Repository/Profiletab/Page_Login/input_email'), GlobalVariable.UserName)

WebUI.setText(findTestObject('Object Repository/Profiletab/Page_Login/input_password'), GlobalVariable.Password)

WebUI.scrollToPosition(0, 280)

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Login/label_Remember me'))

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Login/button_Login'))

WebUI.click(findTestObject('Profiletab/Toaster message click'))
