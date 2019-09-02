package com.actions;

import org.openqa.selenium.WebDriver;

public class test {

	public static void main(String[] args) {
		
		Driver d = new Driver();
		WebDriver driver = d.getdriver();
		driver.get("https://www.amazon.com/");
		
	}
}
