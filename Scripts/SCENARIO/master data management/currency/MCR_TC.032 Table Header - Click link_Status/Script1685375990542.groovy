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

WebUI.callTestCase(findTestCase('login_internal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/corporate_airline_fare/dashboardBtn'))

WebUI.click(findTestObject('master data management/attraction categories/master_data_sbmenu'))

WebUI.click(findTestObject('master data management/currency/currency_submenu'))

WebUI.click(findTestObject('corporate_airline_fare/breadcrumb'), FailureHandling.STOP_ON_FAILURE)

//Ascending
WebUI.click(findTestObject('master data management/currency/table_status'))

TestObject selectorType = new TestObject()
selectorType.addProperty('css', ConditionType.EQUALS, 'td:nth-of-type(5)')

// find the list of type
List<WebElement> typeList = WebUI.findWebElements(selectorType, 30)
int size = typeList.size()

ArrayList<String> tableValues = new ArrayList<String>();

for (int i = 1; i <= size; i++) {
	String new_xpath = "(//tr/td[5])[$i]"
	TestObject dynamicObject = new TestObject('dynamicObject').addProperty('xpath', ConditionType.EQUALS, new_xpath)
	String str = WebUI.getText(dynamicObject)
	tableValues.add(str)
}

System.out.println(tableValues)

ArrayList<String> referenceValues = new ArrayList<String>();
for(int i=0; i < tableValues.size(); i++){
	referenceValues.add(tableValues.get(i))
}

Collections.sort(referenceValues, String.CASE_INSENSITIVE_ORDER)
System.out.println(referenceValues)

assert referenceValues.equals(tableValues)

//Descending
WebUI.click(findTestObject('master data management/currency/table_status'))

ArrayList<String> tableValuesDesc = new ArrayList<String>();

for (int i = 1; i <= size; i++) {
	String new_xpath = "(//tr/td[5])[$i]"
	TestObject dynamicObject = new TestObject('dynamicObject').addProperty('xpath', ConditionType.EQUALS, new_xpath)
	String str2 = WebUI.getText(dynamicObject)
	tableValuesDesc.add(str2)
}

System.out.println(tableValuesDesc)

ArrayList<String> referenceValuesDesc = new ArrayList<String>();
for(int i=0; i < tableValuesDesc.size(); i++){
	referenceValuesDesc.add(tableValuesDesc.get(i))
}

Collections.sort(referenceValuesDesc, String.CASE_INSENSITIVE_ORDER.reversed())
System.out.println(referenceValuesDesc)

assert referenceValuesDesc.equals(tableValuesDesc)

WebUI.takeScreenshot()

WebUI.closeBrowser()

