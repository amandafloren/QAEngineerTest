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
import org.openqa.selenium.WebDriver as WebDriver

'Storing the URL in a variable'
def urlGist = GlobalVariable.gist_url

WebUI.openBrowser(urlGist)

'Maximize the window'
WebUI.maximizeWindow()

WebUI.click(findTestObject('Login - Gist Object/Page_Discover gists  GitHub/signin btn'))

WebUI.setEncryptedText(findTestObject('Login - Gist Object/Page_Sign in to GitHub  GitHub/input username'), 'QRrURVCPUH0SnR9BFCgWT5q6W2I85QrJmrYXMFQPyoY=')

WebUI.setEncryptedText(findTestObject('Login - Gist Object/Page_Sign in to GitHub  GitHub/input password'), 'rlpDi1vyFqLwZPJRYwxPHw==')

WebUI.click(findTestObject('Login - Gist Object/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))



