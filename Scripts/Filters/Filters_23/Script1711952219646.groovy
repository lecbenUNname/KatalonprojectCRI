import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

CustomKeywords.'com.helper.common.CommonMethod.logIntoApplication'()

WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))

WebUI.click(findTestObject('Filters/Filter_Button'))

WebUI.scrollToPosition(0, 300)

WebDriver driver = DriverFactory.getWebDriver()



WebElement checkBox1 = driver.findElement(By.xpath("//label[@for='brand-filter-1']"))
checkBox1
checkBox1.click()
WebElement checkBox2 = driver.findElement(By.xpath("//label[@for='brand-filter-2']"))
checkBox2.click()

List<WebElement> list = driver.findElements(By.xpath('//div[@id=\'mCSB_2_container\']//input'))

List<WebElement> list2 = driver.findElements(By.xpath("//div[@id='mCSB_2_container']//span[@class='d-inline-block'][1]"))



List<String> selectedTexts = []

for(int i=0; i<list.size(); i++) {
    if(list.get(i).isSelected()) {
        String currentText = list2.get(i).getText()
        selectedTexts.add(currentText)
    }
}

WebElement filterButton = driver.findElement(By.xpath("//i[@class='fi-rs-filter mr-5 ml-0']"))
filterButton.click()


List<WebElement> list3 = driver.findElements(By.xpath("//h2//a"))

println(list3.size())

for(int i=0; i<list3.size(); i++) {
  
	
	WebUI.scrollToPosition(0, 300)
	
	
	
	  TestObject elementObject = new TestObject()
  elementObject.addProperty("xpath", ConditionType.EQUALS, "(//h2//a)[" + (i +1) + "]") 
	  WebUI.click(elementObject)
	    
	WebUI.delay(3)
	WebUI.scrollToPosition(0, 700)
    WebElement brand = driver.findElement(By.xpath("//span[contains(text(), 'Brands:')]/following-sibling::a"))
    String brandText = brand.getText()
    println(brandText)
    if(selectedTexts.contains(brandText)) { 
        println("Product Matched With Brand")
    } else {
        println("Product Not Matched With Brand")
    }
	WebUI.navigateToUrl("https://crazystylezs.com/products?brands%5B%5D=1&brands%5B%5D=2&sort-by=null&num=0")


	
}

WebUI.closeBrowser()

	
