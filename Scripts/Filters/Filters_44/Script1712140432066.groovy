import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

CustomKeywords.'com.helper.common.CommonMethod.logIntoApplication'()

WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))

WebUI.click(findTestObject('Filters/Filter_Button'))

WebUI.scrollToPosition(0, 300)

WebDriver driver = DriverFactory.getWebDriver()


WebElement tagFilter = DriverFactory.getWebDriver().findElement(By.xpath('//div[@id="mCSB_3_container"]//label[@for="tag-filter-6"]//span[2]'))

String count1 = tagFilter.getText()

String countWithoutBrackets = count1.replaceAll('[^\\d]', '')

println(countWithoutBrackets)

tagFilter.click()

WebUI.delay(2)

WebElement advancedfilter = driver.findElement(By.xpath('//a[@class=\'show-advanced-filters\']//span'))

advancedfilter.click()

WebUI.scrollToPosition(0, 700)

WebElement size = driver.findElement(By.xpath('//div[@id="mCSB_5_container"]//li[@data-slug="s"]'))

size.click()

WebElement filterButtonIcon = DriverFactory.getWebDriver().findElement(By.xpath('//button[@class=\'btn btn-sm btn-default\']'))

filterButtonIcon.click()

WebElement productCount = DriverFactory.getWebDriver().findElement(By.xpath('//p//strong[@class=\'text-brand\']'))

String count2 = productCount.getText()

println(count2)

WebUI.verifyMatch(count2, countWithoutBrackets, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()