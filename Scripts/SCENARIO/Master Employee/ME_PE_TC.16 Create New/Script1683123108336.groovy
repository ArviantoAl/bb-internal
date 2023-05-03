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

WebUI.callTestCase(findTestCase('login_internal2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/master_employee/dashboardBtn'))

WebUI.click(findTestObject('master_employee/corporateManagementBtn'))

WebUI.click(findTestObject('master_employee/masterEmployeeSubMenu'))

WebUI.click(findTestObject('master_employee/create_new_button'))

WebUI.setText(findTestObject('master_employee/formName'), 'Testing')

WebUI.setText(findTestObject('master_employee/middleName'), 'Script')

WebUI.setText(findTestObject('master_employee/lastName'), 'Automation')

WebUI.click(findTestObject('master_employee/inputDayBirth'))

WebUI.setText(findTestObject('master_employee/inputDayBirth'), '1')

WebUI.click(findTestObject('master_employee/chooseDay10'))

WebUI.click(findTestObject('master_employee/inputMonthBirth'))

WebUI.setText(findTestObject('master_employee/inputMonthBirth'), 'Feb')

WebUI.click(findTestObject('master_employee/chooseFebruary'))

WebUI.click(findTestObject('master_employee/chooseYear'))

WebUI.setText(findTestObject('master_employee/chooseYear'), '199')

WebUI.click(findTestObject('master_employee/choose_1999'))

WebUI.setText(findTestObject('master_employee/idCard'), '1111111111')

WebUI.click(findTestObject('master_employee/nationality'))

WebUI.setText(findTestObject('master_employee/nationality'), 'Indonesia')

WebUI.click(findTestObject('master_employee/chooseIndonesia2'))

WebUI.scrollToElement(findTestObject('master_employee/homePhone'), 0)

WebUI.setText(findTestObject('master_employee/homePhone'), '21221221')

WebUI.setText(findTestObject('master_employee/phoneNumber'), '88888888')

WebUI.setText(findTestObject('master_employee/inputEmail'), 'autotest@mailo.com')

WebUI.setText(findTestObject('master_employee/address'), 'Testing Alamat Automation')

WebUI.click(findTestObject('master_employee/country'))

WebUI.setText(findTestObject('master_employee/country'), 'indo')

WebUI.click(findTestObject('master_employee/chooseIndonesia'))

WebUI.click(findTestObject('master_employee/province'))

WebUI.setText(findTestObject('master_employee/province'), 'Bal')

WebUI.click(findTestObject('master_employee/Bali'))

WebUI.click(findTestObject('master_employee/city'))

WebUI.setText(findTestObject('master_employee/city'), 'Denpa')

WebUI.click(findTestObject('master_employee/denpasar'))

WebUI.click(findTestObject('master_employee/sameAddress'))

WebUI.click(findTestObject('master_employee/saveNext'))

Thread.sleep(2000)

WebUI.click(findTestObject('master_employee/saveNext'))

WebUI.setText(findTestObject('master_employee/employeeID'), '9019')

Thread.sleep(2000)

WebUI.click(findTestObject('master_employee/division'))

WebUI.setText(findTestObject('master_employee/division'), 'commisi')

WebUI.click(findTestObject('master_employee/commission'))

WebUI.click(findTestObject('master_employee/branchOffice'))

WebUI.click(findTestObject('master_employee/palangkaraya'))

WebUI.click(findTestObject('master_employee/jobTitle'))

WebUI.setText(findTestObject('master_employee/jobTitle'), 'Auto')

WebUI.click(findTestObject('master_employee/automation'))

WebUI.click(findTestObject('master_employee/hiringDay'))

WebUI.setText(findTestObject('master_employee/hiringDay'), '15')

WebUI.sendKeys(findTestObject('master_employee/hiringDay'), Keys.chord(Keys.ENTER))


WebUI.click(findTestObject('master_employee/hiringMonth'))

WebUI.setText(findTestObject('master_employee/hiringMonth'), 'Feb')

WebUI.sendKeys(findTestObject('master_employee/hiringMonth'), Keys.chord(Keys.ENTER))


WebUI.click(findTestObject('master_employee/hiringYear'))

WebUI.setText(findTestObject('master_employee/hiringYear'), '2021')

WebUI.sendKeys(findTestObject('master_employee/hiringYear'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('master_employee/npwp'), '11111111')

WebUI.click(findTestObject('master_employee/saveNext2'))

Thread.sleep(2000)

WebUI.click(findTestObject('master_employee/title'))

WebUI.setText(findTestObject('master_employee/title'), 'Mr')

WebUI.sendKeys(findTestObject('master_employee/title'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('master_employee/firstNamePassport'), 'Testing')

WebUI.setText(findTestObject('master_employee/middleNamePassport'), 'Script')

WebUI.setText(findTestObject('master_employee/lastNamePassport'), 'Automation')

WebUI.setText(findTestObject('master_employee/passportNumber'), '12121212')

WebUI.click(findTestObject('master_employee/expireDate'))

WebUI.setText(findTestObject('master_employee/expireDate'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.setText(findTestObject('master_employee/expireDate'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('master_employee/expireDate'), '16 January 2026')

WebUI.click(findTestObject('master_employee/placeofIssue'))

WebUI.setText(findTestObject('master_employee/placeofIssue'), 'Indonesia')

WebUI.setText(findTestObject('master_employee/placeofIssue'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('master_employee/saveNext'))

Thread.sleep(2000)

WebUI.click(findTestObject('master_employee/saveNext'))

Thread.sleep(2000)

WebUI.click(findTestObject('master_employee/save'))

Thread.sleep(2000)

WebUI.takeScreenshot()

WebUI.closeBrowser()