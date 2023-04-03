import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import java.util.*;
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.callTestCase(findTestCase('login_internal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/special_dates/dashboardBtn'))

WebUI.click(findTestObject('Object Repository/special_dates/setupAndConfMenu'))

WebUI.click(findTestObject('Object Repository/special_dates/special_date_subMenu'))

WebUI.click(findTestObject('Object Repository/special_dates/breadcrumb'))

WebUI.verifyElementPresent(findTestObject('Object Repository/special_dates/h1_title_sd'), 0)

TestObject selectorType = new TestObject()
selectorType.addProperty('css', ConditionType.EQUALS, ".page-link")

List<WebElement> typeList = WebUI.findWebElements(selectorType, 30)
int size = typeList.size()

TestObject selectorType2 = new TestObject()
selectorType2.addProperty('xpath', ConditionType.EQUALS, "//li[@class='paginate_button page-item next disabled']")

if(WebUI.verifyElementNotPresent(selectorType2, 1, FailureHandling.OPTIONAL)) {
	for(int i = 1; i <= size-2; i++) {
		String new_xpath = "//a[@data-dt-idx='$i']"
		TestObject dynamicObject = new TestObject('dynamicObject').addProperty('xpath', ConditionType.EQUALS, new_xpath)
		WebUI.click(dynamicObject)
		String num = WebUI.getText(findTestObject('Object Repository/special_dates/pagination_active'))
		String page = i
		WebUI.verifyMatch(num, page, false)
	}
}
else {
	String numPage = WebUI.getText(findTestObject('Object Repository/special_dates/pagination_active'))
	
	WebUI.verifyMatch(numPage, '1', false)
}

WebUI.takeScreenshot()

WebUI.closeBrowser()