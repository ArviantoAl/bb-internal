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

WebUI.click(findTestObject('Manage Corporate/p_Corporate Management'))

WebUI.click(findTestObject('Manage Corporate/p_Manage Corporate'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/li_Corporate Management'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/li_Manage Corporate'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/h1_Manage Corporate'), 
    'Manage Corporate')

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/input_Manage Corporate_form-control'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/i_Manage Corporate_fas fa-search'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/img_Create New_datatable-download'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/img_Create New_img-circle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/button_Create New'))

WebUI.verifyElementText(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/th_Corporate Code'), 
    'Corporate Code')

WebUI.verifyElementText(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/th_Corporate Name'), 
    'Corporate Name')

WebUI.verifyElementText(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/th_Travel Consultant'), 
    'Travel Consultant')

WebUI.verifyElementText(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/th_Status'), 
    'Status')

WebUI.verifyElementText(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/th_Actions'), 
    'Actions')

WebUI.verifyElementText(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/td_NRG'), 
    'NRG')

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/div_Naragas Corporation'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/td_draftinactive'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/img_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/label_draftinactive_custom-control-label'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage Corporate/Page_Bayu Buana - Manage Corporate/img_1_2'), 
    0)

