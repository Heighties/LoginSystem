package fr.heighties.loginsystem;

public class Main {

	public static void main(String[] args) {

		IDandPasswords idandpasswords = new IDandPasswords();

		// logininfo -> argument de loginpage (idandpasswords.getLoginInfo();)

		LoginPage longinPage = new LoginPage(idandpasswords.getLoginInfo());

	}

}
