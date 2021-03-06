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

//Navigate to Admin Portal
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://st-wa-qa-adminportal.azurewebsites.net/mc/login')

//Login as an Admin user
WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/button_EBT Login'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt'), 'admin.snowiq@eastbanctech.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd'), 'kiUD9XAtEi7WpcB4ZdH2rQ==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

//Open nav menu
WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/div_Active Storm Ops_fake-clickable-sidebar_414a65'))

//Open Administration > Events > Event management
WebUI.scrollToElement(findTestObject('Page_SnowIQ  Storm Operations/div_Events'), 0)

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/div_Events'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/div_Event Management'))

//Create new training event
WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/button_Create New Storm Event'))

WebUI.setText(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/input_Event Name_eventName'), 'Test training event')

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/input_Activation Time_activationTime'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/div_6'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/form_Event NameActivation TimeMarch 2022   _4642c6'))

WebUI.setText(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/input_Predicted Precipitation (inches)_pred_a51f9f'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/input_Predicted Duration (hours)_predictedDuration'), 
    '12')

WebUI.setText(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/input_Number of employees planned to partic_2823a9'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/input_Number of contractors planned to part_73fdc9'), 
    '5')

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/span_Number of contractors planned to parti_8f5755'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/button_Create'))

//Filter Training events
WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/span_Event Name_checkbox__status'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/button_Filter'))

//Verify last event exists and has proper values
WebUI.verifyElementText(findTestObject('Page_SnowIQ  Storm Operations/td_Event name in the list'), 'Test training event')

WebUI.verifyElementText(findTestObject('Page_SnowIQ  Storm Operations/td_Event status'), 'New')

//Delite event
WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/button_Delete'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/button_delete (1)'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/td_Test-event-03032022'))

//Close browser
WebUI.closeBrowser()

