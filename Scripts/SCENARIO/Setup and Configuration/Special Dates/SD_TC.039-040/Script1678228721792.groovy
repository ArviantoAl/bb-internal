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
//import com.github.javafaker.Faker as Faker
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import java.util.*;

WebUI.callTestCase(findTestCase('login_internal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/special_dates/dashboardBtn'))

WebUI.click(findTestObject('Object Repository/special_dates/setupAndConfMenu'))

WebUI.click(findTestObject('Object Repository/special_dates/special_date_subMenu'))

WebUI.click(findTestObject('Object Repository/special_dates/breadcrumb'))

WebUI.verifyElementPresent(findTestObject('Object Repository/special_dates/h1_title_sd'), 0)

String new_xpath2 = "//tr[1]/td[2]"
TestObject dynamicObject2 = new TestObject('dynamicObject2').addProperty('xpath', ConditionType.EQUALS, new_xpath2)
String str2 = WebUI.getText(dynamicObject2)

String new_xpath = "//tr[1]/td[3]"
TestObject dynamicObject = new TestObject('dynamicObject').addProperty('xpath', ConditionType.EQUALS, new_xpath)
String str = WebUI.getText(dynamicObject)

String[] strOut = str.split(" ");
String year = strOut[2];

WebUI.click(findTestObject('Object Repository/special_dates/btn_create_new'))

WebUI.click(findTestObject('Object Repository/special_dates/field_end_date'))

WebUI.click(findTestObject('Object Repository/special_dates/date_locator'))

String new_xpath3 = "//div[.='$year']"
TestObject dynamicObject3 = new TestObject('dynamicObject3').addProperty('xpath', ConditionType.EQUALS, new_xpath3)

WebUI.click(dynamicObject3)

WebUI.setText(findTestObject('Object Repository/special_dates/field_name'), str2)

WebUI.verifyElementText(findTestObject('Object Repository/special_dates/error_message_field_name'), 'Special Date Name already exists')

WebUI.takeScreenshot()

WebUI.closeBrowser()