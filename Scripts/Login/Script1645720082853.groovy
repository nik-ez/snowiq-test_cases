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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://st-wa-qa-adminportal.azurewebsites.net/mc/login')

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/button_EBT Login'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt'), 'admin.snowiq@eastbanctech.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd'), 'kiUD9XAtEi7WpcB4ZdH2rQ==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/div_Active Storm Ops_fake-clickable-sidebar_414a65'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/svg_Active Storm Reports_icon'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/svg_Resource Management_icon'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/svg_Events_icon'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/div_Active Storm Ops'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/div_Active Storm Ops'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/div_Routes'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/div_Resources'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/div_Active Storm Ops_fake-clickable-sidebar_414a65'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/div_Service Tickets'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/div_Active Storm Ops_fake-clickable-sidebar_414a65'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/div_Phases'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/div_Active Storm Ops_fake-clickable-sidebar_414a65'))

WebUI.click(findTestObject('Object Repository/Page_SnowIQ  Storm Operations/div_Storm Log'))
