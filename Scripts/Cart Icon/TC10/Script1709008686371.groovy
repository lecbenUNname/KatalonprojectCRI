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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords

WebUI.callTestCase(findTestCase('Cart Icon/Common Test cases'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Cart Icon/Page_Crazystylezs/li_Product                                 _c208e7'))

WebUI.scrollToPosition(0, 600)

WebUI.mouseOver(findTestObject('Object Repository/Cart Icon/Cart_img'))

WebUI.click(findTestObject('Object Repository/Cart Icon/Cart_add'))

WebUI.scrollToPosition(0, 50)

WebUI.click(findTestObject('Object Repository/Cart Icon/Cart_Toastercloser'))

WebUI.mouseOver(findTestObject('Object Repository/Cart Icon/Cart_icon'))

WebUI.delay(3)


WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/Cart Icon/Cart_icon'),
	0)

highlightElement(element)



WebUI.click(findTestObject('Object Repository/Cart Icon/Cart_closer'))

WebUI.delay(3)

WebUI.closeBrowser()

void highlightElement(WebElement element) {
	String originalStyle = element.getAttribute('style')

	JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

	js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)

	WebUI.delay(2)

	js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}

