import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
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

WebUI.click(findTestObject('Object Repository/Filters/clickMainCategory'))
WebDriver driver = DriverFactory.getWebDriver()
List<WebElement> list = driver.findElements(By.xpath("//div[@id='mCSB_1']//input[@type='checkbox']"))
List<WebElement> list2 = driver.findElements(By.xpath("//div[@id='mCSB_1']//label"))
println(list.size())
 
 
	
for(int i=0; i<list.size(); i++)	{	
	if (list.get(i).isSelected()) {
		list.get(i).isSelected()
		
		String filterCategory = list2.get(i).getText()
		WebUI.click(findTestObject('Filters/filterButtonIcon'))
		WebUI.click(findTestObject('Object Repository/Filters/clickNavyBlueProduct'))
		WebUI.scrollToPosition(0, 700)
		String producCategory = WebUI.getText(findTestObject('Object Repository/Filters/productCategory'))
		if(producCategory.contains(filterCategory)) {
			println("Product Matched")
			break;
		}
	}}
WebUI.closeBrowser()