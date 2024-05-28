import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()
CustomKeywords.'com.helper.common.CommonMethod.logIntoApplication'()

WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))
WebUI.click(findTestObject('Filters/Filter_Button'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Filters/ByCategory'), 0)

List<WebElement> categoryElements = WebUI.findWebElements(findTestObject('Object Repository/Filters/Common_By Categories'), 30)

/*
 * for (int i = 0; i < categoryElements.size(); i++) {
 * 
 * WebElement element = categoryElements.get(i)
 * 
 * TestObject elementObject = new TestObject()
 * 
 * elementObject.addProperty("xpath", ConditionType.EQUALS,
 * "(//div[@id='mCSB_1_container']//label//span[@class='d-inline-block'])[" + (i
 * + 1) + "]") String count = WebUI.getText(elementObject) println(count)
 * 
 * }
 */


  JavascriptExecutor js = (JavascriptExecutor)DriverFactory.getWebDriver()
  
  int Count = categoryElements.size()
  
  int elementCount = 0; // Initialize counter variable
  
  for (WebElement categoryElement : categoryElements) {
  
  String categoryNames = js.executeScript("return arguments[0].textContent;",
  categoryElement).toString()
  
  println("Category Names: ${categoryNames}")
  
  elementCount++; }
  
  if (Count !== elementCount) { KeywordUtil.markFailed('count wont match') }
  
  println("Total number of elements: ${elementCount}");
  
  WebUI.closeBrowser()
 