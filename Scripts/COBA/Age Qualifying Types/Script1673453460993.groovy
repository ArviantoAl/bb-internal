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

WebUI.click(findTestObject('Page_Bayu Buana - Master Data Management/p_Age Qualifying Type'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/li_Master Data Management'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/li_Age Qualifying Types'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/input_Age Qualifying Types_form-control'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/i_Age Qualifying Types_fas fa-search'), 
    0)

WebUI.click(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/span_Advanced Options'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/span_Advanced Options'), 
    0)

WebUI.click(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/span_Advanced Options'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/img'), 0)

WebUI.click(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/img'))

WebUI.verifyElementText(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/label_Status'), 
    'Status')

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/div_All_css-ackcql'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/img_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/img_All_img-fluid'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/img_Create New_datatable-download'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/img_Create New_img-circle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/button_Create New'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/input_REMOVE AGE QUALIFYING TYPES_cb-th'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/th_Age Qualifying Type Code'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/th_Age Qualifying Type Name'), 
    'Age Qualifying Type Name')

WebUI.verifyElementText(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/th_Status'), 'Status')

WebUI.verifyElementText(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/th_Actions'), 'Actions')

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/path_Actions_svg_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/td_8'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/td_Child'), 'Child')

WebUI.verifyElementText(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/td_Active'), 'Active')

WebUI.verifyElementClickable(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/img_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/img_1_2_3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/img_1_2_3_4'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/select_102550100All'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/span_Showing 1 - 2 of 2'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/span_Page'), 'Page:')

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/li_Page_DataTables_Table_0_previous'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Page_Bayu Buana - Age Qualifying Types/li_Page_DataTables_Table_0_next'), 
    0)

WebUI.takeScreenshot()

