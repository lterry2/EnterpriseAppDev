package ca.nait.dmit.dmit2015;

import static org.junit.Assert.*;

import org.junit.Test;

public class GmailTest {

	@Test
	public void testSendmail() {
		Gmail mailer = new Gmail("lterry2nait@gmail.com", "Mainlane$1");
		try {
			mailer.sendmail(
					"lterry2nait@gmail.com",
					"swu@nait.ca", 
					"DMIT2015 Assignment 3 from Lane Terry",
					"JavaMail API is simple!");
		} catch (Exception e) {
			fail("Error sending email");
		}
	}

}
