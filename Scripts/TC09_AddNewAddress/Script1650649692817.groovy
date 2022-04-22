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

WebUI.navigateToUrl('https://services.smartbear.com/samples/TestComplete15/smartstore/')

WebUI.click(findTestObject('Login_Salsa/menu_Login'))

WebUI.setText(findTestObject('Login_Salsa/input_UsernameOrEmail'), 'salsabilaaa123')

WebUI.setEncryptedText(findTestObject('Login_Salsa/input_Password'), 'UpXHa1PLyDOqZkMXmXRncQ==')

WebUI.click(findTestObject('Login_Salsa/button_Login'))

WebUI.click(findTestObject('ChangePassword/more_ico'))

WebUI.click(findTestObject('ChangePassword/menu_MyAccount'))

WebUI.click(findTestObject('AddNewAddress/menu_Addresses'))

WebUI.click(findTestObject('AddNewAddress/btn_AddNewAddress'))

WebUI.setText(findTestObject('AddNewAddress/input_FirstName'), 'Salsa')

WebUI.setText(findTestObject('AddNewAddress/input_LastName'), 'Bila')

WebUI.setText(findTestObject('AddNewAddress/input_Address1'), 'Semarang')

WebUI.setText(findTestObject('AddNewAddress/input_City'), 'Semarang')

WebUI.setText(findTestObject('AddNewAddress/input_ZipPostalCode'), '11223')

WebUI.selectOptionByLabel(findTestObject('AddNewAddress/select_Country'), 'Indonesia', true)

WebUI.setText(findTestObject('AddNewAddress/input_PhoneNumber'), '085111222333')

WebUI.click(findTestObject('AddNewAddress/button_Save'))

WebUI.verifyElementPresent(findTestObject('AddNewAddress/ListAddress'), 0)

