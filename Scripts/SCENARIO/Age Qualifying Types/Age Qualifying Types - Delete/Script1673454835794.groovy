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

WebUI.setText(findTestObject('Object Repository/Age QT/Delete/Page_Bayu Buana - Age Qualifying Types/input_Age Qualifying Types_form-control'), 
    'Age Qualifying Type Name (Automation)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Delete/Page_Bayu Buana - Age Qualifying Types/path_Actions_svg_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Delete/Page_Bayu Buana - Age Qualifying Types/input_Actions_float-left select-checkbox-it_8952ca'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Delete/Page_Bayu Buana - Age Qualifying Types/td_321'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Delete/Page_Bayu Buana - Age Qualifying Types/td_Age Qualifying Type Name (Automation)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Delete/Page_Bayu Buana - Age Qualifying Types/td_Active'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Age QT/Delete/Page_Bayu Buana - Age Qualifying Types/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Age QT/Delete/Page_Bayu Buana - Age Qualifying Types/img_1'))

WebUI.click(findTestObject('Object Repository/Age QT/Delete/Page_Bayu Buana - Age Qualifying Types/img_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Age QT/Delete/Page_Bayu Buana - Age Qualifying Types/div_Delete Age Qualifying Type'), 
    'Delete Age Qualifying Type')

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Delete/Page_Bayu Buana - Age Qualifying Types/div_Are you sure you want to delete thisAge_c332eb'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Age QT/Delete/Page_Bayu Buana - Age Qualifying Types/button_Delete'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Age QT/Delete/Page_Bayu Buana - Age Qualifying Types/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Age QT/Delete/Page_Bayu Buana - Age Qualifying Types/button_Delete'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Age QT/Delete/Page_Bayu Buana - Age Qualifying Types/div_Record Age Qualifying Type Code 321 Age_41ef1f'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Age QT/Delete/Page_Bayu Buana - Age Qualifying Types/td_No age qualifying types found'), 
    'No age qualifying types found')

WebUI.takeScreenshot()

