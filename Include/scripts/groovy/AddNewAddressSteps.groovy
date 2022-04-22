import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class AddNewAddressSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to my account page")
	def navigateToMyAccountPage() {
		WebUI.navigateToUrl('https://services.smartbear.com/samples/TestComplete15/smartstore/')
		WebUI.click(findTestObject('ChangePassword/more_ico'))
		WebUI.click(findTestObject('ChangePassword/menu_MyAccount'))
	}

	@When("User click addresses menu")
	def clickAddressesMenu() {
		WebUI.click(findTestObject('AddNewAddress/menu_Addresses'))
	}

	@And("User click add new")
	def clickAddBtn() {
		WebUI.click(findTestObject('AddNewAddress/btn_AddNewAddress'))
	}

	@And("User enter first name (.*)")
	def enterFirstName(String firstname) {
		WebUI.setText(findTestObject('AddNewAddress/input_FirstName'), firstname)
	}

	@And("User enter last name (.*)")
	def enterLastName(String lastname) {
		WebUI.setText(findTestObject('AddNewAddress/input_LastName'), lastname)
	}

	@And("User enter address1 (.*)")
	def enterAddress1(String address1) {
		WebUI.setText(findTestObject('AddNewAddress/input_Address1'), address1)
	}

	@And("User enter city (.*)")
	def enterCity(String city) {
		WebUI.setText(findTestObject('AddNewAddress/input_City'), city)
	}

	@And("User enter postal code (.*)")
	def enterPostalCode(String postalcode) {
		WebUI.setText(findTestObject('AddNewAddress/input_ZipPostalCode'), postalcode)
	}

	@And("User select country (.*)")
	def selectCountry(String country) {
		WebUI.selectOptionByLabel(findTestObject('AddNewAddress/select_Country'), country, true)
	}

	@And("User enter phone number (.*)")
	def enterPhoneNumber(String phonenumber) {
		WebUI.setText(findTestObject('AddNewAddress/input_PhoneNumber'), phonenumber)
	}

	@And("Click on save button")
	def clickSave() {
		WebUI.click(findTestObject('AddNewAddress/button_Save'))
	}

	@Then("User can see list of addresses")
	def verifyListAddress() {
		WebUI.verifyElementPresent(findTestObject('AddNewAddress/ListAddress'), 0)
	}
}