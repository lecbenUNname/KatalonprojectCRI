import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

CustomKeywords.'com.helper.common.CommonMethod.logIntoApplication'()

WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))

WebUI.click(findTestObject('Filters/Filter_Button'))

WebUI.scrollToPosition(0, 300)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> tagList = DriverFactory.getWebDriver().findElements(By.xpath('//div[@id="mCSB_3_container"]//span[2]'))

JavascriptExecutor js = (JavascriptExecutor)DriverFactory.getWebDriver()
  
  int Count = tagList.size()
  
  int elementCount = 0;

for(WebElement tag: tagList) {
	
	 String tagCount = js.executeScript("return arguments[0].textContent;",tag).toString()
  
  println("Tag Counts: ${tagCount}")
  
  elementCount++; }
  
  if (Count !== elementCount) { KeywordUtil.markFailed('count wont match') }
  
  println("Total number of elements: ${elementCount}");
  
 // WebUI.closeBrowser()