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

WebUI.callTestCase(findTestCase('CommonLoginPage/Url_Launch'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Searchbar/SearchBar/Page_Crazystylezs/input_All Categories_q'), 'women')

WebUI.scrollToElement(findTestObject('Object Repository/Searchbar/SearchBar/Page_Crazystylezs/div_Retro Typewriter Keyboard, 7KEYS Electr_292ba3'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Searchbar/SearchBar/Page_Crazystylezs/div_Women Navy Blue Maternity A-Line Midi D_7ddf78'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Searchbar/SearchBar/Page_Crazystylezs/div_Women Blue Maternity Shirt Midi Dress  _542e76'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Searchbar/SearchBar/Page_Crazystylezs/div_Women Grey Lace Empire Top             _2510c4'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Searchbar/SearchBar/Page_Crazystylezs/div_Women Brown Solid Top                  _9fbda1'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Searchbar/SearchBar/Page_Crazystylezs/div_Nintendo Switch with Neon Blue and Neon_2c9ebf'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Searchbar/SearchBar/Page_Crazystylezs/div_Women Teal Blue Croc Textured Two Fold _accc2e'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Searchbar/SearchBar/Page_Crazystylezs/div_TRENDOUX Winter Gloves for Men Women - _693114'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Searchbar/SearchBar/Page_Crazystylezs/div_Putuo Decor 3 Pieces Gold Mountain Meta_bc1633'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Searchbar/SearchBar/Page_Crazystylezs/div_Women Black Croc Textured Zip Around Wa_76b7e2'), 
    0)
WebUI.delay(3)
WebUI.closeBrowser()

