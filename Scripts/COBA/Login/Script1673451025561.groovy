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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url_login)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Bayu Buana/img_Email_img-fluid'), 0)

//WebUI.verifyElementText(findTestObject('Login/Page_Bayu Buana/p_Dashboard'), 'We are, The Expert Travel Agent Partnership')
WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/p_Welcome Back'), 'Welcome Back!')

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/p_Please Sign in to continue'), 'Please Sign in to continue')

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/label_Email'), 'Email')

WebUI.verifyElementVisible(findTestObject('Object Repository/Login/Page_Bayu Buana/input_Email_username'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Login/Page_Bayu Buana/div_Email is required'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Bayu Buana/input_Email_username'), GlobalVariable.user_corporate)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Bayu Buana/div_Email is not a valid email'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/label_Password'), 'Password')

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/input_Password_password'), '')

WebUI.verifyElementClickable(findTestObject('Object Repository/Login/Page_Bayu Buana/i_Password_fa fa-eye-slash'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Bayu Buana/div_Password is required'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Bayu Buana/input_Password_password'), GlobalVariable.pass_corporate)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Bayu Buana/div_Password is too short - should be 8 cha_7741e2'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Login/Page_Bayu Buana/input_Password_custom-inline-checkbox-remember'))

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/label_Remember Me'), 'Remember Me')

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/p_Forgot Password'), 'Forgot Password?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Bayu Buana/img_SIGN IN_bb-logo d-none d-md-block'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/p_2021 - 2023 Bayu Buana Travel Services. A_30e6cd'), 
    '© 2021 - 2023 Bayu Buana Travel Services. All Rights Reserved.')

WebUI.click(findTestObject('Object Repository/Login/Page_Bayu Buana/button_SIGN IN'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Bayu Buana/div_A user was not found with the given cre_adf26c'), 
    0)

