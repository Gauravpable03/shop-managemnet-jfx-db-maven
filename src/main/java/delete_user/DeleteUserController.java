package delete_user;

import db_operation.DataBaseOperation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import user_management.UserManagementScreen;

public class DeleteUserController {
	
	@FXML
	private TextField UserName ;
	
	@FXML
	private Button Delete ;
	
	@FXML
	private Button Close ;
	
	public void Close() {
		UserManagementScreen.showUserManagement();
	}
	public void Delete() {
		 String Query = "delete from users where User_Name='"+ UserName.getText() +"'";
		 DataBaseOperation.ExecuteQuery(Query);
	}

}
