package edit_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operation.DataBaseOperation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import user_management.UserManagementScreen;

public class EditUserController {
	@FXML
	private TextField UserName;
	
	@FXML
	private TextField NewUserName ; 
	
	@FXML
	private TextField NewEmailID ;
	
	@FXML
	private TextField NewPassword ;
	
	@FXML
	private TextField NewUserRole ;
	
	@FXML
	private Button Save ;
	
	@FXML
	private Button Edit ;
	
	@FXML
	private Button Close ;
	
	public void Save() {
		String Query = "update users set User_Name='"+NewUserName.getText()+"' , Email_ID ='"+NewEmailID.getText()+"' ,"
				+ " Password='"+NewPassword.getText()+"' , User_Role='"+NewUserRole.getText()+"' where User_Name='"+UserName.getText()+"' ";
		DataBaseOperation.ExecuteQuery(Query);

	}
	public void Close() {
		UserManagementScreen.showUserManagement();
	}
	public void Edit() {
		String Query = "Select * from users where User_name = '"+UserName.getText()+"'";
		ResultSet rs = DataBaseOperation.ExecuteQueryGetResult(Query);
	    try {
			while(rs.next()) {
				if(rs.getString("User_Name").equalsIgnoreCase(UserName.getText())) {
					NewUserName.setText(rs.getString("User_Name"));
					NewEmailID.setText(rs.getString("Email_ID"));
					NewPassword.setText(rs.getString("Password"));
					NewUserRole.setText(rs.getString("User_Role"));
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	    
		
	}
}
