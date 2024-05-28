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

WebUI.scrollToElement(findTestObject('Object Repository/QuickView/QVColorSec'), 0)

boolean y = WebUI.verifyElementPresent(  findTestObject('Object Repository/QuickView/QVColorContainer'), 1, FailureHandling.OPTIONAL )

if(!y)
{
	KeywordUtil.markFailed()
	
}
WebUI.closeBrowser()