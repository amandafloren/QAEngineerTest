import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Wait for Katalon Studio page to load with wait used as Global Variable'
WebUI.waitForPageLoad(GlobalVariable.G_Timeout_Small)

TestObject clickGist = findTestObject('Create Gist/Page_Discover gists/New Gist')

WebUI.waitForElementPresent((clickGist),GlobalVariable.G_Timeout_Small)
WebUI.click(clickGist)

WebUI.setText(findTestObject('Create Gist/Page_Create a new Gist/Gist Desc'), 'As a user, I want to create a public Gist')

WebUI.setText(findTestObject('Create Gist/Page_Create a new Gist/Gist Name'), 'Create a public Gist')

WebUI.setText(findTestObject('Create Gist/Page_Create a new Gist/input text gist'), 'I want to create a public Gist')

WebUI.click(findTestObject('Create Gist/Page_Create a new Gist/Submit Gist Btn'))



