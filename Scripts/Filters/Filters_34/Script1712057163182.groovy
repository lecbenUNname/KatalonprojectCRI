import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()



WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))

WebUI.click(findTestObject('Filters/Filter_Button'))

WebUI.scrollToPosition(0, 300)

JavascriptExecutor js = (JavascriptExecutor)DriverFactory.getWebDriver()



List<WebElement> tagFilters = WebUI.findWebElements(findTestObject('Object Repository/Filters/checkBoxByTags'),0)
println(tagFilters.size())
//int elementCount = 0
for(int i=1 ; i<=tagFilters.size(); i++) {

	WebElement checkboxvisible = DriverFactory.getWebDriver().findElement(By.xpath("(//div[@id='mCSB_3_container']//label)[" + i + "]"))
	
	
	boolean value = checkboxvisible.isDisplayed()
	if (checkboxvisible.isDisplayed()) {
	String text =	checkboxvisible.getText()
	println(text)
	WebUI.takeScreenshot()
	WebUI.dragAndDropByOffset(findTestObject('Object Repository/Filters/draggerBarByTag'), 0, i)
	
	}
	else {
	KeywordUtil.markFailedAndStop("check box not displayed")
}
}
WebUI.closeBrowser()