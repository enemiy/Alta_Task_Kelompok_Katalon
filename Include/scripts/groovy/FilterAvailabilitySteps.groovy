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



class FilterAvailabilitySteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User on the click Fashion Category")
	def clickFashionCategory() {
		WebUI.click(findTestObject('Object_Filter_by_Availability/fashion_category'))
	}

	@When("User click dropdown availability")
	def clickDropdownAvailability() {
		WebUI.scrollToElement(findTestObject('Object_Filter_by_Availability/dropdown_availability'), 2)
		WebUI.click(findTestObject('Object_Filter_by_Availability/dropdown_availability'))
	}

	@And("Click include out of stock")
	def clickIncludeOutOfStock() {
		WebUI.click(findTestObject('Object_Filter_by_Availability/checklist_Include_out_of_Stock'))
	}

	@Then("User is navigated to filter by stock availability")
	def verifyByAvailability() {
		WebUI.verifyElementPresent(findTestObject('Object_Filter_by_Availability/verify_IncludeStock_Availability'), 3)
		WebUI.click(findTestObject('Object_Homepage/icon_homepage'))
	}
}