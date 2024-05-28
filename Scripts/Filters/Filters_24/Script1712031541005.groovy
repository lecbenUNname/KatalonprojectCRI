import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

CustomKeywords.'com.helper.common.CommonMethod.logIntoApplication'()

WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))

WebUI.click(findTestObject('Filters/Filter_Button'))

WebUI.scrollToPosition(0, 300)

WebDriver driver = DriverFactory.getWebDriver()

WebElement byCategory = DriverFactory.getWebDriver().findElement(By.xpath('//label[@for=\'category-filter-1\']'))

byCategory.click()

WebElement brandFilter = DriverFactory.getWebDriver().findElement(By.xpath('//label[@for=\'brand-filter-1\']//span[2]'))

brandFilter.click()

String count1 = brandFilter.getText()

String countWithoutBrackets = count1.replaceAll('[^\\d]', '')

println(countWithoutBrackets)

brandFilter.click()

WebElement filterButtonIcon = DriverFactory.getWebDriver().findElement(By.xpath('//button[@class=\'btn btn-sm btn-default\']'))

filterButtonIcon.click()

WebElement productCount = DriverFactory.getWebDriver().findElement(By.xpath('//p//strong[@class=\'text-brand\']'))

String count2 = productCount.getText()

println(count2)

WebUI.verifyMatch(count2, countWithoutBrackets, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

