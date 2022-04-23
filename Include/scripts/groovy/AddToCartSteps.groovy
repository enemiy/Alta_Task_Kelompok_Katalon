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



class AddToCartSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User click items")
	def clickItems() {
		println ("\n I am inside clickItems")

		WebUI.click(findTestObject('Add To Cart/img_Category Mobile Phone'))
		WebUI.scrollToElement(findTestObject('Add To Cart/txt_Airy Pods'), 1)
	}

	@When("User selects the item type")
	def selectsTheItemType() {
		println ("\n I am inside selectsTheItemType")

		WebUI.click(findTestObject('Add To Cart/txt_Airy Pods'))
	}

	@And("Click on color button")
	def clickColor() {
		println ("\n I am inside clickColor")

		WebUI.click(findTestObject('Add To Cart/btn_Color'))
	}

	@Then("Click on button Add To Cart")
	def ClickAddToCart(){
		println ("\n I am inside clickAddToCart")

		WebUI.click(findTestObject('Add To Cart/btn_AddToCart'))
		WebUI.click(findTestObject('Add To Cart/Back'))
		WebUI.click(findTestObject('Add To Cart/Back_Dashboard'))
	}
}