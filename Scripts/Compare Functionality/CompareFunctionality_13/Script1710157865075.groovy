import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

WebUI.doubleClick(findTestObject('Object Repository/Compare Functionality/CompareHighlight/Product Button'))

List<WebElement> productlist = WebUI.findWebElements(findTestObject('Object Repository/Compare Functionality/CompareHighlight/CommomPathForAllProducts'), 
    30)

int productcount = productlist.size()

println(productcount)

Actions actions = new Actions(DriverFactory.getWebDriver())

JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

int productsAddedToCompare = 0

for (int i = 1; i <= productcount; i++) {
    //WebUI.scrollToElement(findTestObject('Object Repository/Compare Functionality/CompareHighlight/ScrolInProduct'), 2)
    WebElement elementToHover = DriverFactory.getWebDriver().findElement(By.xpath((('(//div[contains(@class,\'product-img product-img-zoom\')])' + 
            '[') + i) + ']'))

    js.executeScript('arguments[0].scrollIntoView(true);', elementToHover)

    WebUI.delay(3)

    actions.moveToElement(elementToHover).build().perform()

    WebElement getthetextoftheelemetonebyone = DriverFactory.getWebDriver().findElement(By.xpath(('(//a[contains(@aria-label,\'Add To Compare\')])[' + 
            i) + ']'))

    getthetextoftheelemetonebyone.click()

    println('Product ${i + 1} added to the compare list.')

    WebUI.click(findTestObject('Object Repository/Compare Functionality/CompareHighlight/Close the toaster'))

    productsAddedToCompare++

WebUI.takeScreenshot()	
    if (productsAddedToCompare > 10) {
        println('More than 10 products added to compare page. Failing the test case.')

		/*
		 * WebUI.comment('More than 10 products added to compare page. Test case
		 * failed.')
		 * 
		 * WebUI.delay(1)
		 * 
		 * WebUI.verifyMatch(productsAddedToCompare, 10, false, 'More than 10 products
		 * added to compare page')
		 */

        KeywordUtil.markFailed("More than 10 products added to compare page")
    }
}

WebUI.closeBrowser()

