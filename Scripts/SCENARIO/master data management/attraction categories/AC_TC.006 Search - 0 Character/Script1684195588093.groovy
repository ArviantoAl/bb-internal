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

public static String randomString(String chars, int length) {
	Random rand = new Random();
	StringBuilder sb = new StringBuilder();
	for (int i=0; i<length; i++) {
		sb.append(chars.charAt(rand.nextInt(chars.length())));
	}
	return sb.toString();
}
String chars = "abcdefghijklmnopqrstuvwxyz"
String keyword = randomString(chars, 5)

WebUI.callTestCase(findTestCase('login_internal2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/master_employee/dashboardBtn'))

WebUI.click(findTestObject('Object Repository/job_title/setupAndConfigurationBtn'))

WebUI.click(findTestObject('division/subMenuDivision'))

WebUI.verifyElementPresent(findTestObject('division/headerDivision'), 0)

WebUI.click(findTestObject('corporate_airline_fare/breadcrumb'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('corporate_airline_fare/formSearchAirlineFareData'), keyword)

WebUI.sendKeys(findTestObject('corporate_airline_fare/formSearchAirlineFareData'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('corporate_airline_fare/formSearchAirlineFareData'), Keys.chord(Keys.BACK_SPACE))

String actualText = WebUI.getAttribute(findTestObject('corporate_airline_fare/formSearchAirlineFareData'), 'value')

WebUI.verifyMatch(actualText, keyword, false)

WebUI.verifyElementPresent(findTestObject('division/data_not_found'), 0)

WebUI.takeScreenshot()

WebUI.closeBrowser()
