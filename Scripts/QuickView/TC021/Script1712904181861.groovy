import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.helper.common.Common_Helper.launchWebsite'()

WebUI.setText(findTestObject('Object Repository/QuickView/input_All Categories_q'), GlobalVariable.QVimgSrch)

WebUI.sendKeys(findTestObject('Object Repository/QuickView/input_All Categories_q'), Keys.chord(Keys.ENTER))

WebUI.scrollToPosition(0, 400)

WebUI.mouseOver(findTestObject('Object Repository/QuickView/ProductMouseOver'))

WebUI.click(findTestObject('Object Repository/QuickView/QuickViewIcon'))

boolean x = WebUI.verifyElementPresent(findTestObject('Object Repository/QuickView/QuickPagePrdtBadge'), 1, FailureHandling.OPTIONAL)

if (x) {
		highlightElementndSS("(//div[@class='modal-body']//div[@class='product-badges'])["+1+"]")
		
		
		
}	
else {
	
	WebUI.takeScreenshot()
	KeywordUtil.markFailed()
}

WebUI.closeBrowser()

def highlightElementndSS(String xpath) {
    WebDriver driver = DriverFactory.getWebDriver()

    WebElement element = driver.findElement(By.xpath(xpath))

	boolean j = element.isDisplayed()
	if (j) {
    String originalStyle = element.getAttribute('style')

    JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 3px solid red; ' + originalStyle) + '\');', element)

    WebUI.takeScreenshot()

    js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 3px solid blue; ' + originalStyle) + '\');', element)

    WebUI.delay(1)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
	}
	
	}