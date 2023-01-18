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

WebUI.callTestCase(findTestCase('SCENARIO/Login/Log_TC.001 - Adm - Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Bayu Buana - Master Data Management/p_Master Data Management'))

WebUI.click(findTestObject('Page_Bayu Buana - Master Data Management/p_Age Qualifying Type'))

WebUI.click(findTestObject('Object Repository/Age QT/Create/Page_Bayu Buana - Age Qualifying Types/button_Create New'))

WebUI.click(findTestObject('Object Repository/Age QT/Create/Page_Bayu Buana - Create Age Qualifying Type/input_Age Qualifying Type Name_age_qualifyi_ba4776'))

WebUI.click(findTestObject('Object Repository/Age QT/Create/Page_Bayu Buana - Create Age Qualifying Type/div_Age Qualifying Type Name'))

WebUI.setText(findTestObject('Object Repository/Age QT/Create/Page_Bayu Buana - Create Age Qualifying Type/input_Age Qualifying Type Name_age_qualifyi_ba4776'), 
    'Age Qualifying Type Name (Automation)')

WebUI.setText(findTestObject('Object Repository/Age QT/Create/Page_Bayu Buana - Create Age Qualifying Type/input_Age Qualifying Type Code_age_qualifyi_5ae899'), 
    '321')

WebUI.click(findTestObject('Object Repository/Age QT/Create/Page_Bayu Buana - Create Age Qualifying Type/button_SAVE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Create/Page_Bayu Buana - Age Qualifying Types/div_Record 321 - Age Qualifying Type Name (_29f3cb'), 
    0)

WebUI.setText(findTestObject('Object Repository/Age QT/Create/Page_Bayu Buana - Age Qualifying Types/input_Age Qualifying Types_form-control'), 
    '321')

WebUI.verifyElementText(findTestObject('Object Repository/Age QT/Create/Page_Bayu Buana - Age Qualifying Types/td_321'), 
    '321')

WebUI.verifyElementText(findTestObject('Object Repository/Age QT/Create/Page_Bayu Buana - Age Qualifying Types/td_Age Qualifying Type Name (Automation)'), 
    'Age Qualifying Type Name (Automation)')

WebUI.verifyElementText(findTestObject('Object Repository/Age QT/Create/Page_Bayu Buana - Age Qualifying Types/td_Active'), 
    'Active')

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

