package com.agama.assignment;

public class CallWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WrapperMethods wm = new WrapperMethods();
		wm.insertUrl("https://www.facebook.com/");
		wm.enterById("email", "asjdhasjdh");
		wm.enterById("pass", "kjchkash");
		wm.clickByXpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input");
		wm.closeWindow();
		
	}

}
