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
if (URLTO.contains("crazystylezs") || URLTO.contains("myshopings"))
	 {
	WebUI.click(findTestObject('Object Repository/OrderTab/Page_Orders/AllowCookiesButton'))
}

WebUI.click(findTestObject('Object Repository/SortAndShow/Page_classicculture/a_Product'))

WebUI.click(findTestObject('Object Repository/SortAndShow/Page_Products/div_Sort by'))

WebUI.scrollToPosition(0, 200)

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Default'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Default'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Oldest'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Oldest'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Oldest'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Newest'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Newest'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Price low to high'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Price low to high'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Price high to low'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Price high to low'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Name A-Z'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Name A-Z'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Name  Z-A'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Name  Z-A'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Rating low to high'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Rating low to high'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Rating high to low'))

WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/a_Rating high to low'))

WebUI.closeBrowser()

