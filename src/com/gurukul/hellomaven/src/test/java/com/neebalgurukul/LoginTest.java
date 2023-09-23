package com.neebalgurukul;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.neebalgurukul.dao.LoginDAO;
import com.neebalgurukul.model.Login;

public class LoginTest {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	LoginDAO dao = new LoginDAO();
	System.out.println("Login Test");
	List<Login> userList = new ArrayList<>();
	
	try {
		userList= dao.getLoginDetails();
		for (Login obj : userList) {
			System.out.println(obj.getUname()+","+obj.getPswd());
		}
		
		
		//System.out.println("Password for username = Ram is "+dao.getLoginPassword("Ram").getPswd());
		//dao.getLoginInsert("A","a123",true);
		
//		String passExists = dao.getLoginPassword("A").getPswd();
//		if(!passExists.isEmpty())
//		{
//		    dao.deleteLoginSoft("A");
//		}
		
		String passExists1 = dao.getLoginPassword("Ajay").getPswd();
		if(!passExists1.isEmpty())
		{
		    dao.deleteLoginHard("Ajay");
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
    }

}
