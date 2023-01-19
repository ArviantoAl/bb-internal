package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile Staging : URL Staging
Profile default : URL DEV</p>
     */
    public static Object url_login
     
    /**
     * <p></p>
     */
    public static Object user_corporate
     
    /**
     * <p></p>
     */
    public static Object user_corporate_not_listed
     
    /**
     * <p></p>
     */
    public static Object pass_corporate
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            url_login = selectedVariables['url_login']
            user_corporate = selectedVariables['user_corporate']
            user_corporate_not_listed = selectedVariables['user_corporate_not_listed']
            pass_corporate = selectedVariables['pass_corporate']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
