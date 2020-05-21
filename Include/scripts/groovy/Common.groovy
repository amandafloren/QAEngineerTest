import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

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


class Common {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("User access Git")
	def load_gist_page() {
		WebUI.callTestCase(findTestCase("Test Cases/common/Login Gist Account"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User add new Public Gist")
	def add_gist() {
		WebUI.callTestCase(findTestCase("Test Cases/common/Create Publict Gist"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Back to page overview")
	def gist_added() {
		WebUI.callTestCase(findTestCase("Test Cases/verify/gist updated"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User edit an existing Gist")
	def edit_gist(){
		WebUI.callTestCase(findTestCase("Test Cases/common/Edit Existing Gist"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User delete an existing Gist")
	def delete_gist() {
		WebUI.callTestCase(findTestCase("Test Cases/common/Delete Gist"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Gist deleted successfully")
	def deleted_gist() {
		WebUI.callTestCase(findTestCase("Test Cases/verify/gist deleted"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User see lists of their Gists")
	def display_all_gists() {
		WebUI.callTestCase(findTestCase("Test Cases/common/See All Gists"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Show all Gists")
	def displayed_all_gists() {
		WebUI.callTestCase(findTestCase("Test Cases/verify/all gist displayed"), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
