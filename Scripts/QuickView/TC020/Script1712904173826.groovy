import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import javax.swing.plaf.basic.BasicButtonListener.Actions

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.helper.common.Common_Helper.launchWebsite'()

WebUI.setText(findTestObject('Object Repository/QuickView/input_All Categories_q'), GlobalVariable.QVimgSrch)



WebUI.sendKeys(findTestObject('Object Repository/QuickView/input_All Categories_q'), Keys.chord(Keys.ENTER))

WebUI.scrollToPosition(0, 400)

///

WebUI.mouseOver(findTestObject('Object Repository/QuickView/ProductMouseOver')  )

WebUI.click(findTestObject('Object Repository/QuickView/QuickViewIcon')  )

//WebUI.mouseOver(findTestObject('Object Repository/QuickView2/QV/Page_Products/ImageQuickView'))
//
//WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

WebElement sourceElement = driver.findElement(By.xpath('//figure[@aria-hidden=\'false\']'))

Actions actions = new Actions(driver)

actions.dragAndDropBy(sourceElement, 100, 0).build().perform()

WebUI.delay(2)

WebUI.closeBrowser()