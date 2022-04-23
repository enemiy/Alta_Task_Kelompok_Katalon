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



class EditProfile {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */


	@Given("User click profile button")
	def clickProfileButton() {
		println ("\n I am inside clickProfileButton")

		WebUI.click(findTestObject('Edit Profile/btn_Profile'))
	}

	@When("Click My Account button")
	def clickMyAccountbutton() {
		println ("\n I am inside clickMyAccountbutton")

		WebUI.click(findTestObject('Edit Profile/btn_My account'))
	}

	@And("User field Firstname")
	def fieldFirstname() {
		println ("\n I am inside fieldFirstname")

		WebUI.setText(findTestObject('Edit Profile/input_First name_FirstName'), 'Iqah')
	}

	@And("User field Lastname")
	def fieldLastname() {
		println ("\n I am inside fieldLastname")

		WebUI.setText(findTestObject('Edit Profile/input_Last name_LastName'), 'Intan')
	}

	@And("User checklist Newsletter")
	def checklistNewsletter() {
		println ("\n I am inside checklistNewsletter")

		WebUI.check(findTestObject('Edit Profile/input_Options_Newsletter'))
	}

	@Then("Click on Submit button")
	def clickSubmitbutton() {
		println ("\n I am inside clickSubmitbutton")

		WebUI.scrollToElement(findTestObject('Edit Profile/button_Save'), 2)
		WebUI.click(findTestObject('Edit Profile/button_Save'))
	}
}