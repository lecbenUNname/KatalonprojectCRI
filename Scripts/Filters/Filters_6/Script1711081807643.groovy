import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.util.regex.Matcher as Matcher
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.ExpectedConditions as EC
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
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

// Click on the element to ensure the slider is visible
WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))

// Click on the filter button if necessary
WebUI.click(findTestObject('Filters/Filter_Button'))

WebUI.scrollToPosition(0, 300)

String cssmaxhgt = WebUI.getCSSValue(findTestObject('Filters/draggerBar'), 'max-height')

Matcher matcher = cssmaxhgt =~ '\\d+'

int numericValue = 0

if (matcher.find()) {
    numericValue = Integer.parseInt(matcher.group())
}

println(numericValue)

hightDragger = WebUI.getElementHeight(findTestObject('Filters/draggerBar'))

println(hightDragger)

List<WebElement> categoryElements = WebUI.findWebElements(findTestObject('Object Repository/Filters/Common_By Categories'), 
    30)

int numberOfElements = categoryElements.size()

int numberOfDrag = numberOfElements / 20

println(numberOfDrag)

hightDragger = WebUI.getElementHeight(findTestObject('Filters/draggerBar'))

println(hightDragger)

for (int k = 0; k < numberOfDrag; k++) {
    println(k)

    WebUI.dragAndDropByOffset(findTestObject('Object Repository/Filters/draggerBar'), 0, hightDragger * k)
}

JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

int Count = categoryElements.size()

int elementCount = 0 // Initialize counter variable

for (WebElement categoryElement : categoryElements) {
    String categoryNames = js.executeScript('return arguments[0].textContent;', categoryElement).toString()

    println("Category Names: $categoryNames")

    elementCount++
}

if (Count !== elementCount) {
    KeywordUtil.markFailed('count won\'t match')
}

println("Total number of elements: $elementCount")

//WebUI.closeBrowser()

