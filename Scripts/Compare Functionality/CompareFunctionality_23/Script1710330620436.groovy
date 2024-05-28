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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()



List<WebElement> productlist = WebUI.findWebElements(findTestObject('Object Repository/Compare Functionality/CompareHighlight/CommomPathForAllProducts'), 
    30)

int productcount = productlist.size()
println(productcount)

Actions actions = new Actions(DriverFactory.getWebDriver())

JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

int productsAddedToCompare = 0

for (int i=1; (i<=productcount)&(productsAddedToCompare<=4); i++) {

	WebElement elementToHover = DriverFactory.getWebDriver().findElement(By.xpath((('(//div[contains(@class,\'product-img product-img-zoom\')])' + '[') + i) + ']'))
	
	js.executeScript('arguments[0].scrollIntoView', elementToHover)
	
	WebUI.delay(2)
	
	actions.moveToElement(elementToHover).build().perform()
	
	WebElement getthetextoftheelemetonebyone = DriverFactory.getWebDriver().findElement(By.xpath(('(//a[contains(@aria-label,\'Add To Compare\')])[' +
		i) + ']'))
	
	getthetextoftheelemetonebyone.click()
	
		WebUI.click(findTestObject('Object Repository/Compare Functionality/CompareHighlight/Close the toaster'))
	
		productsAddedToCompare++
	
	}
	
	String compareCountIcon = WebUI.getText(findTestObject('Object Repository/Compare Functionality/CompareHighlight/CountIconCompare'))
	println(compareCountIcon)
	
	WebUI.click(findTestObject('Compare Functionality/CompareHighlight/HighlightCompare'))
	WebUI.click(findTestObject('Object Repository/Compare Functionality/Page_Compare (1)/a_Remove'))
	String compareCountInComparePage = WebUI.getText(findTestObject('Object Repository/Compare Functionality/CompareHighlight/compareCountInComaprePage'))
	println(compareCountInComparePage)
	WebUI.click(findTestObject('Object Repository/Compare Functionality/CompareHighlight/Close the toaster'))
	
	WebUI.takeScreenshot()
	
	if (compareCountIcon == compareCountInComparePage) {
		KeywordUtil.markPassed("Counts in compare icon and compare page are equal")
	} else {
		KeywordUtil.markFailed("Counts in compare icon and compare page are not equal")
	}
	
	WebUI.closeBrowser()