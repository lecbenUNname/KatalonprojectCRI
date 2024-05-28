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

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

WebUI.mouseOver(findTestObject('Object Repository/Review/Page_Crazystylezs/div_Hot                                    _6fe5af'))

WebUI.click(findTestObject('Object Repository/Review/Page_Crazystylezs/div_Hot                                    _6fe5af'))

WebUI.scrollToElement(findTestObject('CartLayout/ColorAreaInPrdtPage'), 1000)

WebUI.mouseOver(findTestObject('CartLayout/New Test Object'))

WebUI.click(findTestObject('CartLayout/New Test Object'))

WebUI.click(findTestObject('CartLayout/AddToCartButtonInProductPage'))

WebUI.scrollToElement(findTestObject('CartLayout/SearchBox'), 1000)

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'), 30)

highlightElement(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

WebUI.back()

WebUI.scrollToElement(findTestObject('CartLayout/SearchBox'), 1000)

WebElement element1 = WebUiBuiltInKeywords.findWebElement(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'), 30)


//highlightElement(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

WebUI.refresh()

WebUI.scrollToElement(findTestObject('CartLayout/SearchBox'), 1000)

WebElement element2 = WebUiBuiltInKeywords.findWebElement(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'), 30)

TestObject k = findTestObject('CartLayout/Page_Crazystylezs/a_Cart')
highlightElement(k)

WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

WebUI.closeBrowser()

def	highlightElement(TestObject yourElement) {
	
		   WebElement element = WebUiBuiltInKeywords.findWebElement(yourElement, 30)
	
		   String originalStyle = element.getAttribute('style')
	
		   JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)
	
		   js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 3px solid red; ' + originalStyle) + '\');', element)
	
		   WebUI.takeScreenshot()
		   js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 3px solid blue; ' + originalStyle) + '\');', element)
		   WebUI.delay(1)
	
		   js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
	   }
	   
	