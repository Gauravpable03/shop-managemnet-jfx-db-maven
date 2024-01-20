package add_user;

import db_operation.DataBaseOperation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import user_management.UserManagementScreen;
public class AddUserController {

	@FXML
	private TextField UserName;

	@FXML
	private TextField EmailID;

	@FXML
	private TextField Password;

	@FXML
	private TextField UserRole;

	@FXML
	private Button Close;

	@FXML
	private Button Save;

	public void Close(ActionEvent event) {
		UserManagementScreen.showUserManagement();
      
	}
	public void Save(ActionEvent event) {
		String Query = "INSERT INTO users(User_Name , Email_ID ,Password ,User_Role) VALUES ('"+UserName.getText()+"' ,'"+EmailID.getText()+"' ,'"+Password.getText()+"' ,'"+UserRole.getText()+"') ";
		DataBaseOperation.ExecuteQuery(Query);
	}
	

}
