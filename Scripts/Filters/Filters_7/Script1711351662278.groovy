import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

CustomKeywords.'com.helper.common.CommonMethod.logIntoApplication'()

WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))

WebUI.click(findTestObject('Filters/Filter_Button'))

WebUI.scrollToPosition(0, 300)

List<WebElement> categoryFilters = WebUI.findWebElements(findTestObject('Object Repository/Filters/checbox_Filter'),0)
println(categoryFilters.size())
for(int i=1 ; i<=categoryFilters.size(); i++) {
	WebElement checkboxvisible = DriverFactory.getWebDriver().findElement(By.xpath("(//div[@id='mCSB_1_container']//label//span[@class='d-inline-block'])[" + i + "]"))
	boolean value = checkboxvisible.isDisplayed()
	if (checkboxvisible.isDisplayed()) {	
	String text =	checkboxvisible.getText()
	println(text)
	WebUI.dragAndDropByOffset(findTestObject('Object Repository/Filters/draggerBar'), 0, i)
	
	}
	//else {
//	KeywordUtil.markFailedAndStop("check box not displayed")
//	}
}

WebUI.closeBrowser()
