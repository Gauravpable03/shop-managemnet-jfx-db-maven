package login;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operation.DataBaseOperation;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class LoginScreenController {

	@FXML
	private TextField Email_ID;

	@FXML
	private TextField Password;

	@FXML
	private Button LoginButton;

	public void login(ActionEvent event) {
		boolean loginstatus = LoginScreenController.LoginProcess(Email_ID.getText(), Password.getText());
		if (loginstatus) {
			HomeScreen.ShoeHomeScreen();
		} else {
			System.out.println("Login Unsuccesfully");
		}

	}

public static boolean LoginProcess(String Email_ID , String Password) {
	 String Query = " select * from Users where Email_ID ='"+ Email_ID +"' and Password ='"+ Password +"' " ;
	ResultSet rs = DataBaseOperation.ExecuteQueryGetResult(Query);
	try {
		if(rs.next()) 
		{
			return true;
		}
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return false ;
	}
}