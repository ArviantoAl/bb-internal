import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/b4/_n21h8qn0t57hh095f0ccnkm0000gp/T/Katalon/Test Cases/SCENARIO/Setup and Configuration/division/DV_TC.007 Search by Text_dengan input 0 characters atau hapus data search sebelumnya hingga menjadi 0 characters/20230508_232008/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/SCENARIO/Setup and Configuration/division/DV_TC.007 Search by Text_dengan input 0 characters atau hapus data search sebelumnya hingga menjadi 0 characters', new TestCaseBinding('Test Cases/SCENARIO/Setup and Configuration/division/DV_TC.007 Search by Text_dengan input 0 characters atau hapus data search sebelumnya hingga menjadi 0 characters',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
