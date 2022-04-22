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



class register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am on login page")
	def OnLoginPage() {
		println ("\n I am on login page")
		WebUI.openBrowser('https://services.smartbear.com/samples/TestComplete15/smartstore/login?returnUrl=%2Fsamples%2FTestComplete15%2Fsmartstore%2F')

		WebUI.maximizeWindow()
	}

	@When("I click register button")
	def clickRegisterButton() {
		println ("\n I click register button")
		WebUI.click(findTestObject('Register/btn_register'))
	}

	@And("I check female on gender")
	def checkGender() {
		println ("\n I am inside checkgender")
		WebUI.check(findTestObject('Register/gender'))
	}

	@And("I fill first name (.*)")
	def enterFirstName(String f_name) {
		println ("\n I am inside field firstname")
		println ("First Name : "+f_name)

		WebUI.setText(findTestObject('Register/name'), f_name)
	}

	@And("I fill last name (.*)")
	def enterLastName(String last_name) {
		println ("\n I am inside field lastname")
		println ("Last Name : "+last_name)

		WebUI.setText(findTestObject('Register/LastName'), last_name)
	}

	@And("I select day birth (.*)")
	def selectDay(String day_birth) {
		println ("\n I am inside select day")

		WebUI.selectOptionByValue(findTestObject('Register/date_day'), day_birth, true)
	}

	@And("I select month birth (.*)")
	def selectMonth(String month) {
		println ("\n I am inside select month")

		WebUI.selectOptionByValue(findTestObject('Register/date_m'), month, true)
	}

	@And("I select years (.*)")
	def selectYears(String years) {
		println ("\n I am inside select years")

		WebUI.selectOptionByValue(findTestObject('Register/date_y'), years, true)
	}

	@And("I fill email (.*)")
	def enterEmail(String email) {
		println ("\n I am inside field email")
		println ("Email : "+email)

		WebUI.setText(findTestObject('Register/email'), email)
	}

	@And("I fill username (.*)")
	def enterUsername(String username) {
		println ("\n I am inside field username")
		println ("Username : "+username)

		WebUI.setText(findTestObject('Register/username'), username)
	}

	@And("I fill pass (.*)")
	def enterPassword(String pass) {
		println ("\n I am inside field password")
		println ("Password : "+pass)

		WebUI.setText(findTestObject('Register/pass'), pass)
	}

	@And("I fill confirmpass (.*)")
	def enterConfirmPassword(String confirmpass) {
		println ("\n I am inside field confirm password")
		println ("Confirm Pass : "+confirmpass)

		WebUI.setText(findTestObject('Register/confirmpass'), confirmpass)
	}

	@And("I fill company (.*)")
	def enterCompany(String company) {
		println ("\n I am inside field company")
		println ("Company : "+company)

		WebUI.setText(findTestObject('Register/company'), company)
	}

	@And("I click submit register")
	def clickSubmitRegister() {
		println ("\n I am inside submit register")
		WebUI.click(findTestObject('Register/btn_regis'))
	}

	@Then("I successfully register")
	def verifyRegister() {
		println ("\n I am inside verifyRegister")
		WebUI.verifyElementText(findTestObject('Register/Verified'), 'Your registration completed')
		WebUI.click(findTestObject('Register/btn_continue'))
	}
}