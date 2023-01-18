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

'Pada NEGATIVE CASE beberapa pengecekan elemen ditiadakan, hal ini diharapkan mempercepat pengecekan.'
switch (action) {
    case 'Login':
        WebUI.openBrowser(GlobalVariable.url_login)

        WebUI.maximizeWindow()

        WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('Login Logout/Masuk/input_Email'), GlobalVariable.user_erp)

        WebUI.setText(findTestObject('Login Logout/Masuk/input_Password'), GlobalVariable.pwd)

        WebUI.verifyElementText(findTestObject('Login Logout/Masuk/label_Ingat Saya'), 'Ingat Saya')

        WebUI.click(findTestObject('Login Logout/Masuk/button_Masuk'))

        WebUI.verifyElementText(findTestObject('Side Menu/i_Dashboard - Span'), 'Dashboard')

        break
    default:
        WebUI.openBrowser(GlobalVariable.url_login)

        WebUI.maximizeWindow()

        WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementText(findTestObject('Login Logout/Masuk/a_Gapuraprima'), 'Gapuraprima')

        WebUI.verifyElementText(findTestObject('Login Logout/Masuk/span_Masuk'), 'Masuk')

        WebUI.setText(findTestObject('Login Logout/Masuk/input_Email'), GlobalVariable.user_erp)

        WebUI.setText(findTestObject('Login Logout/Masuk/input_Password'), GlobalVariable.pwd)

        WebUI.verifyElementText(findTestObject('Login Logout/Masuk/label_Ingat Saya'), 'Ingat Saya')

        WebUI.click(findTestObject('Login Logout/Masuk/button_Masuk'))

        WebUI.verifyElementText(findTestObject('Side Menu/i_Dashboard'), 'Dashboard')

        WebUI.takeScreenshot()}

