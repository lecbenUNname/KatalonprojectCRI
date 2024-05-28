import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()
CustomKeywords.'com.helper.common.CommonMethod.logIntoApplication'()
WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))

WebUI.click(findTestObject('Filters/Filter_Button'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Filters/lehangaCholiCheckbox'))

WebDriver driver = DriverFactory.getWebDriver()
List<WebElement> list = driver.findElements(By.xpath("//div[@id='mCSB_1']//input[@type='checkbox']"))
List<WebElement> list2 = driver.findElements(By.xpath("//div[@id='mCSB_1']//label"))

for(int i=0; i<list.size(); i++) {
	if (list.get(i).isSelected()) {
		
		list.get(i).isSelected()	
		
		String lehangaCholiCheck = list2.get(i).getText()
		println(lehangaCholiCheck)
		
		WebUI.click(findTestObject('Filters/filterButtonIcon'))
		WebUI.click(findTestObject('Object Repository/Filters/productLehanga'))
		WebUI.scrollToPosition(0,700)
	String productLehangaName =	WebUI.getText(findTestObject('Object Repository/Filters/productLehangaName'))
	println(productLehangaName)
		
	if(productLehangaName.contains(lehangaCholiCheck)) {
		
		println("Product Matched")
		break;
		
		
	}
	//WebElement filterCategories = DriverFactory.getWebDriver().findElement(By.xpath("//button[@class='btn btn-sm btn-default']"))
	//filterCategories.click()
	//WebElement productLehanga = DriverFactory.getWebDriver().findElement(By.xpath("//a[text()='Digital Floral Flared Semi- Stitched Lehenga With Dupatta']"))
	//productLehanga.click()
	//WebUI.scrollToPosition(0, 700)
	//WebEelement productLehangaName = DriverFactory.getWebDriver().findElement(By.xpath('(//li[@class="mb-5"])[1]'))

	}}
WebUI.closeBrowser()