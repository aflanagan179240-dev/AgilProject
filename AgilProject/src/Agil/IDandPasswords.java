package Agil;

import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String,String> loginInfo = new HashMap<String,String>();
	
		IDandPasswords(){
			loginInfo.put("A00329214","HI");
		}
		protected 	HashMap	getLoginInfo(){
			return loginInfo;
		}

}
