package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testIndexPage() {
	    beginAt("index.html"); 
	    assertTitleEquals("Index");
	    assertLinkPresent("Login");
	    clickLink("Login");
	    assertTitleEquals("Login");
	}
	
	@Test
	public void testLoginPage() {
	    beginAt("login.html"); 
	    assertTitleEquals("Login");
	    assertLinkPresent("Index");
	    clickLink("Index");
	    assertTitleEquals("Index");
	}

	private void assertLinkPresent(String string) {
		// TODO Auto-generated method stub
		
	}

	private void assertTitleEquals(String string) {
		// TODO Auto-generated method stub
		
	}

	private void beginAt(String string) {
		// TODO Auto-generated method stub
		
	}

	private void clickLink(String string) {
		// TODO Auto-generated method stub
		
	}

}

