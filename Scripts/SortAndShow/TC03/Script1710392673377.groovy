import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.maximizeWindow()

String URLTO = WebUI.getUrl()
if (URLTO.contains("crazystylezs") || URLTO.contains("myshopings"))
	 {
	WebUI.click(findTestObject('Object Repository/OrderTab/Page_Orders/AllowCookiesButton'))
}
WebUI.click(findTestObject('Object Repository/SortAndShow/Page_classicculture/a_Product'))

WebUI.click(findTestObject('Object Repository/SortAndShow/Page_Products/div_Show  12'))

WebUI.click(findTestObject('SortAndShow/Sortoption36_SortAndShow'))

WebUI.delay(3)

//productName = WebUI.getText(findTestObject('CartIcon/Img1PrdName'))
String PageOne = WebUI.getText(findTestObject('Object Repository/SortAndShow/Page_Products/div_Show  24'))

println(PageOne)

WebUI.click(findTestObject('Object Repository/SortAndShow/Page_Products/a_2'))

String PageTwo = WebUI.getText(findTestObject('Object Repository/SortAndShow/Page_Products/div_Show  24'))

println(PageTwo)

not_run: WebUI.mouseOver(findTestObject('Object Repository/SortAndShow/Page_Products/div_Show                                   _498057'))

if (PageOne.contains(PageTwo)) {
    println('Products counts are same for all the pages')

    WebUI.closeBrowser()
} else {
    println('Products counts are not same for all the pages.')

    KeywordUtil.markFailed('')
}

