import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.maximizeWindow()

String URLTO = WebUI.getUrl()
if (URLTO.contains("crazystylezs") || URLTO.contains("myshopings"))
	 {
	WebUI.click(findTestObject('Object Repository/OrderTab/Page_Orders/AllowCookiesButton'))
}

WebUI.click(findTestObject('Object Repository/SortAndShow/Page_classicculture/a_Product'))

WebUI.click(findTestObject('SortAndShow/Page_Products/div_Show  12'))

WebUI.click(findTestObject('Object Repository/SortAndShow/Sortoption12_SortAndShow'))

String PageOne = WebUI.getText(findTestObject('Object Repository/SortAndShow/Page_Products/div_Show  24'))

println(PageOne)

List<WebElement> productsCount = WebUI.findWebElements(findTestObject('Object Repository/SortAndShow/Page_Products/ProductList'), 
    30)

String productcount = productsCount.size()

println(productcount)

//TestObject[] elements = WebUI.findWebElements(findTestObject('Object Repository/SortAndShow/Page_Products/ProductList'))
//
//int elementCount = elements.size()
//
//println('Element count: ' + elementCount)
//JavascriptExecutor js = ((JavascriptExecutor) DriverFactory.getWebDriver())
//int elementCount = js.executeScript("return document.querySelectorAll('findTestObject('Object Repository/SortAndShow/Page_Products/ProductList')').length;")
//println("Element count: " + elementCount)
WebUI.delay(5)

//try {
//	WebUI.verifyMatch(PageOne, productcount, false)
//}
//catch (Exception e) {
//	KeywordUtil.markFailed('FAil')
// 
//	WebUI.closeBrowser()
//}
if (PageOne.contains(productcount)) {
    println('Selected count and the product count which are show in page is same')

    WebUI.closeBrowser()
} else {
    println('Selected count and the product count which is show are page is not same')

    KeywordUtil.markFailed('')
}

//if (PageOne == productcount ) {
//	println("Counts match: " + PageOne)
//} else {
//	println("Counts do not match:")
//	println("Count from source 1: " + PageOne)
//	println("Count from source 2: " + productcount)
//	KeywordUtil.markFailed("")
//}
WebUI.closeBrowser()

