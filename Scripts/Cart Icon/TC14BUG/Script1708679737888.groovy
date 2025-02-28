import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Cart Icon/Common Test cases'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Cart Icon/Page_Crazystylezs/li_Product                                 _c208e7'))

WebUI.scrollToPosition(0, 600)

WebUI.mouseOver(findTestObject('Object Repository/Cart Icon/Cart_img'))

WebUI.click(findTestObject('Object Repository/Cart Icon/Cart_add'))

WebUI.scrollToPosition(0, 750)

WebUI.mouseOver(findTestObject('Object Repository/Cart Icon/Cart_img'))

WebUI.click(findTestObject('Object Repository/Cart Icon/Cart_add'))

WebUI.scrollToPosition(0, 900)

WebUI.mouseOver(findTestObject('Object Repository/Cart Icon/Cart_img'))

WebUI.click(findTestObject('Object Repository/Cart Icon/Cart_add'))

WebUI.click(findTestObject('Object Repository/Cart Icon/Cart_Toastercloser'))

WebUI.click(findTestObject('Object Repository/Cart Icon/Cart_Toastercloser'))

WebUI.scrollToPosition(0, 50)

WebUI.mouseOver(findTestObject('Object Repository/Cart Icon/Cart_icon'))

findTestObject('Object Repository/Cart Icon/Cart_product img')

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Cart Icon/Cart_View'))


WebUI.mouseOver(findTestObject('Object Repository/Cart Icon/Cart_product img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Cart Icon/Cart_scrollbar'), 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()


