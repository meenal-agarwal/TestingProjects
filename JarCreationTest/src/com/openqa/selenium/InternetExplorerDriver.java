package com.openqa.selenium;

public class InternetExplorerDriver implements WebDriver {
	
	public InternetExplorerDriver(){
		System.out.println("Launching IE");
	}

	@Override
	public void click(String locator) {
		System.out.println("Clicked on an element in IE: "+locator);
	}

	@Override
	public void sendKeys(String locator, String value) {
		System.out.println("Typed in an element in IE: "+locator+" value entered: "+value);
		
	}

}
