import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

WebUI.openBrowser('')

WebUI.navigateToUrl('https://services.smartbear.com/samples/TestComplete15/smartstore/')

WebUI.click(findTestObject('Login_Salsa/menu_Login'))

WebUI.setText(findTestObject('Login_Salsa/input_UsernameOrEmail'), 'salsabilaaa123')

WebUI.setText(findTestObject('Login_Salsa/input_Password'), 'Salsa321!')

WebUI.click(findTestObject('Login_Salsa/button_Login'))

WebUI.verifyElementPresent(findTestObject('ChangePassword/more_ico'), 0)

WebUI.click(findTestObject('ChangePassword/more_ico'))

WebUI.click(findTestObject('ChangePassword/menu_myaccount'))

WebUI.click(findTestObject('ChangePassword/menu_changepassword'))

WebUI.setText(findTestObject('ChangePassword/input_OldPassword'), 'Salsa321!')

WebUI.setText(findTestObject('ChangePassword/input_NewPassword'), 'Salsa123!')

WebUI.setText(findTestObject('ChangePassword/input_ConfirmPassword'), 'Salsa123!')

WebUI.click(findTestObject('ChangePassword/button_ChangePassword'))

WebUI.verifyElementText(findTestObject('ChangePassword/info_PasswordWasChanged'), 'Password was changed')

