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

WebUI.click(findTestObject('Object Repository/Manage Corporate/p_Corporate Management'))

WebUI.click(findTestObject('Object Repository/Manage Corporate/p_Manage Corporate'))

WebUI.click(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Manage Corporate/button_Create New'))

WebUI.setText(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/input__corporate_code'), 
    'code')

WebUI.setText(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/input__corporate_name'), 
    '321 code')

WebUI.click(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/div_Please choose corporate type_css-ackcql'))

WebUI.click(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/div_Agriculture'))

WebUI.setText(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/input__general_information.corporate_npwp'), 
    '54343242')

WebUI.click(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/input__startDate_'))

WebUI.click(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/span_12'))

WebUI.click(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/span_21'))

WebUI.click(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/button_APPLY'))

WebUI.setText(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/input__contact_information.corporate_email'), 
    '43243@mail.com')

WebUI.setText(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/input__PhoneInputInput'), 
    '+62 852 2121 1533')

WebUI.click(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/div_Please choose_css-ackcql'))

WebUI.click(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/div_Aland Islands'))

WebUI.click(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/div_Please choose_css-ackcql_1'))

WebUI.click(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/div_Albania'))

WebUI.click(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/button_SAVE  NEXT'))

WebUI.click(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/div_SAVE  NEXTCANCEL'))

WebUI.click(findTestObject('Object Repository/Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/button_SAVE  NEXT'))

WebUI.verifyElementNotVisible(findTestObject('Manage Corporate/Create Corporate/Page_Bayu Buana - Create Corporate/div_Failed to save this record'), 
    FailureHandling.STOP_ON_FAILURE)

