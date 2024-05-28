import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

CustomKeywords.'com.helper.common.CommonMethod.logIntoApplication'()

WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))

WebUI.click(findTestObject('Filters/Filter_Button'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Object Repository/Filters/eleganteCheckbox'))

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> list = DriverFactory.getWebDriver().findElements(By.xpath('//div[@id=\'mCSB_2_container\']//input'))

List<WebElement> brandlist = DriverFactory.getWebDriver().findElements(By.xpath('//div[@id=\'mCSB_2_container\']//label/span[not(contains(text(), \'(\'))]'))

for (int i = 0; i < list.size(); i++) {
    if (list.get(i).isSelected()) {
        list.get(i).isSelected()

        String filterBrand = brandlist.get(i).getText()

        WebUI.click(findTestObject('Filters/filterButtonIcon'))

        WebElement product = DriverFactory.getWebDriver().findElement(By.xpath('(//div[@class=\'product-cart-wrap mb-30\'])[1]'))

        WebUI.scrollToPosition(0, 400)
WebUI.delay(2)
        product.click()

        WebUI.scrollToPosition(0, 700)

        WebElement productName = DriverFactory.getWebDriver().findElement(By.xpath("//span[contains(text(), 'Brands:')]/following-sibling::a"))

        String p = productName.getText()
		println(p)

        if (p.contains(filterBrand)) {
			
			println("Product Matched")
			
			break;
        }
    }
}
WebUI.closeBrowser()