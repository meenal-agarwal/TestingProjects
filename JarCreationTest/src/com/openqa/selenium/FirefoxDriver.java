package com.openqa.selenium;

public class FirefoxDriver implements WebDriver {
	
	public FirefoxDriver(){
		System.out.println("Launching firfox");
	}

	@Override
	public void click(String locator) {
		System.out.println("Clicked on an element in Firefox: "+locator);
	}

	@Override
	public void sendKeys(String locator, String value) {
		System.out.println("Typed in an element in Firefox: "+locator+" value entered: "+value);
		
	}

}
