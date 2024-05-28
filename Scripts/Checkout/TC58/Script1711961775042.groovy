import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.security.SecureRandom as SecureRandom
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

WebUI.callTestCase(findTestCase('Checkout/searchForProduct'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 10)

WebUI.click(findTestObject('Object Repository/Checkout/Cart_Icon'))

WebUI.waitForPageLoad(5)

WebUI.scrollToPosition(0, 350)

if (WebUI.getUrl().contains('cart')) {
		
	WebUI.click(findTestObject('Object Repository/Checkout/RemoveIconcartPage'))
}

WebUI.closeBrowser()

String generateRandomchar(int length) {
    def characters = 'zxcvbnmasdfghjklqwertyuiop'

    def random = new SecureRandom()

    return (0..length).collect({ 
            characters[random.nextInt(characters.length())]
        }).join()
}

String generateRandomNo(int length) {
    def characters = '1234567890'

    def random = new SecureRandom()

    return (0..length).collect({ 
            characters[random.nextInt(characters.length())]
        }).join()
}

String generateRandomEmail() {
    def domains = ['gmail', 'outlook', 'yahoo', 'icloud', 'zoho']

    def randomDomain = domains[new Random().nextInt(domains.size())]

    def randomName = 'Test' + new Random().nextInt(10000)

    def re = ((randomName + '@') + randomDomain) + '.com'

    return re
}

String trimRandomPart(String Get_URL_checkout) {
    int lastSlashIndex = Get_URL_checkout.lastIndexOf('/')

    String trimmedUrl = Get_URL_checkout.substring(0, lastSlashIndex + 1)

    return trimmedUrl
}

String trimRandomPart1(String Get_URL_if_Checkout) {
    int lastSlashIndex = Get_URL_if_Checkout.lastIndexOf('/')

    String trimmedUrl = Get_URL_if_Checkout.substring(0, lastSlashIndex + 1)

    return trimmedUrl
}