package com.openqa.selenium;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver(){
		System.out.println("Launching Chrome");
	}

	@Override
	public void click(String locator) {
		System.out.println("Clicked on an element in Chrome: "+locator);
	}

	@Override
	public void sendKeys(String locator, String value) {
		System.out.println("Typed in an element in Chrome: "+locator+" value entered: "+value);
		
	}
}
