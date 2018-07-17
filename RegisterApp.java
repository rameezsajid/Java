package main;

import lib.Name;
import lib.Register;

public class RegisterApp {


	public static String execute(Register reg, Name b) {	
		reg.removeName(1);
		reg.addName(b);
		
		String a = "";
		
		for(int i = 0; i < reg.registerSize(); i++)
		{
			a += reg.getName(i).getFamilyName().toUpperCase() + ", " + reg.getName(i).getFirstName().toUpperCase().charAt(0) + "\n";
		}
		
		return a;
	}
}