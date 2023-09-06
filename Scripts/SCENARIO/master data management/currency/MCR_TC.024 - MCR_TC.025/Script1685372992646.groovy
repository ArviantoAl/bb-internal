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
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.Select
import com.kms.katalon.core.webui.driver.DriverFactory

WebUI.callTestCase(findTestCase('login_internal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/corporate_airline_fare/dashboardBtn'))

WebUI.click(findTestObject('master data management/attraction categories/master_data_sbmenu'))

WebUI.click(findTestObject('master data management/currency/currency_submenu'))

WebUI.click(findTestObject('corporate_airline_fare/breadcrumb'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('master data management/currency/pagination_vr'), 0)

List<String> value = new ArrayList<>(
	Arrays.asList("10", "25", "50", "100", "All")
)
println(value)

ArrayList<String> pageValues = new ArrayList<String>();

for (int i = 0; i < 5; i++) {
	WebUI.selectOptionByIndex(findTestObject('master data management/currency/pagination_values'), i)
	Select select = new Select(DriverFactory.getWebDriver().findElement(By.xpath("//select[@class='custom-select custom-select-sm form-control form-control-sm']")))
	String pgValues = select.getFirstSelectedOption().getText()
	pageValues.add(pgValues)
}
println(pageValues)

assert value.equals(pageValues)

WebUI.takeScreenshot()

WebUI.closeBrowser()
