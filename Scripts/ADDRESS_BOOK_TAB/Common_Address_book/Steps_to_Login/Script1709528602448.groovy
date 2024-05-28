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

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.maximizeWindow()

String URLTO = WebUI.getUrl()
		if (URLTO.contains("crazystylezs") || URLTO.contains("myshopings")) {
			WebUI.click(findTestObject('Object Repository/ADDRESS_BOOK_TAB/Address Book Object/Page_Crazystylezs/button_Allow cookies'))
		}

WebUI.click(findTestObject('ADDRESS_BOOK_TAB/Common_Address_book/Steps_to_Login/Page_Crazystylezs/span_Account'))

WebUI.setText(findTestObject('ADDRESS_BOOK_TAB/Common_Address_book/Steps_to_Login/Page_Login/input_Create one_email'), GlobalVariable.UserName)

WebUI.setText(findTestObject('ADDRESS_BOOK_TAB/Common_Address_book/Steps_to_Login/Page_Login/input_Create one_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('ADDRESS_BOOK_TAB/Common_Address_book/Steps_to_Login/Page_Login/button_Login'))

