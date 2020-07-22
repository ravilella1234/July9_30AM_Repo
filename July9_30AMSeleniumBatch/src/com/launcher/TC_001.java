package com.launcher;

public class TC_001 extends BaseTest {

	public static void main(String[] args) {
		try {
			init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		launch("firefoxbrowser");
		navigateUrl("amazonurl");

	}

}
