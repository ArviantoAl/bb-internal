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

WebUI.callTestCase(findTestCase('login_internal2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/master_employee/dashboardBtn'))

WebUI.click(findTestObject('Object Repository/job_title/setupAndConfigurationBtn'))

WebUI.click(findTestObject('division/subMenuDivision'))

WebUI.verifyElementPresent(findTestObject('division/headerDivision'), 0)

WebUI.click(findTestObject('corporate_airline_fare/breadcrumb'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('division/select_pagination'), 'All', false)

TestObject selectorType = new TestObject()
selectorType.addProperty('css', ConditionType.EQUALS, 'td:nth-of-type(2)')

List<WebElement> typeList = WebUI.findWebElements(selectorType, 30)
String size1 = typeList.size()

WebUI.setText(findTestObject('corporate_airline_fare/formSearchAirlineFareData'), 'Kom')

WebUI.sendKeys(findTestObject('corporate_airline_fare/formSearchAirlineFareData'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('corporate_airline_fare/formSearchAirlineFareData'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('corporate_airline_fare/formSearchAirlineFareData'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

List<WebElement> typeList2 = WebUI.findWebElements(selectorType, 30)
String size2 = typeList2.size()

WebUI.verifyMatch(size1, size2, false)

WebUI.takeScreenshot()

WebUI.closeBrowser()
