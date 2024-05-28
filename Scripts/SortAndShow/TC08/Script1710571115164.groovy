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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.maximizeWindow()

String URLTO = WebUI.getUrl()
if (URLTO.contains("crazystylezs") || URLTO.contains("myshopings"))
	 {
	WebUI.click(findTestObject('Object Repository/OrderTab/Page_Orders/AllowCookiesButton'))
}

WebUI.click(findTestObject('Object Repository/SortAndShow/Page_classicculture/a_Product'))

WebUI.click(findTestObject('SortAndShow/Page_Products/div_Show  12'))

WebUI.click(findTestObject('Object Repository/SortAndShow/Sortoption36_SortAndShow'))

String PageOne = WebUI.getText(findTestObject('Object Repository/SortAndShow/Page_Products/div_Show  24'))

println(PageOne)

List<WebElement> productsCount = WebUI.findWebElements(findTestObject('Object Repository/SortAndShow/Page_Products/ProductList'), 
    30)

String productcount = productsCount.size()

println(productcount)

WebUI.delay(5)

if (PageOne.contains(productcount)) {
    println('Selected count and the product count which are show in page is same')

    WebUI.closeBrowser()
} else {
    println('Selected count and the product count which is show are page is not same')

    KeywordUtil.markFailed('')
}

WebUI.closeBrowser()

