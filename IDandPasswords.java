package fr.heighties.loginsystem;

import java.util.HashMap;

public class IDandPasswords {

	HashMap<String, String> logininfo = new HashMap<String, String>();

	IDandPasswords() {

		logininfo.put("Geoffrey", "mdpgeoffrey");
		logininfo.put("Heighties", "PASSWORD");
		logininfo.put("Geoff", "abc123");
	}

	protected HashMap getLoginInfo() {
		return logininfo;

	}

}
