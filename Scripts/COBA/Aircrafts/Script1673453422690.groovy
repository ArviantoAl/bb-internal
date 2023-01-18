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

WebUI.callTestCase(findTestCase('COBA/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Bayu Buana - Master Data Management/p_Master Data Management'))

WebUI.click(findTestObject('Page_Bayu Buana - Master Data Management/p_Aircraft'))

WebUI.verifyElementText(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/li_Master Data Management'), 
    'Master Data Management')

WebUI.verifyElementText(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/li_Aircrafts'), 'Aircrafts')

WebUI.verifyElementText(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/h1_Aircrafts'), 'Aircrafts')

WebUI.verifyElementPresent(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/input_Aircrafts_form-control'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/span_Advanced Options'), 
    'Advanced Options')

WebUI.verifyElementPresent(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/img'), 0)

WebUI.click(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/label_Status'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/div_All_css-ackcql'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/img_All_img-fluid'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/img_Create New_datatable-download'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/img_Create New_img-circle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/button_Create New'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/input_REMOVE AIRCRAFTS_cb-th'))

WebUI.verifyElementText(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/th_Aircraft Code'), 'Aircraft Code')

WebUI.verifyElementText(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/th_Aircraft Name'), 'Aircraft Name')

WebUI.verifyElementText(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/th_Status'), 'Status')

WebUI.verifyElementText(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/th_Actions'), 'Actions')

WebUI.verifyElementPresent(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/svg_Actions_float-left row-handle nopadding'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/input_Actions_float-left select-checkbox-it_8952ca'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/td_A4F'), 'A4F')

WebUI.verifyElementText(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/td_Antonov AN-124 Ruslan'), 
    'Antonov AN-124 Ruslan')

WebUI.verifyElementText(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/td_Active'), 'Active')

WebUI.verifyElementClickable(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/img_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/img_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/img_1_2_3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/select_102550100All'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/span_Showing 1 - 10 of 263'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/span_Page'), 'Page:')

WebUI.verifyElementPresent(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/li_Page_DataTables_Table_0_previous'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Aircrafts/Page_Bayu Buana - Aircrafts/a_Page_page-link'), 0)

WebUI.takeScreenshot()

