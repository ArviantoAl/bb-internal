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
import java.util.*;

WebUI.callTestCase(findTestCase('login_internal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/special_dates/dashboardBtn'))

WebUI.click(findTestObject('Object Repository/special_dates/setupAndConfMenu'))

WebUI.click(findTestObject('Object Repository/special_dates/special_date_subMenu'))

WebUI.click(findTestObject('Object Repository/special_dates/breadcrumb'))

WebUI.verifyElementPresent(findTestObject('Object Repository/special_dates/h1_title_sd'), 0)

WebUI.click(findTestObject('Object Repository/special_dates/action_item_edit'))

WebUI.sendKeys(findTestObject('Object Repository/special_dates/field_name'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/special_dates/field_name'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/special_dates/field_name'), ' ')

WebUI.click(findTestObject('Object Repository/special_dates/btn_save'))

//WebUI.takeScreenshot('special_dates/Edit _field name _only input spaces or tabs.png')

WebUI.closeBrowser()