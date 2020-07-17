package com.launcher;

public class TC_001 extends BaseTest {

	public static void main(String[] args) {
		try {
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
		launch("firefoxbrowser");
		navigateUrl("amazonurl");

	}

}
