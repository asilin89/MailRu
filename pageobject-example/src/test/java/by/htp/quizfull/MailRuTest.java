package by.htp.quizfull;

import org.testng.annotations.Test;

import by.htp.driver.DriverInitializer;
import by.htp.pages.mailru.LoginPage;
import by.htp.pages.mailru.MainPage;

public class MailRuTest extends DriverInitializer{
	
	/**
	 * This test verifies that a user can log in to Mail.ru and send a message.
	 */
	
	String userName = "tathtp";
	String password = "Klopik123";
	String textMessage = "Hello, Sviatlana! This is an automated test message from Andrei Silin!";
	String to = "sviatlana.zakharenka@gmail.com";
	String subject = "Automated message from Andrei Silin";
	
	@Test
	public void testMainRu()
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openPage();
		loginPage.login(userName, password);
		
		MainPage mainPage = new MainPage(driver);
		mainPage.composeMessage(to, subject, textMessage);
		mainPage.sendMessage();
	}
}
