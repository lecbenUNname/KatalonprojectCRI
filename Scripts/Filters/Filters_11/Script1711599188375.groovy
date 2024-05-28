import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.thoughtworks.selenium.webdriven.commands.Click as Click

CustomKeywords.'com.helper.common.Common_Helper.allow_Cookies'()

CustomKeywords.'com.helper.common.Common_Helper.logIntoApplication'()

WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))

WebUI.click(findTestObject('Filters/Filter_Button'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Filters/lehangaCholiCheckbox'))

WebUI.click(findTestObject('Filters/sareeCheckbox'))

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> list = driver.findElements(By.xpath('//div[@id="mCSB_1_container"]//input[@type="checkbox"]'))

List<WebElement> list2 = driver.findElements(By.xpath('//div[@id="mCSB_1_container"]//label'))

List<WebElement> selectedCheckboxTexts = []

for (int i = 0; i < list.size(); i++) {
    if (list.get(i).isSelected()) {
        String text = list2.get(i).getText()

        selectedCheckboxTexts.add(text)
    }
}

println(selectedCheckboxTexts)

String text1 = ''

String text2 = ''

if (selectedCheckboxTexts.size() >= 2) {
    text1 = selectedCheckboxTexts.get(0)

    text2 = selectedCheckboxTexts.get(1)

    println('Text 1: ' + text1)

    println('Text 2: ' + text2)
} else {
    println('Error: Insufficient elements in the list')
}

WebUI.click(findTestObject('Object Repository/Filters/filterButtonIcon'))

List<WebElement> products = driver.findElements(By.xpath('//div[@class="product-category"]'))

println(products.size())

for (WebElement product : products) {
    String productName = product.getText().trim()

    if (productName.contains(text1)) {
        println('Product Lehanga Choli Matched')
    } else if (productName.contains(text2)) {
        println('Product Sarees Matched')
    } else {
        println('Product not Matched')
    }
}

WebUI.closeBrowser()

