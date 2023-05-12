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

WebUI.callTestCase(findTestCase('login_internal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/corporate_airline_fare/dashboardBtn'))

WebUI.click(findTestObject('user_management/user_access_sbm'))

WebUI.click(findTestObject('user_management/user_management_sbm'))

WebUI.click(findTestObject('user_management/breadcrumb_board'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('division/select_pagination'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('user_management/choose_10'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('user_management/total_result'), 0)

WebUI.takeScreenshot()

WebUI.closeBrowser()
