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

WebUI.doubleClick(findTestObject('Object Repository/Compare Functionality/CompareHighlight/Product Button'))

List<WebElement> productlist = WebUI.findWebElements(findTestObject('Object Repository/Compare Functionality/CompareHighlight/CommomPathForAllProducts'), 
    30)

int productcount = productlist.size()

Actions actions = new Actions(DriverFactory.getWebDriver())

JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

int productsAddedToCompare = 0

for (int i = 1; (i <= productcount) && (productsAddedToCompare < 12); i++) {
    WebElement elementToHover = DriverFactory.getWebDriver().findElement(By.xpath((('(//div[contains(@class,\'product-img product-img-zoom\')])' + 
            '[') + i) + ']'))

    js.executeScript('arguments[0].scrollIntoView(true);', elementToHover)

    WebUI.delay(3)

    actions.moveToElement(elementToHover).build().perform()

    WebElement getthetextoftheelemetonebyone = DriverFactory.getWebDriver().findElement(By.xpath(('(//a[contains(@aria-label,\'Add To Compare\')])[' + 
            i) + ']'))

    getthetextoftheelemetonebyone.click()

    WebUI.click(findTestObject('Object Repository/Compare Functionality/CompareHighlight/Close the toaster'))

    productsAddedToCompare++
}

WebUI.click(findTestObject('Compare Functionality/CompareHighlight/HighlightCompare'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 3400)

WebUI.click(findTestObject('Compare Functionality/CompareHighlight/Scroll to Element in compare page'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.RIGHT))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.RIGHT))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.RIGHT))

WebUI.delay(2)

/*
 * WebUI.mouseOver(findTestObject('Compare Functionality/Page_Compare (1)/a_Remove'))
 * 
 * try { Robot robot = new Robot()
 * 
 * for (int i = 0; i < 9; i++) { robot.keyPress(KeyEvent.VK_RIGHT)
 * 
 * robot.keyRelease(KeyEvent.VK_RIGHT)
 * 
 * Thread.sleep(500 // Optional: Add delay between each key press ) } } catch
 * (Exception e) { e.printStackTrace() }
 */
WebUI.verifyElementPresent(findTestObject('Object Repository/Compare Functionality/CompareHighlight/Add to cart'), 0)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Compare Functionality/CompareHighlight/Add to cart'), 0)) {
    // If the element is present, mark the test case as passed
    KeywordUtil.markPassed('Horizontal scroll verified successfully' // If the element is not present, mark the test case as failed
        )
} else {
    KeywordUtil.markFailed('Horizontal scroll not verified')
}

WebUI.closeBrowser()