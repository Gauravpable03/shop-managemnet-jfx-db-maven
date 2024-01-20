package search_user;

import java.sql.ResultSet;
import java.sql.SQLException;
import db_operation.DataBaseOperation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import user_management.UserManagementScreen;

public class SearchUserController {
	
	@FXML
	private TextField User ;
	
	@FXML
	private TextField UserName ;
	
	@FXML
	private TextField EmailID ;
	
	@FXML
	private TextField Password ;
	
	@FXML
	private TextField User_Role ;
	
	@FXML
	private Button Search ;
	
	@FXML 
	private Button Close ;
	
	
	public void Search () {
		String Query = "Select * from users where User_name = '"+User.getText()+"'";
		ResultSet rs = DataBaseOperation.ExecuteQueryGetResult(Query);
	    try {
			while(rs.next()) {
				if(rs.getString("User_Name").equalsIgnoreCase(User.getText())) {
					UserName.setText(rs.getString("User_Name"));
					EmailID.setText(rs.getString("Email_ID"));
					Password.setText(rs.getString("Password"));
					User_Role.setText(rs.getString("User_Role"));
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void Close () {
		UserManagementScreen.showUserManagement();
	}
	
}
