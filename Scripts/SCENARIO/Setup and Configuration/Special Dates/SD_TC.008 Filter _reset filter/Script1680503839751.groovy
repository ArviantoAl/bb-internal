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
import com.github.javafaker.Faker as Faker
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.callTestCase(findTestCase('login_scenario_manager'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/corporate_airline_fare/dashboardBtn'))

WebUI.click(findTestObject('Object Repository/job_title/setupAndConfigurationBtn'))

WebUI.click(findTestObject('Object Repository/special_dates/subMenu_special_dates'))

WebUI.click(findTestObject('Object Repository/corporate_airline_fare/breadcrumb'))

WebUI.verifyElementPresent(findTestObject('Object Repository/special_dates/h1_title_sd'), 0)

WebUI.click(findTestObject('Object Repository/violation_reason/link_text_adv_opt'))

WebUI.verifyElementPresent(findTestObject('Object Repository/violation_reason/card_filter'), 0)

WebUI.click(findTestObject('Object Repository/special_dates/filter_year_sd'))

WebUI.scrollToElement(findTestObject('Object Repository/special_dates/item_select_sd'), 0)

WebUI.click(findTestObject('Object Repository/special_dates/item_select_sd2'))

String value = WebUI.verifyTextPresent('No Special Date found', false)

//remove filter
WebUI.click(findTestObject('Object Repository/violation_reason/btn_reset'))

WebUI.delay(4)

String value2 = WebUI.verifyTextNotPresent('No Special Date found', false)

WebUI.verifyMatch(value, value2, false)

WebUI.takeScreenshot()

WebUI.closeBrowser()

