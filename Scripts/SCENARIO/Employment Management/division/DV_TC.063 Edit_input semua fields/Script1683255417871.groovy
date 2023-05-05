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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import java.util.*

WebUI.callTestCase(findTestCase('login_internal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/corporate_airline_fare/dashboardBtn'))

WebUI.click(findTestObject('employment_management/job_title/employment_management_sub_menu'))

WebUI.click(findTestObject('employment_management/division/sub_menu_division'))

WebUI.click(findTestObject('employment_management/division/breadcrumb_division'))

WebUI.setText(findTestObject('job_title/formSearchJobTitle'), 'Auto')

Thread.sleep(3000)

WebUI.click(findTestObject('employment_management/job_title/edit_button'))

String chars = 'QWERTYUIOPASDFGHJKLZXCVBNM'

String code = randomString(chars, 2)

WebUI.sendKeys(findTestObject('employment_management/division/name_division'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('employment_management/division/name_division'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('employment_management/division/name_division'), 'Automation Edit ' + code)

WebUI.sendKeys(findTestObject('employment_management/division/code_division'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('employment_management/division/code_division'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('employment_management/division/code_division'), 'EDIT CODE ' + code)

WebUI.click(findTestObject('employment_management/division/close_parent'))

WebUI.click(findTestObject('employment_management/division/select_content'))

WebUI.click(findTestObject('employment_management/division/close_manager'))

WebUI.click(findTestObject('employment_management/division/select_joe'))

WebUI.sendKeys(findTestObject('employment_management/division/translation'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('employment_management/division/translation'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('employment_management/division/translation'), code)

WebUI.click(findTestObject('employment_management/division/SAVE_button'))

WebUI.verifyElementPresent(findTestObject('employment_management/job_title/success_message_created'), 0)

WebUI.takeScreenshot()

WebUI.closeBrowser()

static String randomString(String chars, int length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(chars.charAt(rand.nextInt(chars.length())))
    }
    
    return sb.toString()
}

